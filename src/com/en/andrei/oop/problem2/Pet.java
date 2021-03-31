package com.en.andrei.oop.problem2;

/**
 * Created by atpop on 31 Mar 2021
 */

public class Pet {

    private String nume;
    private String rasa;

    public Pet(String nume, String rasa) {
        this.nume = nume;
        this.rasa = rasa;
    }

    public void play() {

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
}
