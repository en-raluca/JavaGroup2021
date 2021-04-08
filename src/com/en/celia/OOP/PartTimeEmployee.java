package com.en.celia.OOP;

public class PartTimeEmployee extends Employee implements CalculareSalar{
    private int nrOfHoursWorked;
    private double pricePerHour;

    public PartTimeEmployee(String name, String address, int nrOfHoursWorked, double pricePerHour, String employeeId) {
        super(name, address,employeeId);
        this.nrOfHoursWorked = nrOfHoursWorked;
        this.pricePerHour = pricePerHour;
    }

    public int getNrOfHoursWorked() {
        return nrOfHoursWorked;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setNrOfHoursWorked(int nrOfHoursWorked) {
        this.nrOfHoursWorked = nrOfHoursWorked;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    @Override
    public String toString(){
        return "Nume " + getName() + ", adresa " + getAddress() + ", nr of hours worked: " + nrOfHoursWorked + ", price per hour" + pricePerHour;
    }

    @Override
    public void calculatePay() {
        System.out.println(nrOfHoursWorked * pricePerHour);
    }


}
