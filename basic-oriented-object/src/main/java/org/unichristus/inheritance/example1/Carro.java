package org.unichristus.inheritance.example1;

public class Carro {
    public String color;
    public String model;
    public Carro(String color, String model) {
        this.color = color;
        this.model = model;
    }
    public Carro() {
        this.color = "Unknown";
        this.model = "Unknown";
    }
    public void showStatus() {
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
    }
}
