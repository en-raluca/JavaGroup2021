package com.en.celia.OOP;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //ex1
        Flower f1 = new Flower("rose", "red", 20);
        Flower flower2 = new Flower("tulip", "yellow", 5);
        Flower flower3 = new Flower("myFlower", "yellow", 10);

        Tree t1 = new Tree("Bonsai", 0.55, 2);
        Tree t2 = new Tree("myTree", 1.75, 3);
        Tree t3 = new Tree("Magnoliu", 2.00, 5);
        f1.saySomethingSpecialAbout();
        flower2.saySomethingSpecialAbout();
        flower3.saySomethingSpecialAbout();
        t1.saySomethingSpecialAbout();
        t2.saySomethingSpecialAbout();
        t3.saySomethingSpecialAbout();


        //ex2
        Cat c1 = new Cat("Lola", "egipteana");
        Fish f2 = new Fish("Doddy", "rosioara");
        Dog d1 = new Dog("Rex", "labrador");
        Parrot p1 = new Parrot("Selah", "papagal cenusiu");
        c1.play();
        f2.play();
        d1.play();
        p1.play();

        //ex4
        FullTimeEmployee fullTime = new FullTimeEmployee("Pop Marius", "str.Aurel Vlaicu nr.25", 3500.25, "1");
        FullTimeEmployee fullTime1 = new FullTimeEmployee("Popescu Alexandru", "str.Crizantemelor nr.154", 3650.25,"1");
        PartTimeEmployee partTime = new PartTimeEmployee("Ionescu Marian", "str. Mihai nr.5", 84, 25,"2");
        PartTimeEmployee partTime2 = new PartTimeEmployee("Plescan Avram", "str.Romana nr.22", 86, 25,"3");
        fullTime.calculatePay();
        fullTime1.calculatePay();
        partTime.calculatePay();

        //ex5
        IndividualPerson indPers = new IndividualPerson("Celia", "Stir", "2981054986523", "Cluj-Napoca");
        IndividualPerson indPers1 = new IndividualPerson("Ioana", "Pop", "2981853624598", "Zalau");
        LegalEntity legalEnt = new LegalEntity("Anca", "Pop", "Endava", "RO05236458", "Str. Teodor Mihali, nr. 36");
        indPers.showPersonDetails();
        indPers1.showPersonDetails();
        legalEnt.showPersonDetails();

        //ex7
        PaperBook paperBook = new PaperBook("Bambi", "Caragiale", 25.20, 30, "Kerigma", "Str. Alecsandri, nr.45");
        ElectronicBook electronicBook = new ElectronicBook("Castil", "Alecsandri", 60, "Elefant", "pdf");
        paperBook.calcPrice();
        electronicBook.calcPrice();
        System.out.println("Price for paperBook is " + paperBook.calcPrice());
        System.out.println("Price for electronicBook is " + electronicBook.calcPrice());
        paperBook.applyShippingCost(5);

        //listaFlower
        List<Flower> flowerList = new ArrayList<>();
        System.out.println("Lista este goala " + flowerList.isEmpty());
        flowerList.add(f1);
        flowerList.add(flower2);
        flowerList.add(flower3);
        System.out.println(flowerList);
        ObjectManager objManager = new ObjectManager();
        List<Flower> returnFlowers = objManager.filterFlowersByColor(flowerList, "yellow");
        System.out.println("Returned flower list size= " + returnFlowers.size());
        System.out.println(returnFlowers);

        //listaTree
        List<Tree> treeList = new ArrayList<>();
        System.out.println("Lista este goala " + treeList.isEmpty());
        treeList.add(t1);
        treeList.add(t2);
        treeList.add(t3);
        System.out.println(treeList);
        ObjectManager objManager1 = new ObjectManager();
        List<Tree> returnTrees = objManager1.filterTreesByHeight(treeList,1.75);
        System.out.println("Returned trees list size= " + returnTrees.size());
        System.out.println(returnTrees);

        //lista Cat
        List<Cat> catList = new ArrayList<>();
        System.out.println("Lista este goala " + catList.isEmpty());
        catList.add(c1);
        System.out.println(catList);
        ObjectManager objManager2 = new ObjectManager();
        boolean returnPets = objManager2.searchPetByBreed(catList,"egipteana");
        System.out.println(returnPets);

        //listaEmployee
        List<FullTimeEmployee> employeeList = new ArrayList<>();
        System.out.println("Lista este goala " + employeeList.isEmpty());
        employeeList.add(fullTime);
        employeeList.add(fullTime1);
        System.out.println(employeeList);
        ObjectManager objManager3 = new ObjectManager();
        List<FullTimeEmployee> returnEmployees = objManager3.searchEmployeeByAddress(employeeList,"str.Aurel Vlaicu nr.25");
        System.out.println("Returned employees list size= " + returnEmployees.size());
        System.out.println(returnEmployees);

        //lista Employee1
        List<Employee> employeeList1 = new ArrayList<>();
        System.out.println("Lista este goala " + employeeList1.isEmpty());
        employeeList1.add(fullTime);
        employeeList1.add(fullTime1);
        employeeList1.add(partTime);
        System.out.println(employeeList1);
        ObjectManager objManager4 = new ObjectManager();
        boolean returnEmployees1 = objManager4.searchEmployeeByAddress1(employeeList1,"str. Mihai nr.5");
        System.out.println(returnEmployees1);

        //listaEmployee
        List<PartTimeEmployee> employeeList2 = new ArrayList<>();
        System.out.println("Lista este goala " + employeeList2.isEmpty());
        employeeList2.add(partTime);
        employeeList2.add(partTime2);
        System.out.println(employeeList2);
        ObjectManager objManager5 = new ObjectManager();
        List<PartTimeEmployee> returnEmployees2 = objManager5.filterEmployeeByNrOfHoursWorked(employeeList2,86);
        System.out.println("Returned employees list size= " + returnEmployees2.size());
        System.out.println(returnEmployees2);

        //listaPersons
        List<IndividualPerson> personList = new ArrayList<>();
        System.out.println("Lista este goala " + personList.isEmpty());
        personList.add(indPers);
        personList.add(indPers1);
        System.out.println(personList);
        ObjectManager objManager6 = new ObjectManager();
        boolean returnPersons = objManager6.searchPersonByCnp(personList,"2981853624598");
        System.out.println(returnPersons);

        //Creare set
        Set<Employee> set1 = new HashSet();
        set1.add(fullTime);
        set1.add(fullTime1);
        set1.add(partTime);
        System.out.println(set1.size());
        set1.contains(fullTime1);
        for (Employee e:set1){
            System.out.println(e);
        }

        System.out.println(fullTime.hashCode());
        System.out.println(fullTime1.hashCode());
        System.out.println(partTime.hashCode());
        System.out.println(fullTime.equals(fullTime1));
        System.out.println(partTime.equals(fullTime));

        //clasa
        //creem obiectele
        Product prod1 = new Product("Carte","Carti",22,1);
        Product prod2 = new Product("Ciocolata", "Alimente",4,1);
        Product prod3 = new Product("Paine", "Alimente",3,3);

        //prin metoda get citim valorile variabilelor
        String numeProd1 = prod1.getNume();
        System.out.println(numeProd1);
        double pretProd2 = prod2.getPrice();
        System.out.println(pretProd2);

        //prin metoda set modificam valorile variabilelor
        prod1.setNume("Poezii");
        prod2.setPrice(15);

        //recitim valorile din obiect sa verificam daca s-au modificat
        numeProd1 = prod1.getNume();
        System.out.println(numeProd1);
        pretProd2 = prod2.getPrice();
        System.out.println(pretProd2);

        Persoana pers1 = new Persoana("Ioan","Pop",33,2);
        int pers1Age = pers1.getAge();
        System.out.println(pers1Age);
        pers1.setAge(35);
        pers1Age = pers1.getAge();
        System.out.println(pers1Age);


        ProdusAlimentar ciocolata = new ProdusAlimentar("Milka","alimente",5.70,455,256);
        ProdusVestimentar geanta = new ProdusVestimentar("Guess","genti",7,400,'m');

        ciocolata.showProductInfo();
        geanta.showProductInfo();

        System.out.println(ciocolata);
        System.out.println(geanta);



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
        for(String s: myList){
            System.out.println(s);
        }

        Iterator<String> iterator = myList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Creare set
        Set<Product> set = new HashSet();
        set.add(prod1);
        set.add(prod2);
        set.add(prod3);
        set.add(prod1);
        System.out.println(set.size());
        set.remove(prod3);
        set.contains(prod2);
        for (Product element:set){
            System.out.println(element);
        }
        System.out.println(prod1.hashCode());
        System.out.println(prod2.hashCode());
        System.out.println(prod3.hashCode());
        System.out.println(prod1.equals(prod2));
        System.out.println(prod1.equals(prod3));

        Order order1 = new Order("1", prod1,pers1);
        Order order2 = new Order("2", prod2,pers1);

        Map<String, Order> myMap = new HashMap();
        myMap.put(order1.getId(),order1);
        myMap.put(order2.getId(),order2);
        boolean containsKey = myMap.containsKey(order2.getId());
        boolean containsValue = myMap.containsValue(order2);
        System.out.println(containsKey);
        System.out.println(containsValue);
        //myMap.remove(order1.getId(),order2);
        //myMap.remove(order1.getId(),order1);
        //myMap.remove(order2.getId());

        //itereaza un map
        Set<String> keySet =  myMap.keySet();
        for(String s : keySet){
            System.out.println("Cheia este: " + s);
        }
        //returneaza valorile
        Collection<Order> values =  myMap.values();

        Iterator<Order> valuesIter = values.iterator();
        while(valuesIter.hasNext()) {
            Order o = valuesIter.next();
            System.out.println(o);
        }

        Persoana pers = new Persoana("Fineas","Stir",26, 1);
        Order order3 = new Order("6",prod1,pers1);
        Order order4 = new Order("7",prod2,pers1);
        List<Order> orderList = new ArrayList<>();
        orderList.add(order4);
        orderList.add(order3);
       // Set<Persoana> perss = ObjectManager.extractPersonsFromOrders(orderList);
        System.out.println("Persoana: " + pers);

        //TEMA MAPS
        System.out.println("De aici incepe tema 5, maps");
        ObjectManager manager = new ObjectManager();

        Map<String, Order> orderMap = new HashMap<>();
        orderMap.put(order1.getId(), order1);
        orderMap.put(order2.getId(), order2);
        orderMap.put(order3.getId(), order3);
        int ordersNumber = manager.calculateNumberOfOrders(orderMap, 1);
        System.out.println(ordersNumber + " este numarul total de comenzi pentru un produs");

        double sumOfProducts = manager.calculateSumOfProductsPerOrders(orderMap, 2);
        System.out.println("Suma totala a produselor per comenzi este = " + sumOfProducts);
    }


}
