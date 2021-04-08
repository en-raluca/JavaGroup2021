package com.en.celia.OOP;

public class ProdusAlimentar extends Product {
    private int kCal;

    public ProdusAlimentar(String nume, String categorie, double pret,int id, int kCal) {
        super(nume, categorie, pret,id);
        this.kCal = kCal;
    }

    public int getkCal() {
        return kCal;
    }

    public void setkCal(int kCal) {
        this.kCal = kCal;
    }

    @Override
    public void showProductInfo() {
        super.showProductInfo();
        System.out.println("nr de calorii este " + kCal);
    }

}
