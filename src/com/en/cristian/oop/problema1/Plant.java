package com.en.cristian.oop.problema1;

public class Plant {
    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public void saySomethingSpecialAbout() {
        System.out.println("The Plant is: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + name;
    }

}
