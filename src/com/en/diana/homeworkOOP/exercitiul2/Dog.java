package com.en.diana.homeworkOOP.exercitiul2;

public class Dog extends Pet {

    public Dog(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void play() {

        System.out.println("catelul alearga in curte");
    }
}
