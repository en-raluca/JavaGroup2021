package com.en.andrada.Tema3.ex17;

public class Square extends Shape {
    private int lungimeLatura;
    public Square(int lungimeLatura){
        this.lungimeLatura=lungimeLatura;
    }

    public int getLungimeLatura() {
        return lungimeLatura;
    }

    public void setLungimeLatura(int lungimeLatura) {
        this.lungimeLatura = lungimeLatura;
    }
    @Override
    public int getPerimeter(){
        int P=lungimeLatura*4;
        return P;
    }
    @Override
    public int getArea(){
        int A=lungimeLatura*lungimeLatura;
        return A;
    }
}
