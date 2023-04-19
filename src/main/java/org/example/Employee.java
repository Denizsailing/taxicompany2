package org.example;


class Employee {
    protected String name;
    protected String employeeId;
    protected String position;

    public Employee(String name, String employeeId, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

