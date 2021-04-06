package com.en.raul.Problema4;

public class PartTimeEmployee extends Employee{
    int nrOfHoursWorked;
    double pricePerHour;

    public PartTimeEmployee(String name, String address, int nrOfHoursWorked, double pricePerHour) {
        super(name, address);
        this.nrOfHoursWorked = nrOfHoursWorked;
        this.pricePerHour = pricePerHour;
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

    @Override
    public void calculatePay(){
        System.out.println("Salarul lunar va fi: "+ nrOfHoursWorked*pricePerHour);
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", nrOfHoursWorked=" + nrOfHoursWorked +
                ", pricePerHour=" + pricePerHour +
                '}';
    }
}
