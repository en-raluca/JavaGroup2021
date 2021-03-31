package com.en.cristian.oop.problema6;


public class Main {
    public static void main(String[] args) {
        Produs prod1 = new Produs(1, "telefon", 2099);
        System.out.println("Discount-el pentru produs este: " + prod1.applyDiscount(0.35));

        ProdAccesoriu prodAccesoriu = new ProdAccesoriu(1, "Nokia", 899, 'M');
        System.out.println("Discount-el pentru accesoriu produs este: " + prodAccesoriu.applyDiscount(0.3));

        ProdElectronic produsElectronic = new ProdElectronic(2, "Nokia", 589, "E81");
        System.out.println("Discount-el pentru produs electronic este: " + produsElectronic.applyDiscount(0.2));

        ProdAlimentar produsAlimentar = new ProdAlimentar(3, "varza", 2.3, 1.6);
        System.out.println("Discount-el pentru produs alimentar este: " + produsAlimentar.applyDiscount(1));
    }
}
