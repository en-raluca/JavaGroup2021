package com.en.andrei.oop.problem2;

/**
 * Created by atpop on 31 Mar 2021
 */

public class Dog extends Pet {

    public Dog(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void play() {
        System.out.println("cainele alearga in curte");
    }
}
