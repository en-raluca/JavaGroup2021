package com.en.cristian.oop.map;

public class Product {
    private String nume;
    private String categorie;
    private double price;
    private int prodID;

    public Product(String nume, String categorie, double price, int prodID) {
        this.nume = nume;
        this.categorie = categorie;
        this.price = price;
        this.prodID = prodID;
    }

    public void showProductInfo() {
        System.out.println("Produsul cu numele: " + nume + "din categoria: " + categorie + "are pretul: " + price + "Id: "+ prodID);
    }

    public int getProdId() {
        return prodID;
    }

    public void setProdId(int prodId) {
        this.prodID = prodId;
    }

    public String getNume() {
        return nume;
    }

    public String getCategorie() {
        return categorie;
    }

    public double getPrice() {
        return price;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "nume='" + nume + '\'' +
                ", categorie='" + categorie + '\'' +
                ", price=" + price +
                ", prodId='" + prodID + '\'' +
                '}';
    }
}
