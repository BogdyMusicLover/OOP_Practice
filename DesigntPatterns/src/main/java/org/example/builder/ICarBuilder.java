package org.example.builder;

public interface ICarBuilder {
    void setEngine(Engine engine);

    void setDoorsNumber(int doorsNumber);

    void setTransmission(Transmission transmission);

    void setCarType(CarType type);
}
