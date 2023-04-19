package org.example;

class ElectricTaxi extends Taxi {
    protected double electricDiscount;

    public ElectricTaxi(String driverName, String licensePlate, int passengerCapacity, double electricDiscount) {
        super(driverName, licensePlate, passengerCapacity);
        this.electricDiscount = electricDiscount;
    }

    public double getElectricDiscount() {
        return electricDiscount;
    }

    public void setElectricDiscount(double electricDiscount) {
        this.electricDiscount = electricDiscount;
    }

    @Override
    public double calculateFare() {
        return electricDiscount;
    }
}