package com.en.raul.Problema9;

public class Batman extends Hero{
    public Batman(String name, String power, String costumeColor) {
        super(name, power, costumeColor);
    }

    @Override
    public void launchThePower(){
        System.out.println("Puterea "+power+ " a fost lansata de batman!");
    }
}
