package org.example.builder;

public class SportsCarBuilder implements ICarBuilder {
    private Engine engine;
    private int doorsNumber;

    private Transmission transmission;

    private CarType type;

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    public SportsCar build() {
        return new SportsCar(this.engine, this.doorsNumber, this.transmission, this.type);
    }
}
