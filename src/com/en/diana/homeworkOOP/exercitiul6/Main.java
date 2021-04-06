package com.en.diana.homeworkOOP.exercitiul6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //tema OOP
//        ProdAlimentar faina = new ProdAlimentar(89, "faina", 2.99, 500);
//        ProdAccesoriu sacosa = new ProdAccesoriu(99, "geanta", 199.99, 'M');
//        ProdElectronic cafetira = new ProdElectronic(90, "cafetiera", 500, "italiano");
//        System.out.println(faina.getGramaj());
//        faina.setGramaj(1000);
//        System.out.println(faina.getGramaj());
//        sacosa.setPret(300);
//        cafetira.applyDiscount(20);
//        System.out.println(cafetira.toString());
//        sacosa.applyDiscount(20);
//        faina.applyDiscount(1.70);
//
//        //training, polymorphism
//        Produs ulei = new ProdAlimentar(89, "ulei", 2.99, 500);
//        Produs cafet = new ProdElectronic(90, "cafetiera", 90, "italiano");
//        System.out.println(ulei.getPret());
//        ulei.applyDiscount(10);
//        System.out.println(ulei.getPret());
//        System.out.println(cafet.getPret());
//        cafet.applyDiscount(20);
//        System.out.println(cafet.getPret());
//        ProdAlimentar prod2 = (ProdAlimentar) ulei;
//        double rez = prod2.getGramaj();
//        System.out.println(rez);
//        //  cand nu stim ce e in spatele variabilei
//        if (cafet instanceof ProdElectronic) {
//            ProdElectronic prod = (ProdElectronic) cafet;
//        }
//
//        ObjectManager manager = new ObjectManager();
//        boolean uleiulEsteGratis = manager.checkIfProductIsFree(ulei);
//        System.out.println(uleiulEsteGratis);
//        boolean cafetEsteGratis = manager.checkIfProductIsFree(cafet);
//        System.out.println(cafetEsteGratis);

        //exercitiul 10 Collections
        /*- filtreaza lista de produse avand pretul mai ieftin decat un pret dat ca parametru
        public List<Produs> filterProductsByPrice(List<Produs> productList, double pret) */
        //Construire obiecte tip ProdusAlimentar
        ProdAlimentar faina = new ProdAlimentar(89, "faina", 2.99, 250);
        ProdAlimentar ulei = new ProdAlimentar(90, "ulei", 6.99, 500);
        ProdAlimentar zahar = new ProdAlimentar(91, "zahar", 4.99, 500);
        //Creare lista de obieste tip ProdusAlimentar
        List<ProdAlimentar> productList = new ArrayList<ProdAlimentar>();
        productList.add(0, faina);
        productList.add(1, ulei);
        productList.add(2, zahar);
        ObjectManager manager = new ObjectManager();
        List<ProdAlimentar> rezultPriceLower = manager.filterProductsByPrice(productList, 5);
        System.out.println(rezultPriceLower);

        //exercitiul 10 Collections
        /*- cauta in lista de produse produsul care are un anumit id dat ca parametru
        public Produs findProductById(List<Produs> productList, int id)*/
        manager.findProductById(productList, 90);

        //exercitiul 11 Collections
        /*- cauta in lista de produse numele produsului care are un anumit id dat ca parametru
        public String findProductNameById(List<Produs> productList, int id) */
        String rezultNamById = manager.findProductNameById(productList, 90);
        System.out.println(rezultNamById);

        //exercitiul 12 Collections
        /*- verifica daca exista in lista de produse un produs cu numele dat ca parametru
        public boolean searchProductByName(List<Produs> productList, String nume) */
        boolean rezultHasName = manager.searchProductByName(productList, "zahar");
        System.out.println(rezultHasName);

        //exercitiul 13 Collections
        /*- verifica daca exista in lista de produse un produs care are modelul dat ca parametru
        public boolean searchProductByModel(List<ProdusElectronic> productList, String model) */
        //Construire obiecte tip ProdusElectronic
        ProdElectronic tv = new ProdElectronic(93, "tv", 992.99, "Samsung");
        ProdElectronic ceas = new ProdElectronic(94, "ceas", 699.99, "Garmin");
        ProdElectronic laptop = new ProdElectronic(95, "laptop", 498.99, "Lenovo");
        //Creare lista de obieste tip ProdusElectronic
        List<ProdElectronic> productElectronicList = new ArrayList<ProdElectronic>();
        productElectronicList.add(0, tv);
        productElectronicList.add(1, ceas);
        productElectronicList.add(2, laptop);
        boolean modelByName = manager.searchProductByModel(productElectronicList, "Garmin");
        System.out.println(modelByName);
    }
}

