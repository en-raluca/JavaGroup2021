package com.en.celia.OOP;

public class ProdusVestimentar extends Product{
    private char marime;

    public ProdusVestimentar(String nume, String categorie,int id, double pret, char marime){
        super(nume, categorie, pret,id);
        this.marime = marime;
    }
}
