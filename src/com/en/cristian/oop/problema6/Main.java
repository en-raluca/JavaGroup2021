package com.en.cristian.oop.problema6;

import com.company.oop.ProdusAlimentar;
import com.company.oop.ProdusElectronic;

public class Main {
    public static void main(String[] args) {
        Produs prod1 = new Produs(1, "telefon", 2099);
        System.out.println(prod1.applyDiscount(0.35));
        ProdAccesoriu prodAccesoriu = new ProdAccesoriu(1, "Nokia", 899, 'M');
        ProdusElectronic produsElectronic =new ProdusElectronic("mixer", "bucatarie", 249, "Bosh", "Alb-Gri");
        System.out.println(produsElectronic);
        ProdusAlimentar produsAlimentar=new ProdusAlimentar("halva", "dulce", 6.3, 87);
    }
}
