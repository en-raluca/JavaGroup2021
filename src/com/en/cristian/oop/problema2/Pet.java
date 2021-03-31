package com.en.cristian.oop.problema2;

public class Pet {
    private String nume;
    private String rasa;

    public Pet(String nume, String rasa) {
        this.nume = nume;
        this.rasa = rasa;
    }

    public void play() {
        System.out.println("Pet-urile au un nume: " + nume + " si o rasa: " + rasa);
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

    @Override
    public String toString() {
        return "nume " + nume + ", rasa " + rasa;
    }

}
