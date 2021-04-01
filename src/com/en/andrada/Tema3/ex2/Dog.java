package com.en.andrada.Tema3.ex2;

public class Dog extends Pet {
    private String culoare;

    public Dog(String nume, String rasa, String culoare){
        super(nume,rasa);
        this.culoare=culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }
    @Override
    public void play(){
        System.out.println(getNume()+" alearga in curte");
    }
}
