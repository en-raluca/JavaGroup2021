package com.en.andrada.Tema3.ex6;

public class ProdAccesoriu extends Produs {
    private String marime;

    public ProdAccesoriu(int id, String nume, double pret, String marime) {
        super(id, nume, pret);
        this.marime = marime;
    }

    public String getMarime() {
        return marime;
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }
}
