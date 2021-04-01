package com.en.andrada.Tema3.ex2;

public class Pet {
    private String nume;
    private String rasa;
    public Pet(String nume, String rasa){
        this.nume=nume;
        this.rasa=rasa;
    }

    public String getNume() {
        return nume;
    }

    public String getRasa() {
        return rasa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
    public void play(){
        System.out.println("");
    }
}
