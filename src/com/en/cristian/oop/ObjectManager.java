package com.en.cristian.oop;

import com.en.cristian.oop.problema1.Flower;
import com.en.cristian.oop.problema1.Tree;
import com.en.cristian.oop.problema2.Pet;
import com.en.cristian.oop.problema3.Animal;
import com.en.cristian.oop.problema4.Employee;
import com.en.cristian.oop.problema4.PartTimeEmployee;

import java.util.ArrayList;
import java.util.List;

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
}
