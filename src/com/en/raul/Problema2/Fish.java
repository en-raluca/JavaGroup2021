package com.en.raul.Problema2;

public class Fish extends Pet{
    public Fish(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void play(){
        System.out.println("Pestele inoata in acvariu");
    }
}
