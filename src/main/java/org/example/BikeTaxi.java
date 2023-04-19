package org.example;

class BikeTaxi extends Taxi {
    protected double bikeSurcharge;

    public BikeTaxi(String driverName, String licensePlate, int passengerCapacity, double bikeSurcharge) {
        super(driverName, licensePlate, passengerCapacity);
        this.bikeSurcharge = bikeSurcharge;
    }

    // Getters and setters

    @Override
    public double calculateFare() {
        return bikeSurcharge;
    }
}