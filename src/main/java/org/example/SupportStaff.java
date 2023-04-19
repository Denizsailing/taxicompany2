package org.example;

class SupportStaff extends Employee {
    protected String department;

    public SupportStaff(String name, String employeeId, String position, String department) {
        super(name, employeeId, position);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
