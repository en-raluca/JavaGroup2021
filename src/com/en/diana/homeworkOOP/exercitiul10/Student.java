package com.en.diana.homeworkOOP.exercitiul10;

public class Student extends Person {
    public int yearOfStudy;
    public int nrMatricol;

    public Student(int id, String nume, String prenume, String adresa, int yearOfStudy, int nrMatricol) {
        super(id, nume, prenume, adresa);
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

