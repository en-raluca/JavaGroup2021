package com.en.raul;

import com.en.raul.Problema1.Flower;
import com.en.raul.Problema1.Plant;
import com.en.raul.Problema1.Tree;
import com.en.raul.Problema12.BoardGame;
import com.en.raul.Problema12.Game;
import com.en.raul.Problema12.VideoGame;
import com.en.raul.Problema2.*;
import com.en.raul.Problema4.Employee;
import com.en.raul.Problema4.FullTimeEmployee;
import com.en.raul.Problema4.PartTimeEmployee;
import com.en.raul.Problema5.Persoana;
import com.en.raul.Problema5.PersoanaFizica;
import com.en.raul.Problema5.PersoanaJuridica;
import com.en.raul.Problema9.Batman;
import com.en.raul.Problema9.Hero;
import com.en.raul.Problema9.Spiderman;
import com.en.raul.Problema9.Superman;
import com.en.raul.ObjectManager;
import com.en.raul.Tema5Map.Order;
import com.en.raul.Tema5Map.Person;
import com.en.raul.Tema5Map.Product;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*//Problema 1
        Plant plant = new Plant("Trandafir");
        plant.saySomethingSpecialAbout();
        plant.setName("Ghiocel");
        System.out.println(plant.getName());

        Flower flower = new Flower("rosie", 5, "Crin");
        flower.saySomethingSpecialAbout();
        flower.setName("Magnolie");
        System.out.println(flower.getName());

        Tree tree = new Tree(15,100,"Brad");
        tree.saySomethingSpecialAbout();
        tree.setHeight(39);
        System.out.println(tree.getHeight());

        //Problema2
        Pet pet = new Pet("Rex","Canin");
        pet.play();
        pet.setNume("Doggo");
        System.out.println(pet.getNume());

        Cat cat = new Cat("Kitty","brittish");
        cat.play();
        cat.setRasa("Japanese");
        System.out.println(cat.getRasa());

        Fish fish = new Fish("Nemo","Gold");
        fish.play();

        Dog dog = new Dog("Doge","Shiba");
        dog.play();

        Parrot parrot = new Parrot("Coco","Albastru");
        parrot.play();

        //Problema4
        Employee emp = new Employee("Adrian","Cluj");
        System.out.println(emp.getAddress());
        emp.setAddress("Mures");
        System.out.println(emp.getAddress());

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Tavi","Targu Mures",30.23);
        fullTimeEmployee.calculatePay();
        fullTimeEmployee.setMonthlySalary(60.44);
        System.out.println("Noul salar este: " + fullTimeEmployee.getMonthlySalary());

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Raul","Bistrita",40,10.32);
        partTimeEmployee.calculatePay();
        partTimeEmployee.setPricePerHour(32.67);
        partTimeEmployee.setNrOfHoursWorked(50);
        partTimeEmployee.calculatePay();

        //Problema5
        Persoana persoana = new Persoana("Andrei","Neag");
        persoana.showPersonalDetails();
        persoana.setNume("Bosa");
        persoana.setPrenume("Octavian");
        persoana.showPersonalDetails();

        PersoanaFizica persoanaFizica = new PersoanaFizica("Claudiu","Mihai", "19382153412321","Targu Mures");
        persoanaFizica.showPersonalDetails();
        persoanaFizica.setDomiciliu("Cluj Napoca");
        persoanaFizica.setPrenume("Andrei");
        persoanaFizica.showPersonalDetails();

        PersoanaJuridica persoanaJuridica = new PersoanaJuridica("Florin","Cristian","ABC.inc","str. Kogalniceanu", "CFJS23123413");
        persoanaJuridica.showPersonalDetails();
        persoanaJuridica.setCompanie("Apple");
        persoanaJuridica.setNume("Dorel");
        persoanaJuridica.setCuiFirma("CVP333222");
        persoanaFizica.showPersonalDetails();

        //Problema9
        Hero hero = new Hero("Aquaman","Splash Water","Blue");
        hero.launchThePower();
        hero.setPower("Swim");
        hero.launchThePower();

        Superman superman = new Superman("Superman","Fly","Red","X-RAY");
        superman.launchTheSpecialPower();
        superman.launchThePower();
        superman.setSpecialPower("Lasers");
        superman.setPower("Strength");
        superman.launchThePower();
        superman.launchTheSpecialPower();

        Batman batman = new Batman("Batman","Fight","Black");
        batman.launchThePower();
        batman.setPower("Drive");
        batman.launchThePower();

        Spiderman spiderman = new Spiderman("Peter","Climb","Red and blue");
        spiderman.launchThePower();
        spiderman.setCostumeColor("Black and white");
        System.out.println(spiderman.getCostumeColor());*/

        //Collections Flori


        List<Flower> flowerList = new ArrayList<>();

        Flower flower = new Flower("alb", 5,"Crin");
        Flower flower2 = new Flower("albastru", 5, "Rozen");
        Flower flower3 = new Flower("rosie", 5, "trandafir");

        flowerList.add(flower);
        flowerList.add(flower2);
        flowerList.add(flower3);

        List<Tree> treeList = new ArrayList<>();

        Tree tree = new Tree(15,100,"Brad");
        Tree tree2 = new Tree(25,322,"Molid");
        Tree tree3 = new Tree(67,14,"Pin");
        Tree tree4 = new Tree(25,542,"Copac");

        treeList.add(tree);
        treeList.add(tree2);
        treeList.add(tree3);
        treeList.add(tree4);

        List<Pet> petList = new ArrayList<>();

        Pet pet = new Pet("Rex","Canin");
        Pet pet2 = new Pet("Max","Bison");
        Pet pet3 = new Pet("Doggo","Catel");

        petList.add(pet);
        petList.add(pet2);
        petList.add(pet3);

        List<Employee> employeeList = new ArrayList<>();

        Employee emp = new Employee("Adrian","Cluj");
        Employee emp2 = new Employee("Bogdan","Mures");
        Employee emp3 = new Employee("Cozma","Timisoara");

        employeeList.add(emp);
        employeeList.add(emp2);
        employeeList.add(emp3);

        List<PartTimeEmployee> partTimeEmployeeList = new ArrayList<>();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Raul","Bistrita",40,10.32);
        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee("Bogdan","Mures",50,10.32);
        PartTimeEmployee partTimeEmployee3 = new PartTimeEmployee("Andrei","Bucuresti",89,10.32);

        partTimeEmployeeList.add(partTimeEmployee);
        partTimeEmployeeList.add(partTimeEmployee2);
        partTimeEmployeeList.add(partTimeEmployee3);

        List<PersoanaFizica> persoanaFizicaList = new ArrayList<>();

        PersoanaFizica persoanaFizica = new PersoanaFizica("Claudiu","Mihai", "19382153412321","Targu Mures");
        PersoanaFizica persoanaFizica2 = new PersoanaFizica("Andrei","Neag", "23214123123123","Arges");
        PersoanaFizica persoanaFizica3 = new PersoanaFizica("Rares","Bogdan", "353242134123123","Cluj Napoca");

        persoanaFizicaList.add(persoanaFizica);
        persoanaFizicaList.add(persoanaFizica2);
        persoanaFizicaList.add(persoanaFizica3);

        List<PersoanaJuridica> persoanaJuridicaList = new ArrayList<>();

        PersoanaJuridica persoanaJuridica = new PersoanaJuridica("Florin","Cristian","ABC.inc","str. Kogalniceanu", "CFJS23123413");
        PersoanaJuridica persoanaJuridica2 = new PersoanaJuridica("Mihai","Goga","Dristor","str. Bucegi", "CHD8877723");
        PersoanaJuridica persoanaJuridica3 = new PersoanaJuridica("Andre","Albert","Dristor","str. Eminescu", "CFO7812413");

        persoanaJuridicaList.add(persoanaJuridica);
        persoanaJuridicaList.add(persoanaJuridica2);
        persoanaJuridicaList.add(persoanaJuridica3);

        List<BoardGame> boardGameList = new ArrayList<>();

        BoardGame boardGame = new BoardGame("Deceit",5,30);
        BoardGame boardGame2 = new BoardGame("Catan",8,40);
        BoardGame boardGame3 = new BoardGame("Monopoly",6,60);

        boardGameList.add(boardGame);
        boardGameList.add(boardGame2);
        boardGameList.add(boardGame3);

        List<VideoGame> videoGamesList = new ArrayList<>();

        VideoGame videoGame = new VideoGame("Apex","EA");
        VideoGame videoGame2 = new VideoGame("Forza","Microsoft");
        VideoGame videoGame3 = new VideoGame("Fifa","EA");

        videoGamesList.add(videoGame);
        videoGamesList.add(videoGame2);
        videoGamesList.add(videoGame3);

        List<Game> gamesList = new ArrayList<>();

        Game game = new Game("Borderlands");
        Game game2 = new Game("Raid");
        Game game3 = new Game("Counter");

        gamesList.add(game);
        gamesList.add(game2);
        gamesList.add(game3);

        ObjectManager ob = new ObjectManager();
        //System.out.println("Elementele listei filtrate de flori= " + ob.filterFlowersByColor(flowerList,"alb"));
        //System.out.println("Elementele listei filtrate de copaci= " + ob.filterTreeByHeight(treeList,25));
        //System.out.println("Lista rasa animale= "+ ob.searchPetByBreed(petList,"Bison"));
        //System.out.println("Exista angjati la adresa? : "+ ob.searchEmployeeByAddress(employeeList,"Mures"));
        //System.out.println("Angajati part time dupa nr de ore= " + ob.filterEmployeeByNrOfHoursWorked(partTimeEmployeeList,45));
        //System.out.println("Exista persoane dupa acest CNP? " + ob.searchPersonByCnp(persoanaFizicaList,"542315481"));
        //System.out.println("Firma ce apartie acestui CUI este= " + ob.findCompanyNameByCui(persoanaJuridicaList,"CFO7812413"));
        //System.out.println("Persoane ce lucreaza la aceasta companie: " + ob.filterPersonsByCompany(persoanaJuridicaList,"Abc"));
        /*System.out.println("Jocurile sunt urmatoarele: " + ob.filterGamesByNrOfPlayers(boardGameList,7));
        System.out.println("Exista jocurile de la producator? " + ob.searchGameByProducer(videoGamesList,"Test"));
        System.out.println("Jocurile care au titlul introdus sunt: " + ob.findGameByTitle(gamesList,"Raid"));*/

        Product prod1 = new Product("Telefon","Electronice",20,2);
        Product prod2 = new Product("Ciocolata","Alimente",10.32,1);

        Person p = new Person("Pop","Andrei",12,5);
        Person p2 = new Person("Ioan","Emil",31,3);

        Order order1 = new Order("1", prod1,p);
        Order order2 = new Order("2", prod2,p);
        Order order3 = new Order("4", prod1,p2);
        Order order4 = new Order("53", prod1,p2);


        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);

        Set<Person> personSet = ob.extractPersonsFromOrder(orderList);
        //System.out.println("Lista de persoane este: " + personSet);

        Map<String ,Order> orderMap = new HashMap<>();
        orderMap.put("1",order1);
        orderMap.put("3",order2);
        orderMap.put("4",order3);
        orderMap.put("7",order4);

        //System.out.println("Numarul de comenzi pentru acest produs este: " + ob.getNumberOfTimesProductBought(orderMap,1));
        //System.out.println("Suma comenzilor este: " + ob.getSumOfOrders(orderMap,5));
        //System.out.println("Id-urile comenzilor sunt: " + ob.getOrderIds(orderMap,5));
        System.out.println("Persoana care a cumparat este: " + ob.getPersonWhoBought(orderMap,1));
    }
}
