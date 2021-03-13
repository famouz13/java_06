package com.company.builder;

public class Director {
    public void constructSportsCar(IBuilder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngineVolume(5);
        builder.setTripComputer("Autopilot");
        builder.setGPS("GPS");
    }
}
