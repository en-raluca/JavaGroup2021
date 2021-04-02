package com.en.diana.homeworkOOP.exercitiul9;

public class Batman extends Hero {
    public String launchThePower;

    public Batman(String name, String power, String costumeColor, String launchThePower) {
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
