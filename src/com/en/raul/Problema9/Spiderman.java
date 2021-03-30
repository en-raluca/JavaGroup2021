package com.en.raul.Problema9;

public class Spiderman extends Hero{
    public Spiderman(String name, String power, String costumeColor) {
        super(name, power, costumeColor);
    }

    @Override
    public void launchThePower(){
        System.out.println("Puterea "+power+ " a fost lansata de spiderman!");
    }
}
