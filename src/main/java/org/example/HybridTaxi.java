package org.example;

class HybridTaxi extends ElectricTaxi {
    protected double hybridSurcharge;

    public HybridTaxi(String driverName, String licensePlate, int passengerCapacity, double electricDiscount, double hybridSurcharge) {
        super(driverName, licensePlate, passengerCapacity, electricDiscount);
        this.hybridSurcharge = hybridSurcharge;
    }

    // Getters and setters
}