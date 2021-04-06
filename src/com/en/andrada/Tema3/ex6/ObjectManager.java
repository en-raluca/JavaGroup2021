package com.en.andrada.Tema3.ex6;

import java.util.ArrayList;
import java.util.List;

public class ObjectManager {
    public List<Produs> filterProductsByPrice(List<Produs> productList, double pret){
        List<Produs> newProductList = new ArrayList<Produs>();
        for (Produs produs:productList){
            if(produs.getPret()<pret){
                newProductList.add(produs);
            }
        }
        return newProductList;
    }
    public Produs findProductById(List<Produs> productList, int id){
        Produs result = new Produs(0,"nume",0);
        for (Produs produs:productList){
            if(produs.getId()==id){
                result =  produs;
            }
        }
        return result;
    }
    public String findProductNameById(List<Produs> productList, int id){
        String name = "";
        for(Produs produs:productList){
            if(produs.getId()==id) {
                name = produs.getNume();
            }
        }
        return name;
    }
    public boolean searchProductByName(List<Produs> productList, String nume){
        boolean result = false;
        for (Produs produs:productList){
            if(produs.getNume().equals(nume)){
                result = true;
            }
        }
        return result;
    }
    public boolean searchProductByModel(List<ProdElectronic> productList, String model){
        boolean result = false;
        for(ProdElectronic produs:productList){
            if(produs.getModel().equals(model)){
                result = true;
            }
        }
        return result;
    }
}
