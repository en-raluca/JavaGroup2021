package com.en.cristian.oop.problema5;

public class Main {
    public static void main(String[] args) {
        Persoana pers1 = new Persoana("Popescu", "Carla");
        pers1.showPersonDetails();
        PersFizica pers2 = new PersFizica("Cuc", "Mirela", 25689745, "Galati");
        pers2.showPersonDetails();
        PersoanaJuridica pers3=new PersoanaJuridica("Miclaus", "Gelu", "ExpressD", 23456, "Hundoarei, nr.34");
        System.out.println(pers3);
    }
}
