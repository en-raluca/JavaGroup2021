package com.en.celia.OOP;

public class Main {

    public static void main(String[] args) {

        //ex1
        Flower f1 = new Flower("rose", "red", 20);
        Tree t1 = new Tree("Bonsai", 0.55, 2);
        f1.saySomethingSpecialAbout();
        t1.saySomethingSpecialAbout();

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
        FullTimeEmployee fullTime = new FullTimeEmployee("Pop Marius", "str.Aurel Vlaicu nr.25", 3500.25);
        PartTimeEmployee partTime = new PartTimeEmployee("Ionescu Marian", "str. Mihai nr.5", 84, 25);
        fullTime.calculatePay();
        partTime.calculatePay();

        //ex5
        IndividualPerson indPers = new IndividualPerson("Celia", "Stir", "2981054986523", "Cluj-Napoca");
        LegalEntity legalEnt = new LegalEntity("Anca", "Pop", "Endava", "RO05236458", "Str. Teodor Mihali, nr. 36");
        indPers.showPersonDetails();
        legalEnt.showPersonDetails();

        //ex7
        PaperBook paperBook = new PaperBook("Bambi","Caragiale",25.20,30,"Kerigma","Str. Alecsandri, nr.45");
        ElectronicBook electronicBook = new ElectronicBook("Castil","Alecsandri",60, "Elefant","pdf");
        paperBook.calcPrice();
        electronicBook.calcPrice();
        System.out.println("Price for paperBook is " + paperBook.calcPrice());
        System.out.println("Price for electronicBook is " + electronicBook.calcPrice());


    }
}
