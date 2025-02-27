package org.unichristus.inheritance.example1;

public class Fusca extends Carro {
    public String brand;
    public Fusca(String brand) {
        super();
        this.brand = brand;
    }
    public Fusca(String color, String model, String brand) {
        super(color, model);
        this.brand = brand;
    }
    @Override
    public void showStatus() {
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
    }
}
