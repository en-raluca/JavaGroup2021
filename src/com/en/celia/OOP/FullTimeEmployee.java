package com.en.celia.OOP;

public class FullTimeEmployee extends Employee {
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
    public void calculatePay() {
        super.calculatePay();
        System.out.println(monthlySalary);
    }

}
