package com.en.diana.homeworkOOP.exercitiul6;

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
    public void applyDiscount(double discount) {
        double pretulActual = getPret();
        double noulPret = pretulActual - discount * pretulActual / 100;
        setPret(noulPret);
    }
}

