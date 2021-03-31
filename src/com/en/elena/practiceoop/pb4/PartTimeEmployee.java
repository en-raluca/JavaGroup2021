package com.en.elena.practiceoop.pb4;

public class PartTimeEmployee extends Employee{
    private int nrOfHoursWorked;
    private double pricePerHour;

    public PartTimeEmployee(String name, String address, int nrOfHoursWorked, double pricePerHour) {
        super(name, address);
        this.nrOfHoursWorked = nrOfHoursWorked;
        this.pricePerHour = pricePerHour;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "nrOfHoursWorked=" + nrOfHoursWorked +
                ", pricePerHour=" + pricePerHour +
                '}';
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

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
}
