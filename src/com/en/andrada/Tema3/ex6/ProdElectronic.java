package com.en.andrada.Tema3.ex6;

public class ProdElectronic extends Produs {
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
}
