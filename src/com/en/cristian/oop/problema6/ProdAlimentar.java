package com.en.cristian.oop.problema6;

public class ProdAlimentar extends Produs {
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
    public double applyDiscount(double discount) {
        return getPret() * discount;
    }
}
