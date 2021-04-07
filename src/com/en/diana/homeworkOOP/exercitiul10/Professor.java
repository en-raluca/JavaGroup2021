package com.en.diana.homeworkOOP.exercitiul10;

public class Professor extends Person {
    public double salary;

    public Professor(int id, String nume, String prenume, String adresa, double salary) {
        super(id, nume, prenume, adresa);
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
