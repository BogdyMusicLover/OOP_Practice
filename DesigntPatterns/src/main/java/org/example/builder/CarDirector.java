package org.example.builder;

public class CarDirector {
    public void buildSportsCar(ICarBuilder carBuilder) {
        carBuilder.setCarType(CarType.HATCH);
        carBuilder.setDoorsNumber(2);
        carBuilder.setEngine(new Engine(2000, Fuel.GASOLINE, 4));
        carBuilder.setTransmission(new Transmission(6, TransmissionType.MANUAL));
    }

    public void buildFamilyCar(ICarBuilder carBuilder) {
        carBuilder.setCarType(CarType.FAMILY);
        carBuilder.setDoorsNumber(4);
        carBuilder.setEngine(new Engine(1600, Fuel.DIESEL, 4));
        carBuilder.setTransmission(new Transmission(8, TransmissionType.AUTOMATIC));
    }
}
