package org.example;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("denizzz", "123123213", "Driver");
        SupportStaff supportStaff = new SupportStaff("arda", "b123", "Customer Support", "Support");


        Address address = new Address("alsancak izmir", "izmir", "10");
        Customer customer = new Customer("johnnny12", "5432203", address);

        // information
        System.out.println("Employee: " + employee.getName() + ", " + employee.getEmployeeId() + ", " + employee.getPosition());
        System.out.println("SupportStaff: " + supportStaff.getName() + ", " + supportStaff.getEmployeeId() + ", " + supportStaff.getPosition() + ", " + supportStaff.getDepartment());
        System.out.println("Customer: " + customer.getName() + ", " + customer.getPhoneNumber() + ", " + customer.getAddress().getStreet() + ", " + customer.getAddress().getCity() + ", " + customer.getAddress().getZipCode());

        // Modify p
        employee.setName("gunduz");
        employee.setEmployeeId("abc");
        employee.setPosition("Assistant Driver");

        supportStaff.setName("arda");
        supportStaff.setEmployeeId("123");
        supportStaff.setPosition("Technical Support");
        supportStaff.setDepartment("Tech Support");

        customer.setName("denis");
        customer.setPhoneNumber("353453453");
        customer.getAddress().setStreet("cesme");
        customer.getAddress().setCity("izmir");
        customer.getAddress().setZipCode("123");

        // updated
        System.out.println("\nUpdated Employee: " + employee.getName() + ", " + employee.getEmployeeId() + ", " + employee.getPosition());
        System.out.println("Updated SupportStaff: " + supportStaff.getName() + ", " + supportStaff.getEmployeeId() + ", " + supportStaff.getPosition() + ", " + supportStaff.getDepartment());
        System.out.println("Updated Customer: " + customer.getName() + ", " + customer.getPhoneNumber() + ", " + customer.getAddress().getStreet() + ", " + customer.getAddress().getCity() + ", " + customer.getAddress().getZipCode());
    }
}
