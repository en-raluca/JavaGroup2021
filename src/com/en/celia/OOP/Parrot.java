package com.en.celia.OOP;

public class Parrot extends Pet implements Pets{
    public Parrot(String name, String breed) {
        super(name, breed);
    }


    @Override
    public void play() {
        System.out.println("papagalul canta");
    }
}
