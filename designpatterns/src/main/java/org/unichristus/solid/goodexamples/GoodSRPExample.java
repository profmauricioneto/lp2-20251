/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unichristus.solid.goodexamples;

class SquareSRP {
    public double length;
    public SquareSRP() {
        this.length = 0;
    }
    public SquareSRP(double length) {
        this.length = length;
    }
    public double areaSquare() {
        return length*length;
    }
    public void drawSquare() {
        System.out.println("Drawing a square!");
    }
}

class Triangle {
    public double length;
    public double height;
    public Triangle() {
        this.height = 0;
        this.length = 0;
    }
    public Triangle(double length, double height) {
        this.height = height;
        this.length = length;
    }
    public double areaTriangle() {
        double area = (length * height)/2;
        return area;
    }
    public void drawTriangle() {
        System.out.println("Drawing a triangle!");
    }
}

/**
 *
 * @author maumneto
 */
public class GoodSRPExample {
    public static void main(String[] args) {
        SquareSRP square = new SquareSRP(5);
        System.out.format("Area: %f\n", square.areaSquare());
        square.drawSquare();
        
        Triangle triangle = new Triangle(5,6);
        System.out.format("Area: %f\n", triangle.areaTriangle());
        triangle.drawTriangle();
    }
}
