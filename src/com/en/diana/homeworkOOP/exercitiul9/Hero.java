package com.en.diana.homeworkOOP.exercitiul9;

public class Hero {
    private String name;
    private String power;
    private String costumeColor;

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

    public void launchThePower() {
    }

    @Override
    public String toString() {
        return "Numele eroului este " + name + ", puterea lui este " + power + " si are costumul cu " + costumeColor;
    }
}

