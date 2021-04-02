package com.en.diana.homeworkOOP.exercitiul4;


public class FullTimeEmployee extends Employee implements SalaryCalculation {
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
        return monthlySalary;
    }

    @Override
    public double increaseSalary() {
        double salaryPlus = monthlySalary + PERCENT_OF_ENCREASING * monthlySalary / 100;
        return salaryPlus;
    }
}
