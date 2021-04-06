package com.en.raul.Tema5Map;

public class Product {
    private String nume;
    private String categorie;
    private double pret;
    private int id;

    public Product(String nume, String categorie, double pret,int id) {
        this.nume = nume;
        this.categorie = categorie;
        this.pret = pret;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        if (pret > 0) {
            this.pret = pret;
        }
    }


    public void showProductInfo() {
        System.out.println("Produsul cu numele: " + nume + " din categoria " + categorie + " cu pretul " + pret);
    }

    @Override
    public String toString() {
        return "Numele este " + nume + ", categoria este " + categorie + ", pret " + pret;
    }
}
