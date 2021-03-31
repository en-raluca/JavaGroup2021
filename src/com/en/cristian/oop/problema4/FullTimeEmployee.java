package com.en.cristian.oop.problema4;

public class FullTimeEmployee extends Employee{
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
    public double calculatePay() {
        //super.calculatePay();
        System.out.println("Salary for FullTimeEmployee is: ");
        return monthlySalary;
    }
}
