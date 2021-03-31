package com.en.andrei.oop.problem17;

/**
 * Created by atpop on 31 Mar 2021
 */

public class Rectangle extends Shape {

    private int lungime;
    private int latime;

    public Rectangle(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    @Override
    public int getPerimeter() {
        return (lungime * 2) + (latime * 2);
    }

    @Override
    public int getArea() {
        return lungime * latime;
    }
}
