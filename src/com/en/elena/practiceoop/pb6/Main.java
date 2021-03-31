package com.en.elena.practiceoop.pb6;

public class Main {
    public static void main(String[] args) {
        ProdAccesoriu accesoriu1 = new ProdAccesoriu(1, "Ring", 2000, "XS");
        ProdAlimentar alimentar1 = new ProdAlimentar(1, "Milk", 2,500);
        ProdElectronic electronic1 = new ProdElectronic(1, "Oven", 2500, "Extra");
        System.out.println(accesoriu1.applyDiscount(20));
        System.out.println(alimentar1.getNume().toString());
        System.out.println(electronic1.getNume().toString() + " Discout " + electronic1.applyDiscount(60));



    }
}
