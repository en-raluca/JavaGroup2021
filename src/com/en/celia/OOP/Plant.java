package com.en.celia.OOP;

public class Plant {
    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void saySomethingSpecialAbout() {
        System.out.println("To plant a " + " " + name + " " + "is to believe in tomorrow!");
    }
}
