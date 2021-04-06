package com.en.andrei.oop.problem4;

/**
 * Created by atpop on 31 Mar 2021
 */

public class PartTimeEmployee extends Employee {

    private int nrOfHoursWorked;
    private int pricePerHour;


    public PartTimeEmployee(String name, String address, String employeeId, int nrOfHoursWorked, int pricePerHour) {
        super(name, address, employeeId);
        this.nrOfHoursWorked = nrOfHoursWorked;
        this.pricePerHour = pricePerHour;
    }

    @Override
    public double calculatePay() {
        return nrOfHoursWorked * pricePerHour;
    }

    public int getNrOfHoursWorked() {
        return nrOfHoursWorked;
    }

    public void setNrOfHoursWorked(int nrOfHoursWorked) {
        this.nrOfHoursWorked = nrOfHoursWorked;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
}
