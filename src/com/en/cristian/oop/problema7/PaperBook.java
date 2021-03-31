package com.en.cristian.oop.problema7;

public class PaperBook extends Book {
    private int stock;
    private String nameOfShopStore;
    private String addressOfShopStore;
    private double costTransport;

    public PaperBook(String title, String author, double price, int stock, String nameOfShopStore, String addressOfShopStore, double costTransport) {
        super(title, author, price);
        this.stock = stock;
        this.nameOfShopStore = nameOfShopStore;
        this.addressOfShopStore = addressOfShopStore;
        this.costTransport = costTransport;
    }

    public void applyShippingCost(double cost){
        price+=cost;
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

    public String getAddressOfShopStore() {
        return addressOfShopStore;
    }

    public void setAddressOfShopStore(String addressOfShopStore) {
        this.addressOfShopStore = addressOfShopStore;
    }

    public double getCostTransport() {
        return costTransport;
    }

    public void setCostTransport(double costTransport) {
        this.costTransport = costTransport;
    }

    @Override
    public double calcPrice() {
        super.calcPrice();
        return price+costTransport;
    }
}
