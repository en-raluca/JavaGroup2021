package com.en.cristian.oop.problema5;

public class Persoana {
    private String nume;
    private String prenume;

    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public void showPersonDetails() {
        System.out.println("Fiecare persoana are un nume: " + nume + " si un prenume: " + prenume);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                '}';
    }
}
