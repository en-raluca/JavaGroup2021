package com.en.celia.OOP;

public class FullTimeEmployee extends Employee implements CalculareSalar{
    private double monthlySalary;

    public FullTimeEmployee(String name, String address, double monthlySalary) {
        super(name, address);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {

        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {

        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString(){
        return "Nume " + getName() + ", adresa " + getAddress() + ", salariul lunar: " + monthlySalary;
    }

    @Override
    public void calculatePay() {
        System.out.println(monthlySalary);
    }

}
