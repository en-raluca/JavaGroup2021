package com.en.raul.Problema9;

public class Superman extends Hero{
    String specialPower;

    public Superman(String name, String power, String costumeColor, String specialPower) {
        super(name, power, costumeColor);
        this.specialPower = specialPower;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }

    public void launchTheSpecialPower(){
        System.out.println("The special power "+specialPower+ " has been lauched!");
    }

    @Override
    public void launchThePower(){
        System.out.println("Puterea "+power+ " a fost lansata de superman!");
    }
}
