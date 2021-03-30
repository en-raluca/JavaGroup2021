package com.en.raul.Problema2;

public class Cat extends Pet{

    public Cat(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void play(){
        System.out.println("Pisica toarce");
    }
}
