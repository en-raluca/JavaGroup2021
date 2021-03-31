package com.en.elena.practiceoop.pb3;

public class Animal {
    private String name;
    private String category;

    public Animal(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public void makeSound() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
