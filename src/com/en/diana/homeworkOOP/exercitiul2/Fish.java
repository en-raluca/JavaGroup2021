package com.en.diana.homeworkOOP.exercitiul2;

public class Fish extends Pet {
    public Fish(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void play() {
        System.out.println("pestele inoata in acvariu");
    }
}
