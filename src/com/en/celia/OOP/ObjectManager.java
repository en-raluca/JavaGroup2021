package com.en.celia.OOP;

import java.util.ArrayList;
import java.util.List;

public class ObjectManager {
    public List<Flower> filterFlowersByColor(List<Flower> flowerList, String color) {
        List<Flower> foundFlowers = new ArrayList<>();
        for (Flower f : flowerList) {
            if (f.getColor().equals(color)) {
                foundFlowers.add(f);
            }
        }
        return foundFlowers;
    }

    public List<Tree> filterTreesByHeight(List<Tree> treeList, double height){
        List<Tree> foundTrees = new ArrayList<>();
        for(Tree t : treeList){
            if(t.getHeight()> height){
                foundTrees.add(t);
            }
        }
        return foundTrees;
    }

    public boolean searchPetByBreed(List<Cat> catList, String breed){
        boolean result = false;
        List<Cat> foundPets = new ArrayList<>();
        for (Cat p : catList){
            if(p.getBreed().equals(breed)){
                result =  true;
                foundPets.add(p);
            }
            else {
                result= false;
                foundPets.add(p);
            }
        }
        return result;
    }

    public List<FullTimeEmployee> searchEmployeeByAddress(List<FullTimeEmployee> employeeList, String address){
        List<FullTimeEmployee> foundEmployees = new ArrayList<>();
        for(FullTimeEmployee e : employeeList){
            if(e.getAddress().equals(address)){
                foundEmployees.add(e);
            }
        }
        return foundEmployees;
    }

    public boolean searchEmployeeByAddress1 (List<Employee> employeeList1, String address1){
        boolean result = false;
        List<Employee> foundEmployees1 = new ArrayList<>();
        for (Employee e1 : employeeList1){
            if(e1.getAddress().equals(address1)){
                result =  true;
                foundEmployees1.add(e1);
            }
            else {
                result= false;
                foundEmployees1.add(e1);
            }
        }
        return result;
    }

    public List<PartTimeEmployee> filterEmployeeByNrOfHoursWorked(List<PartTimeEmployee> employeeList, int nrOfHoursWorked){
        List<PartTimeEmployee> foundEmployees2 = new ArrayList<>();
        for(PartTimeEmployee e2 : employeeList){
            if(e2.getNrOfHoursWorked()==nrOfHoursWorked){
                foundEmployees2.add(e2);
            }
        }
        return foundEmployees2;
    }

    public boolean searchPersonByCnp(List<IndividualPerson> personList, String cnp){
        boolean result = false;
        List<IndividualPerson> foundpersons = new ArrayList<>();
        for(IndividualPerson i : personList){
            if(i.getCnp().equals(cnp)){
                foundpersons.add(i);
                result = true;
            }
            else {
                foundpersons.add(i);
                result = false;
            }
        }
        return result;
    }

}


