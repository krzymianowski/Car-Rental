package com.krzymianowski.application;

import com.krzymianowski.application.model.car.*;
import com.krzymianowski.application.service.car.*;
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

    @Autowired
    private TransmissionService transmissionService;

    @Autowired
    private DrivingGearService drivingGearService;

    public void initDatabaseItems() {
        CreateCar("Manual", 230, "2.3 TDI", 210d, "Disabled", "White", "Diesel", "Cabriolet", "C5 B8", "Audi", Arrays.asList("temp-car.jpg", "temp-car-2.jpg", "temp-car-3.jpg"));
        CreateCar("Automat", 120, "4.0 ecopower", 124.5d, "Available", "Black", "PB-98", "SUV", "GLA-45", "Mercedes", Arrays.asList("temp-car.jpg", "temp-car-5.jpg"));
        CreateCar("Manual", 180, "Potato 2.0", 238.8d, "Available", "Black", "PB-98", "SUV", "A4", "Audi", new ArrayList<>());
    }

    private void CreateCar(String transName, int hp, String engine, double rentPrice, String statusName, String colorName, String fuelTypeName, String typeName, String modelName, String brandName, List<String> imagesNames) {
        State state = getState(statusName, "Lorem ipsum dolor, sit amet consectetur adipisicing elit.");

        Color color = getColor(colorName);

        FuelType fuelType = getFuelType(fuelTypeName);

        Type type = getType(typeName, "Lorem ipsum dolor, sit amet consectetur adipisicing elit.");

        Model model = getModel(modelName, brandName);

        List<Image> images = getImages(imagesNames);

        Transmission transmission = getTransmission(transName);

        DrivingGear drivingGear = getDrivingGear("4x4");

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
                .rentPrice(rentPrice)
                .images(images)
                .horsePower(hp)
                .engine(engine)
                .rating(Rating.builder().economy(4).comfort(3).power(5).build())
                .fullDescription("BMW Series 4, XDrive <br> Gran Coupe Hatchback <br> naped na 4 kola <br> Model MSport <br> 245KM <br> mozliwosc" +
                        "jazdy w 3 trybach: normal, sport (jazda dynamiczna) i economy (tryb oszczedzania paliwa) <br> kolor: biel alpejska" +
                        "+ czarna folia carbo na dachu i lusterkach<br> kola 19\" obrecze ze stopu lekkiego<br> opony RunFlat<br> manualna" +
                        "skrzynia biegow<br> wnetrze: skora Sensatec kolor czarny + listwy wykonczeniowe carbon aluminium z elemenami niebieskimi" +
                        "<br> podgrzewana sportowa kierownica<br> podgrzewane sportowe fotele przednie<br> pakiet dodatkowych schowkow i" +
                        "uchwytow na napoje<br> doskonaly dzwiek dzieki zestawowi HI FI Harman Kardon Surround Sound<br> Head UP" +
                        "<br> Nawigacja" +
                        "<br> Bluetooth, mozliwosc zintegrowania telefonu z systemem glosnomowiacym<br> BMW Connected Drive Advanced<br>" +
                        "<br> Przyciemniana szyba tylna oraz tylne szyby boczne<br> Czujnik parkowania przodu i tylu<br> Kamera cofania<br>Tempomat" +
                        "<br> Czujnik deszczu<br><br> Samochod zakupiony w salonie w Polsce i serwisowany w BMW - ostatni przeglad - sierpien'18" +
                        "<br> Jeden wlasciel, bezwypadkowy<br> Garazowany" +
                        "<br> Auto bardzo dynamiczne i znakomicie trzymajace sie drogi<br> Malo uzywany, przebieg 31 000 km<br>")
                .transmission(transmission)
                .drivingGear(drivingGear)
                .build();

        carService.save(car);
    }

    private DrivingGear getDrivingGear(String drivingGearName) {
        DrivingGear drivingGear = drivingGearService.getDrivingGearByDrivingGearName(drivingGearName);

        if (drivingGear == null) {
            drivingGear = DrivingGear.builder().drivingGearName(drivingGearName).build();
            drivingGearService.save(drivingGear);
        }
        return drivingGear;
    }


    private Transmission getTransmission(String transmissionName) {
        Transmission transmission = transmissionService.getTransmissionByTransmissionName(transmissionName);

        if (transmission == null) {
            transmission = Transmission.builder().transmissionName(transmissionName).build();
            transmissionService.save(transmission);
        }
        return transmission;
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