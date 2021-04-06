package com.en.andrada.Tema3.ex6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ProdAlimentar cafea = new ProdAlimentar(3,"cafea",12.5,500);
        cafea.applyDiscount(5);

        //lista cu produse
        Produs produs1=new Produs(1,"ciocolata",2.5);
        Produs produs2=new Produs(7,"zahar",4);
        Produs produs3=new Produs(10,"frigider",800);
        Produs produs4=new Produs(3,"faina",3);
        Produs produs5=new Produs(12,"laptop",2000);
        ProdElectronic produs6=new ProdElectronic(15,"Tv",3000,"samsung");
        ProdElectronic produs7=new ProdElectronic(16,"aragaz",1500,"electrolux");


        List<Produs> listaProduse = new ArrayList<Produs>();
        listaProduse.add(produs1);
        listaProduse.add(produs2);
        listaProduse.add(produs3);
        listaProduse.add(produs4);
        listaProduse.add(produs5);

        List<ProdElectronic> listaProduseElectronice = new ArrayList<ProdElectronic>();
        listaProduseElectronice.add(produs6);
        listaProduseElectronice.add(produs7);

        ObjectManager manager = new ObjectManager();
        List<Produs> newList= manager.filterProductsByPrice(listaProduse,100);
        for (Produs prod:newList){
            System.out.println(prod.getNume()+" "+prod.getPret());
        }
        Produs prod= manager.findProductById(listaProduse,12);
        System.out.println(prod.getNume());

        String prod2 = manager.findProductNameById(listaProduse,10);
        System.out.println(prod2);
        boolean result2 = manager.searchProductByName(listaProduse,"frigider");
        System.out.println(result2);

        boolean result = manager.searchProductByModel(listaProduseElectronice,"samsung");
        System.out.println(result);
     }
}
