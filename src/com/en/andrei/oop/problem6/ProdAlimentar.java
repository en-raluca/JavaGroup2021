package com.en.andrei.oop.problem6;

/**
 * Created by atpop on 31 Mar 2021
 */

public class ProdAlimentar extends Produs{

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
    public void applyDiscount() {
        super.applyDiscount();
    }
}
