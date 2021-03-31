package com.en.diana.Homework3OOP;

public class Professor extends Person{
    public double salary;

    public Professor(String nume, String prenume, String adresa, double salary) {
        super(nume, prenume, adresa);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void showPersonDetails() {
        super.showPersonDetails();
    }
}
