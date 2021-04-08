package com.en.cristian.oop;

import com.en.cristian.oop.map.Order;
import com.en.cristian.oop.map.Person;
import com.en.cristian.oop.map.Product;
import com.en.cristian.oop.problema1.Flower;
import com.en.cristian.oop.problema1.Tree;
import com.en.cristian.oop.problema2.Pet;
import com.en.cristian.oop.problema3.Animal;
import com.en.cristian.oop.problema4.Employee;
import com.en.cristian.oop.problema4.PartTimeEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ObjectManager {
    public List<Flower> filterFlowersByColor(List<Flower> flowerList, String color) {
        List<Flower> newFlowers = new ArrayList<Flower>();
        for (Flower f : flowerList) {
            if (f.getCuloare() == color) {
                newFlowers.add(f);
            }
        }
        return newFlowers;
    }

    public List<Tree> filterTreesByHeight(List<Tree> treeList, double height){
        List<Tree> newTrees=new ArrayList<Tree>();
        for (Tree t:treeList){
            if (t.getHeight()==height){
                newTrees.add(t);
            }
        }
        return newTrees;
    }

    public boolean searchPetByBreed(List<Pet> petList, String breed){
        boolean result=false;
        for (Pet p:petList){
            if (p.getRasa().equals(breed)){
                return true;
            }
        }
        return result;
    }

    public String findAnimalNameByCategory(List<Animal> animalList, String category) {
        String categ = null;
        for (Animal a : animalList) {
            if (a.getCategorie() == category) {
                categ = a.getNume();
            }
        }
        return categ;
    }

    public boolean searchEmployeeByAddress(List<Employee> employeeList, String address){
        boolean result=false;
        for (Employee e:employeeList){
            if (e.getAddress().equals(address)){
                return true;
            }
        }
        return result;
    }

    public List<PartTimeEmployee> filterEmployeeByNrOfHoursWorked(List<PartTimeEmployee> employeeList, int nrOfHoursWorked){
        List<PartTimeEmployee> partTimeEmpl=new ArrayList<PartTimeEmployee>();
        for (PartTimeEmployee pT:employeeList){
            if (pT.getNrOfHoursWorked()==nrOfHoursWorked){
                partTimeEmpl.add(pT);
            }
        }
        return partTimeEmpl;
    }

    //map
    public int returnOrdersProduct(Map<String, Order> orderMap, int idProduct) {
        int orders = 0;
        Set<String> keySet = orderMap.keySet();
        for (String sKey : keySet) {
            Order order = orderMap.get(sKey);
            Product product = order.getProdus();
            if (product.getProdId() == idProduct) {
                orders++;
            }
        }
        return orders;
    }

    public double returnSumOrdersOfPerson(Map<String, Order> orderMap, int idPerson) {
        double sumOrders = 0;
        Set<String> keySet = orderMap.keySet();
        for (String sKey : keySet) {
            Order order = orderMap.get(sKey);
            Product product = order.getProdus();
            Person person = order.getPersoana();
            if (person.getPersID() == idPerson) {
                double totalPrice = product.getPrice();
                sumOrders += totalPrice;
            }
        }
        return sumOrders;
    }

    public List<String> returnIdsFromOrders(Map<String, Order> orderMap, int idPerson) {
        List<String> idList = new ArrayList<>();
        Set<String> keySet = orderMap.keySet();
        for (String sKey : keySet){
            Order order = orderMap.get(sKey);
            Person person = order.getPersoana();
            if (person.getPersID()==idPerson){
                idList.add(order.getId());
            }
        }
        return idList;
    }
}
