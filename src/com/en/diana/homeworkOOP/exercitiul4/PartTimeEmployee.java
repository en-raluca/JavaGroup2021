package com.en.diana.homeworkOOP.exercitiul4;


public class PartTimeEmployee extends Employee implements SalaryCalculation {
    private int nrOfHoursWorked;
    private double pricePerHour;

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


    public double calculatePay() {
        return nrOfHoursWorked * pricePerHour;
    }

    @Override
    public double increaseSalary() {
        return 0;
    }

}

