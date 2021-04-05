package com.en.andrei.oop.problem4;

/**
 * Created by atpop on 31 Mar 2021
 */

public class Employee {

    private String employeeId;
    private String name;
    private String address;

    public Employee(String employeeId, String name, String address) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
    }

    public Employee(String name, String address) {
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double calculatePay() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        Employee employee = (Employee) o;
        boolean isEmployee = false;
        if (employee.getEmployeeId().equals(this.employeeId)) {
            isEmployee = true;
        }
        return isEmployee;
    }

    @Override
    public int hashCode() {
        return 31 * employeeId.hashCode();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
