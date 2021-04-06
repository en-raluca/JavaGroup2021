package com.en.andrada.Tema3.ex6;

public class ProdAlimentar extends Produs implements Discounteable {
    private double gramaj;

    public ProdAlimentar(int id, String nume, double pret, double gramaj) {
        super(id, nume, pret);
        this.gramaj = gramaj;
    }

    public double getGramaj() {
        return gramaj;
    }

    public void setGramaj(double gramaj) {
        this.gramaj = gramaj;
    }
    @Override
    public void applyDiscount(double discount){
        double pret = this.getPret();
        pret = pret - (pret*discount)/100;
        System.out.println("The price after discount is "+pret);
    }
}
