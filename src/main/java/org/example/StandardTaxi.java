package org.example;

class StandardTaxi extends Taxi {
    protected double baseFare;

    public StandardTaxi(String driverName, String licensePlate, int passengerCapacity, double baseFare) {
        super(driverName, licensePlate, passengerCapacity);
        this.baseFare = baseFare;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }

    @Override
    public double calculateFare() {
        return baseFare;
    }
}