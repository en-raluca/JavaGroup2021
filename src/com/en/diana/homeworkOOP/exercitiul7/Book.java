package com.en.diana.homeworkOOP.exercitiul7;

public class Book {
    private String title;
    private String author;
    protected double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calcPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Titie: " + title + ", author: " + author + ", price: " + price;
    }
}

