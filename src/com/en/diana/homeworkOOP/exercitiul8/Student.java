package com.en.diana.homeworkOOP.exercitiul8;

public class Student {
    private String nume;
    private int anInscriere;

    public Student(String nume, int anInscriere) {
        this.nume = nume;
        this.anInscriere = anInscriere;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getAnInscriere() {
        return anInscriere;
    }

    public void setAnInscriere(int anInscriere) {
        this.anInscriere = anInscriere;
    }

    public void showStudentDetails() {
    }

    @Override
    public String toString() {
        return "Nume: " + nume + " anul inscrierii: " + anInscriere;
    }
}
