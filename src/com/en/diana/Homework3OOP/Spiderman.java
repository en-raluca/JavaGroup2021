package com.en.diana.Homework3OOP;

public class Spiderman extends Hero{
    public String launchThePower;

    public Spiderman(String name, String power, String costumeColor, String launchThePower) {
        super(name, power, costumeColor);
        this.launchThePower = launchThePower;
    }

    public String getLaunchThePower() {
        return launchThePower;
    }

    public void setLaunchThePower(String launchThePower) {
        this.launchThePower = launchThePower;
    }
}
