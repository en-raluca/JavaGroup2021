package com.en.diana.homeworkOOP.exercitiul8;

public class Main {
    public static void main(String[] args) {
        StudentAbsolvent student = new StudentAbsolvent("Marin", 2008, 2011,
                8, 9);
        Student stud = new Student("Pasca", 2010);
        int an = student.getAnAbsolvire();
        System.out.println(an);
        student.setNotaLicenta(8);
        System.out.println(student.getNotaLicenta());
        String name = stud.getNume();
        System.out.println(name);
    }
}
