package com.en.diana.homeworkOOP.exercitiul6;

public class Main {
    public static void main(String[] args) {
        ProdAlimentar faina = new ProdAlimentar(89, "faina", 2.99, 500);
        ProdAccesoriu sacosa = new ProdAccesoriu(99, "geanta", 199.99, 'M');
        ProdElectronic cafetira = new ProdElectronic(90, "cafetiera", 500, "italiano");
        System.out.println(faina.getGramaj());
        faina.setGramaj(1000);
        System.out.println(faina.getGramaj());
        sacosa.setPret(300);
        cafetira.applyDiscount(20);
        System.out.println(cafetira.toString());
        sacosa.applyDiscount(20);
        faina.applyDiscount(1.70);

        //polymorphism
        Produs ulei = new ProdAlimentar(89, "ulei", 2.99, 500);
        Produs cafet = new ProdElectronic(90, "cafetiera", 90, "italiano");
        System.out.println(ulei.getPret());
        ulei.applyDiscount(10);
        System.out.println(ulei.getPret());
        System.out.println(cafet.getPret());
        cafet.applyDiscount(20);
        System.out.println(cafet.getPret());
        ProdAlimentar prod2 = (ProdAlimentar) ulei;
        double rez = prod2.getGramaj();
        System.out.println(rez);
        //  cand nu stim ce e in spatele variabilei
        if (cafet instanceof ProdElectronic) {
            ProdElectronic prod = (ProdElectronic) cafet;
        }

        ObjectManager manager = new ObjectManager();
        boolean uleiulEsteGratis = manager.checkIfProductIsFree(ulei);
        System.out.println(uleiulEsteGratis);
        boolean cafetEsteGratis = manager.checkIfProductIsFree(cafet);
        System.out.println(cafetEsteGratis);
    }
}
