package com.javatests.j2ee.javatest;

public class Article {
    private String name;
    private double price;

    public Article(String name, double price) {
        if (name == null || name.isEmpty() || price < 0) {
            throw new IllegalArgumentException("Nom ou prix invalide");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean updatePrice(double newPrice) {
        if (newPrice < 0) {
            return false;
        }
        this.price = newPrice;
        return true;
    }

    public boolean updateName(String newName) {
        if (newName == null || newName.isEmpty()) {
            return false;
        }
        this.name = newName;
        return true;
    }
}
