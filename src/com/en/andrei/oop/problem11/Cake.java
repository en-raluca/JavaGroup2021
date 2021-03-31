package com.en.andrei.oop.problem11;

/**
 * Created by atpop on 31 Mar 2021
 */

public class Cake extends Food {

    private double pricePerKg;

    public Cake(String name, char size, double pricePerKg) {
        super(name, size);
        this.pricePerKg = pricePerKg;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    @Override
    public double calculatePrice() {
        return getSize() * pricePerKg;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "pricePerKg=" + pricePerKg +
                '}';
    }
}
