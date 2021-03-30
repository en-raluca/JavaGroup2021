package com.en.raul.Problema1;


public class Flower extends Plant {
    String culoare;
    int nrPetale;
    public Flower(String culoare,int nrPetale,String name) {
        super(name);
        this.culoare=culoare;
        this.nrPetale=nrPetale;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getNrPetale() {
        return nrPetale;
    }

    public void setNrPetale(int nrPetale) {
        this.nrPetale = nrPetale;
    }

    @Override
    public void saySomethingSpecialAbout(){
        System.out.println("Life is the flower for which love is the honey!");
    }
}
