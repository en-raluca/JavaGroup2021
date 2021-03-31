package com.en.cristian.oop.problema1;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------problema1------------------------------------------------");
        Flower flower1 = new Flower("Crin", "alb", 6);
        flower1.saySomethingSpecialAbout();
        System.out.println("Flower " + flower1.getName() + " has color " + flower1.getCuloare() + "!");
        Tree tree1 = new Tree("Con", 6.5, 15);
        tree1.saySomethingSpecialAbout();
        System.out.println("Tree " + tree1.getName() + " has height " + tree1.getHeight() + "!");
    }
}
