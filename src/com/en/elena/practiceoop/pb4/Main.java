package com.en.elena.practiceoop.pb4;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ana", "Cluj Napoca");
        Employee employee2 = new Employee("Alex", "Baia Mare");
        FullTimeEmployee employee3 = new FullTimeEmployee("Mirela", "Cluj Napoca", 20000);
        FullTimeEmployee employee4 = new FullTimeEmployee("Irina", "Brasov", 30000);
        PartTimeEmployee employee5 = new PartTimeEmployee("Adina", "Sinaia", 100, 19);
        employee1.calculatePay();
        System.out.println(employee1.toString());
        employee2.setAddress("Brasov");
        System.out.println(employee2.toString());
        employee3.setMonthlySalary(55555);
        System.out.println(employee3.toString());
        System.out.println(employee4.toString());
        System.out.println(employee5.calculatePay());
        System.out.println(employee5.toString());

    }
}
