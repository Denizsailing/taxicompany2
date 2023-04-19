package org.example;
import java.util.Objects;
class BoatTaxi extends Taxi {
    protected String boatType;

    public BoatTaxi(String driverName, String licensePlate, int passengerCapacity, String boatType) {
        super(driverName, licensePlate, passengerCapacity);
        this.boatType = boatType;
    }

    public String getBoatType() {
        return boatType;
    }

    public void setBoatType(String boatType) {
        this.boatType = boatType;
    }

    @Override
    public String toString() {
        return "BoatTaxi{" +
                "driverName='" + driverName + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", boatType='" + boatType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoatTaxi)) return false;
        if (!super.equals(o)) return false;
        BoatTaxi boatTaxi = (BoatTaxi) o;
        return Objects.equals(getBoatType(), boatTaxi.getBoatType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBoatType());
    }

    @Override
    public double calculateFare() {
        return 0;
    }
}
