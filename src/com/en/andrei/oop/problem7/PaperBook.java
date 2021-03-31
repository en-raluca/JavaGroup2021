package com.en.andrei.oop.problem7;

/**
 * Created by atpop on 31 Mar 2021
 */

public class PaperBook extends Book {

    private boolean stock;
    private String nameOfShopStore;
    private String addressOfShopStore;

    public PaperBook(String title, String author, double price, boolean stock, String nameOfShopStore, String addressOfShopStore) {
        super(title, author, price);
        this.stock = stock;
        this.nameOfShopStore = nameOfShopStore;
        this.addressOfShopStore = addressOfShopStore;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
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

    public double applyShippingCost(double cost) {
        return this.getPrice() + cost;
    }

    @Override
    public double calcPrice() {
        double price = getPrice();
        double costTransport = applyShippingCost(10);
        return price + costTransport;
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "stock=" + stock +
                ", nameOfShopStore='" + nameOfShopStore + '\'' +
                ", addressOfShopStore='" + addressOfShopStore + '\'' +
                '}';
    }
}
