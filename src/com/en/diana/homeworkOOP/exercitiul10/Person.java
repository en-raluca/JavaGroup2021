package com.en.diana.homeworkOOP.exercitiul10;

public class Person {
    private String nume;
    private String prenume;
    private String adresa;

    public Person(String nume, String prenume, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
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

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void showPersonDetails() {
    }

    @Override
    public String toString() {
        return "Numele este " + nume + ", prenumele " + prenume + " si adresa " + adresa;
    }
}
