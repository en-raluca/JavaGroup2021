package com.en.elena.practiceoop.pb6;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        System.out.println("Lista este goala " + myList.isEmpty());
        myList.add("Rosu");
        myList.add("Verde");
        System.out.println(myList);
        System.out.println(myList.size());
        boolean result = myList.contains("Blue");
        System.out.println(result);
        String culoare = myList.get(1);
        System.out.println(culoare);
        System.out.println(myList.indexOf("Blue"));
        for(String s : myList){
            System.out.println(s);

        }

        Iterator<String> iterator = myList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



      /*  ProdAccesoriu accesoriu1 = new ProdAccesoriu(1, "Ring", 2000, "XS");
        ProdAlimentar alimentar1 = new ProdAlimentar(1, "Milk", 2,500);
        ProdElectronic electronic1 = new ProdElectronic(1, "Oven", 2500, "Extra");
        System.out.println(accesoriu1.applyDiscount(20));
        System.out.println(alimentar1.getNume().toString());
        System.out.println(electronic1.getNume().toString() + " Discout " + electronic1.applyDiscount(60));*/



    }
}
