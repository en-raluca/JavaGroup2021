package com.en.diana.homeworkOOP.exercitiul7;

public class PaperBook extends Book {
    private int stock;
    private String nameOfShopStore;
    private String adressOfShopStorek;
    private double costTransport;

    public PaperBook(String title, String author, double price, int stock, String nameOfShopStore, String adressOfShopStorek) {
        super(title, author, price);
        this.stock = stock;
        this.nameOfShopStore = nameOfShopStore;
        this.adressOfShopStorek = adressOfShopStorek;
        this.costTransport = costTransport;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNameOfShopStore() {
        return nameOfShopStore;
    }

    public void setNameOfShopStore(String nameOfShopStore) {
        this.nameOfShopStore = nameOfShopStore;
    }

    public String getStocadressOfShopStorek() {
        return adressOfShopStorek;
    }

    public void setStocadressOfShopStorek(String stocadressOfShopStorek) {
        this.adressOfShopStorek = stocadressOfShopStorek;
    }

    public double getCostTransport() {
        return costTransport;
    }

    public void setCostTransport(double costTransport) {
        this.costTransport = costTransport;
    }

    public double applyShippingCost(double cost) {
        return price += cost;
    }

    @Override
    public double calcPrice() {
        return price + costTransport;
    }
}

