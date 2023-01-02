package org.example.builder;

public class SportsCar {
    private Engine engine;
    private int doorsNumber;
    private Transmission transmission;
    private CarType type;

    public SportsCar(Engine engine, int doorsNumber, Transmission transmission, CarType type) {
        this.engine = engine;
        this.doorsNumber = doorsNumber;
        this.transmission = transmission;
        this.type = type;
    }



    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public void print() {
        System.out.println("Car type: " + type);
        System.out.println("Doors number: " + doorsNumber);
        System.out.println("Engine: ");
        System.out.println("\tDisplacement: " + engine.getDisplacement());
        System.out.println("\tNumber of cylinders: " + engine.getCylindersNumber());
        System.out.println("\tFuel: " + engine.getFuel());
        System.out.println("Transmission: ");
        System.out.println("\tType: " + transmission.getType());
        System.out.println("\tGears number: " + transmission.getGearsNumber());
    }
}
