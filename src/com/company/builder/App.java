package com.company.builder;

public class App {
    public void makeCar() {
        var director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        Manual manual = carManualBuilder.getResult();

        System.out.println(car);
        System.out.println(manual);
    }
}
