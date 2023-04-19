package org.example;

public class TaxiCompany {
    public static void main(String[] args) {
        StandardTaxi standardTaxi = new StandardTaxi("deniz", "122323", 4, 10.0);
        LuxuryTaxi luxuryTaxi = new LuxuryTaxi("justynaaa", "123323", 4, 20.0);
        ElectricTaxi electricTaxi = new ElectricTaxi("oyku", "123123", 4, 5.0);

        //  taxi information
        System.out.println("Standard Taxi: " + standardTaxi);
        System.out.println("Luxury Taxi: " + luxuryTaxi);
        System.out.println("Electric Taxi: " + electricTaxi);

        // Modify
        standardTaxi.setDriverName("deniz2");
        standardTaxi.setLicensePlate("555555");
        standardTaxi.setPassengerCapacity(5);
        standardTaxi.setBaseFare(12.0);

        luxuryTaxi.setDriverName("justyna2");
        luxuryTaxi.setLicensePlate("3123123123123132");
        luxuryTaxi.setPassengerCapacity(5);
        luxuryTaxi.setLuxurySurcharge(25.0);

        electricTaxi.setDriverName("oyku2");
        electricTaxi.setLicensePlate("3132123");
        electricTaxi.setPassengerCapacity(5);
        electricTaxi.setElectricDiscount(7.0);

        //  updated taxi
        System.out.println("\nUpdated Standard Taxi: " + standardTaxi);
        System.out.println("Updated Luxury Taxi: " + luxuryTaxi);
        System.out.println("Updated Electric Taxi: " + electricTaxi);
    }
}
