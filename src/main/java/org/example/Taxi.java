package org.example;
import java.util.Objects;

abstract class Taxi {
    protected String driverName;
    protected String licensePlate;
    protected int passengerCapacity;

    public Taxi(String driverName, String licensePlate, int passengerCapacity) {
        this.driverName = driverName;
        this.licensePlate = licensePlate;
        this.passengerCapacity = passengerCapacity;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "driverName='" + driverName + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Taxi)) return false;
        Taxi taxi = (Taxi) o;
        return getPassengerCapacity() == taxi.getPassengerCapacity() &&
                getDriverName().equals(taxi.getDriverName()) &&
                getLicensePlate().equals(taxi.getLicensePlate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDriverName(), getLicensePlate(), getPassengerCapacity());
    }

    public abstract double calculateFare();
}

