package com.en.celia.OOP;

import java.util.*;

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
    //returnati lista de persoane din clasa Persoana
    public Set<Persoana> extractPersonsFromOrders(List<Order> orderList){
        Set<Persoana> personSet = new HashSet<>();
        for (Order order:orderList){
            Persoana p = order.getPersoana();
            personSet.add(p);
        }
        return personSet;
    }

    //verificati daca un produs a fost cumparat vreodata
    public boolean checkProductFromOrder(List<Order> ordList, int idOfProduct){
        for(Order o:ordList){
            Product p = o.getProdus();
            if(p.getId() == idOfProduct) {
                return true;
            }
        }
        return false;
    }

    public double getPriceOfProductFromOrder(Map<String, Order> orderMap, int idOfProduct){
        Set<String> orderIds = orderMap.keySet();
        for(String s: orderIds){
            Order order = orderMap.get(s);
            Product prod = order.getProdus();
            if(prod.getId() == idOfProduct){
                return prod.getPrice();
            }
        }
        return 0;
    }

    //returnati oamenii care au cumparat acel produs
    public Set<Persoana> exctractPersonsFromOrder(Map<String,Order> orderMap, int idOfProduct){
        Set<String> orderIds = orderMap.keySet();
        Set<Persoana> personSet = new HashSet<>();
        for(String mapKey: orderIds){
            Order order = orderMap.get(mapKey);
            Product prod = order.getProdus();
            int id = prod.getId();
            if(idOfProduct==id){
                Persoana person = order.getPersoana();
                personSet.add(person);
            }
        }
        return personSet;
    }

   // o metoda care returneaza pt un id de produs dat ca parametru, de cate ori a fost cumparat (calculati numarul de comenzi)
    public int calculateNumberOfOrders (Map <String, Order> orderMap, int idOfProduct){
        int count = 0;
        Set<String> mapKey = orderMap.keySet();
        for(String elem: mapKey){
            Order order = orderMap.get(elem);
            Product prod = order.getProdus();
            if(prod.getId() == idOfProduct){
                count++;
            }
        }
        return count;
    }

    //o metoda care returneaza pt un id de persoana dat ca parametru, suma comenzilor sale (calculati suma preturilor produselor din comenzile sale)
    public double calculateSumOfProductsPerOrders (Map<String, Order> orderMap, int idOfPerson){
        double suma = 0;
        Set<String> mapKey = orderMap.keySet();
        for(String element: mapKey){
            Order order = orderMap.get(element);
            Persoana persoana = order.getPersoana();
            if(persoana.getId() == idOfPerson){
                Product produs = order.getProdus();
                suma = suma + produs.getPrice();
            }
        }
        return suma;
    }
}


