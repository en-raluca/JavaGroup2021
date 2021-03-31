package com.en.andrei.oop.problem1;

/**
 * Created by atpop on 31 Mar 2021
 */

public class Flower extends Plant {

    private String colour;
    private int nrPetale;

    public Flower(String name, String colour, int nrPetale) {
        super(name);
        this.colour = colour;
        this.nrPetale = nrPetale;
    }

    @Override
    public void saySomethingSpecialAbout() {
        System.out.println("Life is the flower for which love is the honey!");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNrPetale() {
        return nrPetale;
    }

    public void setNrPetale(int nrPetale) {
        this.nrPetale = nrPetale;
    }
}
