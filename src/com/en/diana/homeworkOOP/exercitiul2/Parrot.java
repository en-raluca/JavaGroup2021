package com.en.diana.homeworkOOP.exercitiul2;

public class Parrot extends Pet {
    public Parrot(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void play() {

        System.out.println("papagalul canta");
    }
}