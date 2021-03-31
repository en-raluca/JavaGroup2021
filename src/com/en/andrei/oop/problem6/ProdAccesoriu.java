package com.en.andrei.oop.problem6;

/**
 * Created by atpop on 31 Mar 2021
 */

public class ProdAccesoriu extends Produs {

    private char marime;

    public ProdAccesoriu(int id, String nume, double pret, char marime) {
        super(id, nume, pret);
        this.marime = marime;
    }

    public char getMarime() {
        return marime;
    }

    public void setMarime(char marime) {
        this.marime = marime;
    }

    @Override
    public void applyDiscount() {
        super.applyDiscount();
    }
}
