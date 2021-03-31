package com.en.cristian.oop.problema6;

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
    public double applyDiscount(double discount) {
        return discount * 0.5;
    }
}
