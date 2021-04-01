package com.en.diana.Homework3OOP;

/*4)parent class Employee: name, address
                             void calculatePay() - suprascrieti aceasta metoda in subclase
    child classes   - FullTimeEmployee: monthlySalary, calculatePay(){return monthlySalary;}
                     - PartTimeEmployee: nrOfHoursWorked, pricePerHour, calculatePay(){return nrOfHoursWorked *
                      pricePerHour;}*/
public abstract class Employee {
    private String name;
    private String address;

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
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

    public abstract double calculatePay();

    @Override
    public String toString() {
        return "name" + name + "address" + address;
    }
}
