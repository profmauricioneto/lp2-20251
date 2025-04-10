package org.unichristus.review.exercise01;

import org.unichristus.Calculator;

public class Teste {
    public static void main(String[] args) {
        double[] elements = {1.1, 1.2, 1.3};
        Calculator calc = new CalculatorImplementation();
        System.out.println(calc.sum(elements));
    }
}
