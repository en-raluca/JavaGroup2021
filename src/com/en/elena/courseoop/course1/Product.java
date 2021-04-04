package com.en.elena.courseoop.course1;

public class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price){
        this.name = name;
        this.category = category;
        this.price = price;


    }
    //getters
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void getCategory(String category){
        this.category = category;
    }
    public void getPrice(double price){
        if(price > 0){
            this.price = price;
        }
    }


}
