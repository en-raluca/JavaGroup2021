package com.en.raul.Problema2;

public class Pet {
    String nume;
    String rasa;

    public Pet(String nume, String rasa) {
        this.nume = nume;
        this.rasa = rasa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void play(){
        System.out.println("Play with " +nume);
    }
}
