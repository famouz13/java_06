package com.company.builder;

public class CarManualBuilder implements IBuilder {
    private Manual manual;

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int count) {
        this.manual.setSeats(count);
    }

    @Override
    public void setEngineVolume(float volume) {
        this.manual.setEngineVolume(volume);
    }

    @Override
    public void setTripComputer(String computer) {
        this.manual.setTripComputer(computer);
    }

    @Override
    public void setGPS(String gps) {
        this.manual.setGPS(gps);
    }

    public Manual getResult() {
        return this.manual;
    }
}
