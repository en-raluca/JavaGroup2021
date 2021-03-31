package com.en.diana.Homework3OOP;

public class ProdElectronic extends Produs{
    private String model;

    public ProdElectronic(int id, String nume, double pret, String model) {
        super(id, nume, pret);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void applyDiscount(double discount) {
        super.applyDiscount(discount);
    }
}
