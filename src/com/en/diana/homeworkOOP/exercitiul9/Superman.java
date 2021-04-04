package com.en.diana.homeworkOOP.exercitiul9;


public class Superman extends Hero {
    public String specialPower;
    public String launchThePower;

    public Superman(String name, String power, String costumeColor, String specialPower, String launchThePower) {
        super(name, power, costumeColor);
        this.specialPower = specialPower;
        this.launchThePower = launchThePower;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }

    public String getLaunchThePower() {
        return launchThePower;
    }

    public void setLaunchThePower(String launchThePower) {
        this.launchThePower = launchThePower;
    }

    @Override
    public void launchThePower() {
        super.launchThePower();
    }
}
