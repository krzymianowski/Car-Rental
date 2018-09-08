package com.krzymianowski.application;

import com.krzymianowski.application.model.*;
import com.krzymianowski.application.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class InitTempData {

    @Autowired
    private StateService stateService;

    @Autowired
    private ColorService colorService;

    @Autowired
    private FuelTypeService fuelTypeService;

    @Autowired
    private TypeService typeService;

    @Autowired
    private BrandService brandService;

    @Autowired
    private ModelService modelService;

    @Autowired
    private CarService carService;

    public void initDatabaseItems() {
        CreateCar("Disabled", "White", "Diesel", "Cabriolet", "C5 B8", "Audi", Arrays.asList("temp-car.jpg", "temp-car-2.jpg", "temp-car-3.jpg"));
        CreateCar("Available", "Black", "PB-98", "SUV", "GLA-45", "Mercedes", Arrays.asList("temp-car.jpg", "temp-car-5.jpg"));
    }

    private void CreateCar(String statusName, String colorName, String fuelTypeName, String typeName, String modelName, String brandName, List<String> imagesNames) {
        State state = getState(statusName, "Lorem ipsum dolor, sit amet consectetur adipisicing elit.");

        Color color = getColor(colorName);

        FuelType fuelType = getFuelType(fuelTypeName);

        Type type = getType(typeName, "Lorem ipsum dolor, sit amet consectetur adipisicing elit.");

        Model model = getModel(modelName, brandName);

        List<Image> images = getImages(imagesNames);

        Car car = Car.builder()
                .model(model)
                .type(type)
                .fuelType(fuelType)
                .color(color)
                .state(state)
                .productionDate(new Date())
                .description("Lorem ipsum dolor, sit amet consectetur adipisicing elit. Est eaque magni sit dolores. Nisi, dolor nam modi perspiciatis consequatur soluta.")
                .mileage(111111)
                .fuelCondition(0.5f)
                .rentPrice(140.4d)
                .images(images)
                .build();

        carService.save(car);
    }

    private List<Image> getImages(List<String> images) {
        List<Image> tempImages = new ArrayList<>();
        for (String url : images) {
            Image image = Image.builder().url(url).build();
            tempImages.add(image);
        }
        return tempImages;
    }

    private State getState(String stateName, String description) {
        State state = stateService.getStateByStateName(stateName);
        if (state == null) {
            state = State.builder().stateName(stateName).description(description).build();
            stateService.save(state);
        }
        return state;
    }

    private Color getColor(String colorName) {
        Color color = colorService.getColorByColorName(colorName);

        if (color == null) {
            color = Color.builder().colorName(colorName).build();
            colorService.save(color);
        }
        return color;
    }

    private FuelType getFuelType(String fuelTypeName) {
        FuelType fuelType = fuelTypeService.getFuelTypeByTypeName(fuelTypeName);

        if (fuelType == null) {
            fuelType = FuelType.builder().typeName(fuelTypeName).build();
            fuelTypeService.save(fuelType);
        }
        return fuelType;
    }


    private Type getType(String typeName, String description) {
        Type type = typeService.getTypeByTypeName(typeName);

        if (type == null) {
            type = Type.builder().typeName(typeName).description(description).build();
            typeService.save(type);
        }
        return type;
    }

    private Model getModel(String modelName, String brand_name) {

        Brand brand = brandService.getBrandByBrandName(brand_name);
        if (brand == null) {
            brand = Brand.builder().brandName(brand_name).build();
            brandService.save(brand);
        }

        Model model = modelService.getModelByBrandAndModelName(brand, modelName);
        if (model == null) {
            model = Model.builder().modelName(modelName).brand(brand).build();
            modelService.save(model);
        }

        return model;
    }
}