package com.en.cristian.oop.problema4;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------problema4------------------------------------------");

        Employee employee1=new Employee("Mihai", "Marasti");
        FullTimeEmployee fullEmployee1=new FullTimeEmployee("Gicu","Mehedinti", 4029);
        fullEmployee1.calculatePay();
        fullEmployee1.setMonthlySalary(4129);
        System.out.println(fullEmployee1.getMonthlySalary());
        PartTimeEmployee partEmployee1=new PartTimeEmployee("Sever", "Bucegi", 20, 25);
        System.out.println(partEmployee1.toString());
        partEmployee1.setNrOfHoursWorked(56);
        partEmployee1.setPricePerHour(25);
        System.out.println(partEmployee1.calculatePay());
    }
    }

