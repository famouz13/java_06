package com.company.builder;

public class CarBuilder implements IBuilder {
    private Car car;

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int count) {
        this.car.setSeats(count);
    }

    @Override
    public void setEngineVolume(float volume) {
        this.car.setEngineVolume(volume);
    }

    @Override
    public void setTripComputer(String computer) {
        this.car.setTripComputer(computer);
    }

    @Override
    public void setGPS(String gps) {
        this.car.setGPS(gps);
    }

    public Car getResult() {
        return this.car;
    }
}
