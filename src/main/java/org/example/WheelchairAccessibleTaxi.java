package org.example;

class WheelchairAccessibleTaxi extends StandardTaxi {
    protected boolean hasRamp;

    public WheelchairAccessibleTaxi(String driverName, String licensePlate, int passengerCapacity, double baseFare, boolean hasRamp) {
        super(driverName, licensePlate, passengerCapacity, baseFare);
        this.hasRamp = hasRamp;
    }

    public boolean isHasRamp() {
        return hasRamp;
    }

    public void setHasRamp(boolean hasRamp) {
        this.hasRamp = hasRamp;
    }
}