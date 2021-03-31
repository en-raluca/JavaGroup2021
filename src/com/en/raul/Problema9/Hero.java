package com.en.raul.Problema9;

public class Hero {
    String name,power,costumeColor;

    public Hero(String name, String power, String costumeColor) {
        this.name = name;
        this.power = power;
        this.costumeColor = costumeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getCostumeColor() {
        return costumeColor;
    }

    public void setCostumeColor(String costumeColor) {
        this.costumeColor = costumeColor;
    }

    public void launchThePower(){
        System.out.println("Puterea "+power+ " a fost lansata!");
    }
}
