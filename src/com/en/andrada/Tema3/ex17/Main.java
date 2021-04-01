package com.en.andrada.Tema3.ex17;

public class Main {
    public static void main(String[] args){
        Square patrat = new Square(8);
        int p1= patrat.getPerimeter();
        int a1= patrat.getArea();
        System.out.println("Perimetrul patratului cu latura "+patrat.getLungimeLatura() +" este " +p1 +" iar aria este "+a1);

        Rectangle dreptunghi = new Rectangle(2,9);
        int p2=dreptunghi.getPerimeter();
        int a2= dreptunghi.getArea();
        System.out.println("Perimetrul dreptunghiului cu lungimea " + dreptunghi.getLungime()+
                " si latimea " + dreptunghi.getLatime() + " este "+p2+" iar aria este "+a2);
    }
}
