package com.en.diana.homeworkOOP.exercitiul2;

public abstract class Pet {
    private String nume;
    private String rasa;

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

    public abstract void play();

    @Override
    public String toString() {
        return "Numele: " + nume + ", rasa: " + rasa;
    }
}

