package com.en.elena.courseoop.course1;

public class Main {

    public static void main(String[] args) {
    Product product1 = new Product("Book", "Books", 22);
    Product product2 = new Product("Chocolate", "Choco", 4);
    String nameProduct1 = product1.getName();
    double priceProduct2 = product2.getPrice();
        System.out.println("Problem 1");
        System.out.println(nameProduct1);
        System.out.println(priceProduct2);
     //change name for product1
    product1.setName("News");
    System.out.println(nameProduct1);

    System.out.println("Problem 2");
    Person person1 = new Person("Popescu", "Ion", 35);
       int person1Age = person1.getAge();
        System.out.println(person1Age);
        person1.setAge(5);
        System.out.println(person1Age);

    }
}
