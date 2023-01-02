package org.example.builder;

public class Car {

    private Engine engine;
    private int doorsNumber;
    private Transmission transmission;
    private CarType type;

    public Car(Engine engine, int doorsNumber, Transmission transmission, CarType type) {
        this.engine = engine;
        this.doorsNumber = doorsNumber;
        this.transmission = transmission;
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public CarType getType() {
        return type;
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

    public static class CarBuilder {
        private Engine engine;
        private int doorsNumber;
        private Transmission transmission;
        private CarType type;

        public Car build() {
            return new Car(this.engine, this.doorsNumber, this.transmission, this.type);
        }

        public CarBuilder engine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder doorsNumber(int doorsNumber) {
            this.doorsNumber = doorsNumber;
            return this;
        }

        public CarBuilder transmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public CarBuilder type(CarType type) {
            this.type = type;
            return this;
        }

    }
}
