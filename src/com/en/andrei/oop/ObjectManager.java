package com.en.andrei.oop;

import com.en.andrei.oop.problem1.Flower;
import com.en.andrei.oop.problem1.Tree;
import com.en.andrei.oop.problem10.Order;
import com.en.andrei.oop.problem10.Person;
import com.en.andrei.oop.problem10.Product;
import com.en.andrei.oop.problem12.BoardGame;
import com.en.andrei.oop.problem12.Game;
import com.en.andrei.oop.problem2.Pet;
import com.en.andrei.oop.problem4.Employee;
import com.en.andrei.oop.problem4.PartTimeEmployee;
import com.en.andrei.oop.problem6.ProdElectronic;
import com.en.andrei.oop.problem7.Book;
import com.en.andrei.oop.problem7.ElectronicBook;

import java.util.*;

/**
 * Created by atpop on 05 Apr 2021
 */

public class ObjectManager {

    public List<Flower> filterFlowersByColour(List<Flower> flowerList, String colour) {
        List<Flower> filteredFlowerList = new ArrayList<>();
        for (Flower f : flowerList) {
            if (f.getColour().equals(colour)) {
                filteredFlowerList.add(f);
            }
        }
        return filteredFlowerList;
    }

    public List<Tree> filterTreesByHeight(List<Tree> treeList, int height) {
        List<Tree> filteredTreeList = new ArrayList<>();
        for (Tree t : treeList) {
            if (t.getHeight() > height) {
                filteredTreeList.add(t);
            }
        }
        return filteredTreeList;
    }

    public boolean searchPetByBreed(List<Pet> petList, String breed) {
        List<Pet> myPetList = new ArrayList<>(petList);
        boolean isBreed = false;
        for (Pet p : myPetList) {
            if (p.getRasa().equals(breed)) {
                isBreed = true;
            }
        }
        return isBreed;
    }

    public boolean searchEmployeeByAddress(List<Employee> employeeList, String address) {
        boolean isEmployee = false;
        for (Employee e : employeeList) {
            if (e.getAddress().equals(address)) {
                isEmployee = true;
            }
        }
        return isEmployee;
    }

    public List<PartTimeEmployee> filterEmployeeByNrOfHoursWorked(List<PartTimeEmployee> employeeList, int nrOfHoursWorked) {
        List<PartTimeEmployee> employeesNrOfHoursWorked = new ArrayList<>();
        for (PartTimeEmployee pt : employeeList) {
            if (pt.getNrOfHoursWorked() >= nrOfHoursWorked) {
                employeesNrOfHoursWorked.add(pt);
            }
        }
        return employeesNrOfHoursWorked;
    }

    public boolean searchProductByModel(List<ProdElectronic> productList, String model) {
        boolean isProduct = false;
        for (ProdElectronic pe : productList) {
            if (pe.getModel().equals(model)) {
                isProduct = true;
            }
        }
        return isProduct;
    }

    public List<Book> filterBooksByAuthor(List<Book> bookList, String author) {
        List<Book> myFilteredBook = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getAuthor().equals(author)) {
                myFilteredBook.add(b);
            }
        }
        return myFilteredBook;
    }

    public String findBookFormatByTitle(List<ElectronicBook> bookList, String title) {
        String bookNameWithFormat = "";
        for (ElectronicBook eb : bookList) {
            if (eb.getFormat().equals(title)) {
                bookNameWithFormat = eb.getTitle();
            }
        }
        return bookNameWithFormat;
    }

    public List<BoardGame> filterGamesByNrOfPlayers(List<BoardGame> gameList, int nrOfPlayers) {
        List<BoardGame> filteredGame = new ArrayList<>();
        for (BoardGame bg : gameList) {
            if (bg.getNrOfPlayers() >= nrOfPlayers) {
                filteredGame.add(bg);
            }
        }
        return filteredGame;
    }

    public Game findGameByTitle(List<Game> gameList, String titlu) {
        Game myGame = new Game() {
            @Override
            public void howToPlay() {
                System.out.println("My game");
            }
        };
        for (Game g : gameList) {
            if (g.getTitle().equals(titlu)) {
                myGame.setTitle(titlu);
            }
        }
        return myGame;
    }

    public boolean checkIfProdIsFree(Product product) {
        boolean isFree = false;
        double price = product.getPrice();
        if (price == 0) {
            isFree = true;
        }
        return isFree;
    }

    public Set<Person> findPersonFromOrder(List<Order> orderList) {
        Set<Person> personSet = new HashSet<>();
        for (Order order : orderList) {
            Person person = order.getPerson();
            personSet.add(person);
        }
        return personSet;
    }

    public double getPriceOfProductFromOrder(Map<String, Order> orderMap, int idProd) {
        double productPrice = 0;
        Set<String> keyMap = orderMap.keySet();
        for (String s : keyMap) {
            Order order = orderMap.get(s);
            Product product = order.getProdus();
            if (product.getId() == idProd) {
                productPrice = product.getPrice();
            }
        }
        return productPrice;
    }

    public Set<Person> extractPersonsFromOrder(Map<String, Order> orderMap, int idProd) {
        Set<Person> personSet = new HashSet<>();
        Set<String> orderIds = orderMap.keySet();
        for (String s : orderIds) {
            Order order = orderMap.get(s);
            Product product = order.getProdus();
            int prodId = product.getId();
            if (prodId == idProd) {
                Person person = order.getPerson();
                personSet.add(person);
            }
        }
        return personSet;
    }

    public int howManyOrdersForAProduct(Map<String, Order> orderMap, int prodId) {
        int nrOfOrders = 0;
        Set<String> keyMap = orderMap.keySet();
        for (String s : keyMap) {
            Order order = orderMap.get(s);
            Product product = order.getProdus();
            if (product.getId() == prodId) {
                nrOfOrders++;
            }
        }
        return nrOfOrders;
    }


    public double calculateProductSumFromOrder(Map<String, Order> orderMap, int personId) {
        double sum = 0;
        Set<String> keyMap = orderMap.keySet();
        for (String s : keyMap) {
            Order order = orderMap.get(s);
            Person person = order.getPerson();
            if (person.getId() == personId) {
                Product product = order.getProdus();
                sum += product.getPrice();
            }
        }
        return sum;
    }

    public Set<Integer> orderIdPerson(Map<String, Order> orderMap, int personId) {
        Set<Integer> orderList = new HashSet<>();
        List<Product> productList = new ArrayList<>();
        Set<String> keyMap = orderMap.keySet();
        for (String s : keyMap) {
            Order order = orderMap.get(s);
            Person person = order.getPerson();
            if (person.getId() == personId) {
                Product product = order.getProdus();
                productList.add(product);
                for (Product p : productList) {
                    orderList.add(p.getId());
                }
            }
        }
        return orderList;
    }

    public Map<String, Person> personIdOrder(Map<String, Order> orderMap, int prodId) {
        Map<String, Person> personMap = new HashMap<>();
        Set<String> keyMap = orderMap.keySet();
        for(String s: keyMap) {
            Order order = orderMap.get(s);
            Product product = order.getProdus();
            if(product.getId() == prodId) {
                String orderId = order.getId();
                Person person = order.getPerson();
                personMap.put(orderId, person);
            }
        }
        return personMap;
    }

}
