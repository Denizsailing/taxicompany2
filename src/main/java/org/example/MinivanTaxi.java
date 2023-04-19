package org.example;

class MinivanTaxi extends StandardTaxi {
    protected boolean hasChildSeat;

    public MinivanTaxi(String driverName, String licensePlate, int passengerCapacity, double baseFare, boolean hasChildSeat) {
        super(driverName, licensePlate, passengerCapacity, baseFare);
        this.hasChildSeat = hasChildSeat;
    }

    public boolean isHasChildSeat() {
        return hasChildSeat;
    }

    public void setHasChildSeat(boolean hasChildSeat) {
        this.hasChildSeat = hasChildSeat;
    }
}