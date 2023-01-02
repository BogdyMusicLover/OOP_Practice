package org.example.builder;

public class Main {
    public static void main(String[] args) {

        // complex version

        CarDirector director = new CarDirector();
        SportsCarBuilder sportsCarBuilder = new SportsCarBuilder();
        FamilyCarBuilder familyCarBuilder = new FamilyCarBuilder();

        director.buildFamilyCar(familyCarBuilder);
        director.buildSportsCar(sportsCarBuilder);

        FamilyCar familyCar = familyCarBuilder.build();
        SportsCar sportsCar = sportsCarBuilder.build();

        familyCar.print();
        System.out.println("==================");
        sportsCar.print();

        // second version

        System.out.println("-------------------------");

        Car car = new Car.CarBuilder()
                .doorsNumber(4)
                .engine(new Engine(1000, Fuel.GASOLINE, 3))
                .transmission(new Transmission(5, TransmissionType.MANUAL))
                .type(CarType.MINI)
                .build();
        car.print();
    }
}
