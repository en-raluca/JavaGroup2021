package com.en.andrei.oop.problem11;

/**
 * Created by atpop on 31 Mar 2021
 */

public class Pizza extends Food {

    private double pricePerBuc;

    public Pizza(String name, char size, double pricePerBuc) {
        super(name, size);
        this.pricePerBuc = pricePerBuc;
    }

    public double getPricePerBuc() {
        return pricePerBuc;
    }

    public void setPricePerBuc(double pricePerBuc) {
        this.pricePerBuc = pricePerBuc;
    }

    @Override
    public double calculatePrice() {
        return getSize() + pricePerBuc;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pricePerBuc=" + pricePerBuc +
                '}';
    }
}
