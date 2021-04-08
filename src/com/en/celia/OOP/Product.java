package com.en.celia.OOP;

public class Product {
    private String name;
    private String category;
    private double price;
    private int id;

    public Product(String name, String category, double price, int id) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.id = id;
    }

    public void showProductInfo() {
        System.out.println("Produsul cu numele:" + " " + name + "din categoria " + " " + category + " " + "are pretul " + price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setNume(String nume) {
        this.name = nume;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    //pt set
    @Override
    public String toString() {

        return "id: " + id + "nume= " + name + ", categorie= " + category + ", pret= " + price;
    }

    @Override
    public boolean equals(Object o){
        Product product = (Product) o;
        return product.getId()==id;
    }
    @Override
    public int hashCode(){
        return 31*id;
    }
}
