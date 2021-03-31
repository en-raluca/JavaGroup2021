package com.en.andrei.oop.problem11;

/**
 * Created by atpop on 31 Mar 2021
 */

public abstract class Food {

    private String name;
    private double size;

    public Food(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double calculatePrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
