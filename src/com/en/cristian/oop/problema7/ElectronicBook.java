package com.en.cristian.oop.problema7;

public class ElectronicBook extends Book{
    private String nameOfWebsiteShop;
    private  String format;

    public ElectronicBook(String title, String author, double price, String nameOfWebsiteShop, String format) {
        super(title, author, price);
        this.nameOfWebsiteShop = nameOfWebsiteShop;
        this.format = format;
    }

    public String getNameOfWebsiteShop() {
        return nameOfWebsiteShop;
    }

    public void setNameOfWebsiteShop(String nameOfWebsiteShop) {
        this.nameOfWebsiteShop = nameOfWebsiteShop;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public double calcPrice() {
        return price;
    }
}
