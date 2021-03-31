package com.en.raul.Problema5;

public class Persoana {
    String nume,prenume;

    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
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

    public void showPersonalDetails(){
        System.out.println("Numele este: "+nume+" iar prenumele "+prenume);
    }
}
