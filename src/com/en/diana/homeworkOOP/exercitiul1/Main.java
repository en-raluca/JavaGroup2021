package com.en.diana.homeworkOOP.exercitiul1;

public class Main {
    public static void main(String[] args) {
        Flower musetel = new Flower("Musetel", "alb", 20);
        Tree mesteacan = new Tree("Mesteacan", 2.3, 68.6);
        String numeMusetel = musetel.getName();
        System.out.println(numeMusetel);
        mesteacan.setAge(88);
        System.out.println("Copacul " + mesteacan.getName() + " are varsta " + mesteacan.getAge());
        musetel.saySomethingSpecialAbout();
        mesteacan.setName("Nuc");
        System.out.println(mesteacan.getName());
    }
}
