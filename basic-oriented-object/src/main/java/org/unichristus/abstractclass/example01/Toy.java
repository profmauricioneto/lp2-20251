package org.unichristus.abstractclass.example01;

public class Toy extends Product {
    public Toy(String name, double price){
        super(name, price);
    }

    @Override
    public void update(String name, double price) {
       this.name = name;
       this.price = price;
    }

    @Override
    public void showInformation() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
