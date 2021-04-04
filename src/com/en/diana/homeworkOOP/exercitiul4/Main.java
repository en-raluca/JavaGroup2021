package com.en.diana.homeworkOOP.exercitiul4;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee angajat = new FullTimeEmployee("Marinescu", "Mures", 2000);
        FullTimeEmployee angajat2 = new FullTimeEmployee("Pap", "Timisoara", 3000);
        PartTimeEmployee angajatPart = new PartTimeEmployee("Mara", "Gilau", 6, 50);
        System.out.println(angajat.calculatePay());
        System.out.println("tets");
        System.out.println(angajat2.getMonthlySalary());
        angajatPart.setPricePerHour(60);
        System.out.println(angajatPart.getPricePerHour());
        System.out.println("Maririle au fost facute cu " + SalaryCalculation.PERCENT_OF_ENCREASING);
    }
}
