package com.krzymianowski.application;

import com.krzymianowski.application.model.*;
import com.krzymianowski.application.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

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
        State state = getState("Disabled", "Lorem ipsum dolor, sit amet consectetur adipisicing elit.");

        Color color = getColor("White");

        FuelType fuelType = getFuelType("Diesel");

        Type type = getType("Cabriolet", "Lorem ipsum dolor, sit amet consectetur adipisicing elit.");

        Model model = getModel("C5 B8", "Audi");

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
                .build();

        carService.save(car);
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
