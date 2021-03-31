package com.en.diana.Homework3OOP;


public class Main {
    public static void main(String[] args) {
        //ex1
        Flower musetel = new Flower("Musetel", "alb", 20);
        Tree mesteacan = new Tree("Mesteacan", 2.3, 68.6);
        String numeMusetel = musetel.getName();
        System.out.println(numeMusetel);
        mesteacan.setAge(88);
        System.out.println("Copacul " + mesteacan.getName() + " are varsta " + mesteacan.getAge());
        musetel.saySomethingSpecialAbout();
        mesteacan.setName("Nuc");
        System.out.println(mesteacan.getName());

        //ex2
        Fish pastrav = new Fish("Pastrav", "de Apuseni");
        Parrot papagal = new Parrot("Papagal", "perus");
        pastrav.getRasa();
        pastrav.setRasa("de munte");
        System.out.println(pastrav);
        System.out.println(papagal);
        papagal.play();

        //ex3
        Animal animal = new Animal("pisica", "pet");
        System.out.println(animal);
        Dog2 catel = new Dog2("Skippi", "pet");
        catel.makeSound();
        System.out.println("Catelul " + catel.getNume() + " este din categoria " + catel.getCategorie());
        Bird pasare = new Bird("Porumbel", "zburatoare");
        String pas = pasare.getNume();
        System.out.println(pas);
        pasare.setNume("Randunica");
        System.out.println(pasare.getNume());

        //ex4
        FullTimeEmployee angajat = new FullTimeEmployee("Marinescu", "Mures", 2000);
        FullTimeEmployee angajat2 = new FullTimeEmployee("Pap", "Timisoara", 3000);
        PartTimeEmployee angajatPart = new PartTimeEmployee("Mara", "Gilau", 6, 50);
        System.out.println(angajat.calculatePay());
        System.out.println(angajat2.getMonthlySalary());
        angajatPart.setPricePerHour(60);
        System.out.println(angajatPart.getPricePerHour());

        //ex5
        PersFizica person = new PersFizica("Popescu", "Maria", 290123456, "Cluj-Napoca");
        PersoanaJuridica juridic = new PersoanaJuridica("JYSK", 5678, "Bucuresti");
        System.out.println(person.toString());
        System.out.println("cnp-ul pentru " + person.getPrenume() + " est " + person.getCnp());
        juridic.setAdresaFirma("Baia Mare");
        System.out.println(juridic.getAdresaFirma());
        juridic.setCuiFirma(8907);
        System.out.println(juridic.getCuiFirma());

        //ex6
        ProdAlimentar faina = new ProdAlimentar(89, "faina", 2.99, 500);
        ProdAccesoriu sacosa = new ProdAccesoriu(99, "geanta", 199.99, 'M');
        ProdElectronic cafetira = new ProdElectronic(90, "cafetiera", 500, "italiano");
        System.out.println(faina.getGramaj());
        faina.setGramaj(1000);
        System.out.println(faina.getGramaj());
        sacosa.setPret(300);
        cafetira.applyDiscount(20);
        System.out.println(cafetira.toString());
        sacosa.applyDiscount(20);
        faina.applyDiscount(1.70);

        //ex7
        PaperBook carte = new PaperBook("Acolo unde canta racii", "Delia Owens", 50, 54,
                "Carturesti", "Str. Unirii");
        ElectronicBook eBook = new ElectronicBook("Imparatul mustelor", "Wwilliam Golding", 69,
                "Amazon", "electronic");
        System.out.println(carte.applyShippingCost(15));
        carte.setCostTransport(78);
        System.out.println(eBook.getFormat());
        String site = eBook.getNameOfWebsiteShop();
        System.out.println(site);
        carte.setCostTransport(7.6);
        System.out.println(carte.getCostTransport());

        //ex8
        StudentAbsolvent student = new StudentAbsolvent("Marin", 2008, 2011,
                8, 9);
        Student stud = new Student("Pasca", 2010);
        int an = student.getAnAbsolvire();
        System.out.println(an);
        student.setNotaLicenta(8);
        System.out.println(student.getNotaLicenta());
        String name = stud.getNume();
        System.out.println(name);

        //ex9
        Spiderman spiderman = new Spiderman("Spiderman", "spiderWeb", "red", "hand");
        Superman superman = new Superman("Superman", "fly", "blue", "strength",
                "body");
        Batman batman = new Batman("Batman", "money", "black", "batCave");
        String nameS = spiderman.getName();
        System.out.println(nameS);
        String power = superman.getPower();
        System.out.println(power);
        String launch = batman.getLaunchThePower();
        System.out.println(launch);

        //ex10
        Student2 studentul = new Student2("Maris", "Teodora", "Mures", 2018, 57684);
        Professor prof = new Professor("Pasca", "Monica", "Bistrita-Nasaud", 3500);
        String st = studentul.getPrenume();
        System.out.println(st);
        prof.setSalary(6789);
        System.out.println(prof.getSalary());


    }
}
