package com.en.andrei.oop.problem17;

/**
 * Created by atpop on 31 Mar 2021
 */

public class Square extends Shape {

    private int latura;

    public Square(int latura) {
        this.latura = latura;
    }

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }

    @Override
    public int getPerimeter() {
        return latura * 4;
    }

    @Override
    public int getArea() {
        return latura * latura;
    }
}
