package com.en.celia.OOP;

public class Parrot extends Pet {
    public Parrot(String nume, String rasa) {
        super(nume, rasa);
    }


    @Override
    public void play() {
        super.play();
        System.out.println("papagalul canta");
    }
}
