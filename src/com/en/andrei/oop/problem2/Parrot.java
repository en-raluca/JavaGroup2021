package com.en.andrei.oop.problem2;

/**
 * Created by atpop on 31 Mar 2021
 */

public class Parrot extends Pet {

    public Parrot(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void play() {
        System.out.println("papagalul canta");
    }
}
