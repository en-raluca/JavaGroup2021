package com.en.andrada.Tema3.ex17;

public class Rectangle extends Shape {
    private int lungime;
    private int latime;

    public Rectangle(int lungime, int latime){
        this.lungime=lungime;
        this.latime=latime;
    }

    public int getLungime() {
        return lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }
    @Override
    public int getPerimeter(){
        int P=(lungime+latime)*2;
        return P;
    }
    public int getArea(){
        int A=lungime*latime;
        return A;
    }
}
