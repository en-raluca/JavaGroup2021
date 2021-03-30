package com.en.raul.Problema4;

public class FullTimeEmployee extends Employee{
    double monthlySalary;

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
    public void calculatePay(){
        System.out.println("Salarul lunar va fi: "+monthlySalary);
    }
}
