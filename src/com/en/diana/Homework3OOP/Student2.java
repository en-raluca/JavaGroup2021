package com.en.diana.Homework3OOP;

public class Student2 extends Person{
    public int yearOfStudy;
    public int nrMatricol;

    public Student2(String nume, String prenume, String adresa, int yearOfStudy, int nrMatricol) {
        super(nume, prenume, adresa);
        this.yearOfStudy = yearOfStudy;
        this.nrMatricol = nrMatricol;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getNrMatricol() {
        return nrMatricol;
    }

    public void setNrMatricol(int nrMatricol) {
        this.nrMatricol = nrMatricol;
    }

    @Override
    public void showPersonDetails() {
        super.showPersonDetails();
    }
}
