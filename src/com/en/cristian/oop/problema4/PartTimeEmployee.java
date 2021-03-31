package com.en.cristian.oop.problema4;

public class PartTimeEmployee extends Employee {
    private double nrOfHoursWorked;
    private double pricePerHour;

    public PartTimeEmployee(String name, String address, double nrOfHoursWorked, double pricePerHour) {
        super(name, address);
        this.nrOfHoursWorked = nrOfHoursWorked;
        this.pricePerHour = pricePerHour;
    }

    public double getNrOfHoursWorked() {
        return nrOfHoursWorked;
    }

    public void setNrOfHoursWorked(double nrOfHoursWorked) {
        this.nrOfHoursWorked = nrOfHoursWorked;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    @Override
    public double calculatePay() {
        System.out.println("Salary for PartTimeEmployee is: ");
        return nrOfHoursWorked * pricePerHour;

    }
}
