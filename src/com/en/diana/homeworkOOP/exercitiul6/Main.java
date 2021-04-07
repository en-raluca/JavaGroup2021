package com.en.diana.homeworkOOP.exercitiul6;

import com.en.diana.homeworkOOP.exercitiul10.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //-----------------------TEMA 3 OOP-----------------

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

        //-----------------------TEMA 4 COLLECTIONS-----------------------

        //exercitiul 10 Collections
        /*- filtreaza lista de produse avand pretul mai ieftin decat un pret dat ca parametru
        public List<Produs> filterProductsByPrice(List<Produs> productList, double pret) */
        //Construire obiecte tip ProdusAlimentar
        ProdAlimentar faina1 = new ProdAlimentar(89, "faina", 2.99, 250);
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

//---------------------------TEMA 5 SET,MAP--------------------------

        Produs paste = new ProdAlimentar(1, "paste", 2.99, 500);
        Produs orez = new ProdAlimentar(2, "orez", 90, 1000);
        Person femeie = new Person(1, "ana", "maria", "cluj");
        Person barbat = new Person(2, "pop", "ioan", "cluj");
        Order comanda1 = new Order("1", paste, femeie);
        Order comanda2 = new Order("2", orez, barbat);
        Map<String, Order> orderMap = new HashMap();
        orderMap.put(comanda1.getId(), comanda1);
        orderMap.put(comanda2.getId(), comanda2);
        System.out.println("Mapul initial este: " + orderMap);
        System.out.println("Produsul a fost cumparat de: " + manager.calcNrOfBuyingAProduct(orderMap, 2) + " ori!");
        System.out.println("Suma comenzilor persoanei este de: " + manager.sumOfPersonOrders(orderMap, 1));
        System.out.println("Id-urile comenzilor sale: " + manager.returnIdsOfPersonsOrder(orderMap, 2));
        System.out.println("Noul map este format din : " + manager.getPersonsOrderId(orderMap, 1));
        System.out.println("Map-ul nou este: " + manager.changedMap(orderMap));

    }
}


