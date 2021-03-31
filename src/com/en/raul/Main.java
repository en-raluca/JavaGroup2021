package com.en.raul;

import com.en.raul.Problema1.Flower;
import com.en.raul.Problema1.Plant;
import com.en.raul.Problema1.Tree;
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

public class Main {

    public static void main(String[] args) {
        //Problema 1
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
        System.out.println(spiderman.getCostumeColor());
    }
}
