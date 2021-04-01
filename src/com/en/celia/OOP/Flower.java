package com.en.celia.OOP;

public class Flower extends Plant {
    private String culoare;
    private int nrPetale;

    public Flower(String name, String culoare, int nrPetale) {
        super(name);
        this.culoare = culoare;
        this.nrPetale = nrPetale;
    }

    public String getCuloare() {

        return culoare;
    }

    public int getNrPetale() {

        return nrPetale;
    }

    public void setCuloare(String culoare) {

        this.culoare = culoare;
    }

    public void setNrPetale(int nrPetale) {

        this.nrPetale = nrPetale;
    }

    @Override
    public void saySomethingSpecialAbout() {
        super.saySomethingSpecialAbout();
        System.out.println("Life is the flower for which love is the honey!");
    }

}
