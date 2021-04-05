package com.en.cristian.oop.problema4;

import com.en.cristian.oop.ObjectManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("----------------------------------problema4------------------------------------------");
//        Employee employee1=new Employee("Mihai", "Marasti");
//        FullTimeEmployee fullEmployee1=new FullTimeEmployee("Gicu","Mehedinti", 4029);
//        fullEmployee1.calculatePay();
//        fullEmployee1.setMonthlySalary(4129);
//        System.out.println(fullEmployee1.getMonthlySalary());
//        PartTimeEmployee partEmployee1=new PartTimeEmployee("Sever", "Bucegi", 20, 25);
//        System.out.println(partEmployee1.toString());
//        partEmployee1.setNrOfHoursWorked(56);
//        partEmployee1.setPricePerHour(25);
//        System.out.println(partEmployee1.calculatePay());
        ObjectManager manager = new ObjectManager();

        System.out.println("EMPLOYEES");
        List<Employee> employeeList = new ArrayList<Employee>();
        Employee empl1 = new Employee("Zora","Observatorului, nr.3A");
        Employee empl2 = new Employee("Nicu", "Floresti, 55C");
        Employee empl3 = new Employee("Alina","A.Muresanu, nr.15");

        employeeList.add(0, empl1);
        employeeList.add(1, empl2);
        employeeList.add(2, empl3);

        boolean searchEmpl1 = manager.searchEmployeeByAddress(employeeList, "Zorilor");
        System.out.println(searchEmpl1);
        boolean searchEmpl2 = manager.searchEmployeeByAddress(employeeList, "Floresti, 55C");
        System.out.println(searchEmpl2);
        boolean searchEmpl3 = manager.searchEmployeeByAddress(employeeList, "Manastur");
        System.out.println(searchEmpl3);

        System.out.println("PART TIME EMPLOYEES");
        List<PartTimeEmployee> partTimeList = new ArrayList<PartTimeEmployee>();
        PartTimeEmployee partTimeEmpl1= new PartTimeEmployee("Mircea","Gilau 12B",80,2489);
        PartTimeEmployee partTimeEmpl2= new PartTimeEmployee("Nina","Bistritei 17S",90,3109);
        PartTimeEmployee partTimeEmpl3= new PartTimeEmployee("Nela","Manastur 12C",65,2849);

        partTimeList.add(0,partTimeEmpl1);
        partTimeList.add(1,partTimeEmpl2);
        partTimeList.add(2,partTimeEmpl3);

        List<PartTimeEmployee> partTime1=manager.filterEmployeeByNrOfHoursWorked(partTimeList, 90);
        System.out.println(partTime1);
        List<PartTimeEmployee> partTime2=manager.filterEmployeeByNrOfHoursWorked(partTimeList, 65);
        System.out.println(partTime2);
    }
}

