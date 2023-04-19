package org.example;

class LuxuryTaxi extends Taxi {
    protected double luxurySurcharge;

    public LuxuryTaxi(String driverName, String licensePlate, int passengerCapacity, double luxurySurcharge) {
        super(driverName, licensePlate, passengerCapacity);
        this.luxurySurcharge = luxurySurcharge;
    }

    public double getLuxurySurcharge() {
        return luxurySurcharge;
    }

    public void setLuxurySurcharge(double luxurySurcharge) {
        this.luxurySurcharge = luxurySurcharge;
    }

    @Override
    public double calculateFare() {
        return luxurySurcharge;
    }
}