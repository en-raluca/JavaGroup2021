package com.en.diana.homeworkOOP.exercitiul10;

public class Main {
    public static void main(String[] args) {
        Student studentul = new Student(1,"Maris", "Teodora", "Mures", 2018, 57684);
        Professor prof = new Professor(2,"Pasca", "Monica", "Bistrita-Nasaud", 3500);
        String st = studentul.getPrenume();
        System.out.println(st);
        prof.setSalary(6789);
        System.out.println(prof.getSalary());
    }
}
