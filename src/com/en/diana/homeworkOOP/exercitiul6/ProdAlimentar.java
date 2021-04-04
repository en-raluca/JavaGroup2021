package com.en.diana.homeworkOOP.exercitiul6;

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
    public void applyDiscount(double discount) {
        double pretulActual = getPret();
        double noulPret = pretulActual - discount * pretulActual / 100;
        setPret(noulPret);

    }
}

