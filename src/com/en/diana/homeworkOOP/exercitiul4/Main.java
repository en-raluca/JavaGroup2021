package com.en.diana.homeworkOOP.exercitiul4;

import com.en.diana.homeworkOOP.exercitiul6.ObjectManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        FullTimeEmployee angajat = new FullTimeEmployee("Marinescu", "Mures", 2000);
//        FullTimeEmployee angajat2 = new FullTimeEmployee("Pap", "Timisoara", 3000);
//        PartTimeEmployee angajatPart = new PartTimeEmployee("Mara", "Gilau", 6, 50);
//        System.out.println(angajat.calculatePay());
//        System.out.println("tets");
//        System.out.println(angajat2.getMonthlySalary());
//        angajatPart.setPricePerHour(60);
//        System.out.println(angajatPart.getPricePerHour());
//        System.out.println("Maririle au fost facute cu " + SalaryCalculation.PERCENT_OF_ENCREASING);

        //exercitiul 5 Collections
        /* - verifica daca exista in lista de angajati un angajat care are adresa data ca parametru
        public boolean searchEmployeeByAddress(List<Employee> employeeList, String address)*/
        //Construire obiecte tip Employee
        Employee angaja1 = new FullTimeEmployee("Marinescu", "Mures", 2000);
        Employee angajat2 = new FullTimeEmployee("Pap", "Timisoara", 3000);
        Employee angajat3 = new PartTimeEmployee("Mara", "Gilau", 6, 50);
        Employee angajat4 = new PartTimeEmployee("Antonesc", "Gilau", 6, 50);
        //Creare lista de obieste tip Employee
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(0, angaja1);
        employeeList.add(1, angajat2);
        employeeList.add(2, angajat3);
        employeeList.add(3, angajat4);
        ObjectManager manager = new ObjectManager();
        boolean rez = manager.searchEmployeeByAddress(employeeList, "Timisoara");
        System.out.println(rez);

        //exercitiul 6 Collections
        /*- filtreaza lista de angajati in functie de nr de ore lucrate dat ca parametru
        public List<PartTimeEmployee> filterEmployeeByNrOfHoursWorked(List<PartTimeEmployee> employeeList,
        int nrOfHoursWor) */
        //Construire obiecte tip PartTimeEmployee
        PartTimeEmployee angajatPart1 = new PartTimeEmployee("Mara", "Gilau", 6, 50);
        PartTimeEmployee angajatPart2 = new PartTimeEmployee("Pasca", "Mures", 4, 30);
        PartTimeEmployee angajatPart3 = new PartTimeEmployee("Popa", "Aiud", 6, 80);
        //Creare lista de obieste tip PartTimeEmployee
        List<PartTimeEmployee> employeePartTimeList = new ArrayList<PartTimeEmployee>();
        employeePartTimeList.add(0, angajatPart1);
        employeePartTimeList.add(1, angajatPart2);
        employeePartTimeList.add(2, angajatPart3);
        List<PartTimeEmployee> rezulta = manager.filterEmployeeByNrOfHoursWorked(employeePartTimeList, 6);
        System.out.println(rezulta);
    }
}
