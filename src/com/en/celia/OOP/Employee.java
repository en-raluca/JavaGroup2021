package com.en.celia.OOP;

public class Employee {
    private String name;
    private String address;
    private String employeeId;

    public Employee(String name, String address, String employeeId) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    @Override
    public boolean equals(Object o){
        Employee employee = (Employee) o;
        boolean isEmployee = false;
        if(employee.getEmployeeId().equals(this.employeeId)){
            isEmployee = true;
        }
        return isEmployee;
    }

    @Override
    public int hashCode(){
        return 31 * employeeId.hashCode();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
