package com.en.celia.OOP;

public class ProdusElectronic extends Product{
    private String model;
    private String culoare;

    public ProdusElectronic(String nume, String categorie, double pret,int id, String model, String culoare){
        super(nume, categorie, pret,id);
        this.model = model;
        this.culoare = culoare;
    }

    @Override
    public void showProductInfo(){
        super.showProductInfo();
        System.out.println("modelul este " + model + "culoarea este " + culoare);
    }
}
