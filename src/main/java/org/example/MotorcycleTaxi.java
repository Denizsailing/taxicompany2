package org.example;
import java.util.Objects;
class MotorcycleTaxi extends Taxi {
    protected String motorcycleBrand;

    public MotorcycleTaxi(String driverName, String licensePlate, int passengerCapacity, String motorcycleBrand) {
        super(driverName, licensePlate, passengerCapacity);
        this.motorcycleBrand = motorcycleBrand;
    }

    public String getMotorcycleBrand() {
        return motorcycleBrand;
    }

    public void setMotorcycleBrand(String motorcycleBrand) {
        this.motorcycleBrand = motorcycleBrand;
    }

    @Override
    public String toString() {
        return "MotorcycleTaxi{" +
                "driverName='" + driverName + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", motorcycleBrand='" + motorcycleBrand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MotorcycleTaxi)) return false;
        if (!super.equals(o)) return false;
        MotorcycleTaxi motorcycleTaxi = (MotorcycleTaxi) o;
        return Objects.equals(getMotorcycleBrand(), motorcycleTaxi.getMotorcycleBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMotorcycleBrand());
    }

    @Override
    public double calculateFare() {
        return 0;
    }
}