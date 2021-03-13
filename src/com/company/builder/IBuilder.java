package com.company.builder;

public interface IBuilder {
    void reset();

    void setSeats(int count);

    void setEngineVolume(float volume);

    void setTripComputer(String computer);

    void setGPS(String gps);

}
