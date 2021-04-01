package com.en.celia.OOP;


// stock, nameOfShopStore, adressOfShopStore, applyShippingCost(double cost){price += cost;}
public class PaperBook extends Book {
    private int stock;
    private String nameOfShopStore;
    private String adressOfShopStore;

    public PaperBook(String title, String author, double price, int stock, String nameOfShopStore, String adressOfShopStore) {
        super(title, author, price);
        this.stock = stock;
        this.nameOfShopStore = nameOfShopStore;
        this.adressOfShopStore = adressOfShopStore;
    }

    public int getStock() {
        return stock;
    }

    public String getNameOfShopStore() {
        return nameOfShopStore;
    }

    public String getAdressOfShopStore() {
        return adressOfShopStore;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setNameOfShopStore(String nameOfShopStore) {
        this.nameOfShopStore = nameOfShopStore;
    }

    public void setAdressOfShopStore(String adressOfShopStore) {
        this.adressOfShopStore = adressOfShopStore;
    }

    public void applyShippingCost(double cost) {
        this.setPrice(this.getPrice() + cost);
    }

    @Override
    public double calcPrice() {
        System.out.println("Paper book's stock: " + getStock() + " name of shop store is " + getNameOfShopStore()+"and address: " + getAdressOfShopStore());
        applyShippingCost(8);
        return getPrice();
    }


}

