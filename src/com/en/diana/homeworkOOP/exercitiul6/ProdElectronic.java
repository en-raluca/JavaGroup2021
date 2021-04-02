package com.en.diana.homeworkOOP.exercitiul6;

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

    @Override
    public void applyDiscount(double discount) {
        double pretulActual = getPret();
        if (pretulActual >= 100) {
            double noulPret = pretulActual - discount * pretulActual / 100;
            setPret(noulPret);
        }
    }
}

