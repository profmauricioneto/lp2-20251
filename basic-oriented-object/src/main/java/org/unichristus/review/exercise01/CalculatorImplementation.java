package org.unichristus.review.exercise01;

import org.unichristus.Calculator;

public class CalculatorImplementation implements Calculator {
    @Override
    public double sum(double[] args) {
        double total = 0;
        for(double value: args) {
            total+=value;
        }
        return total;
    }

    @Override
    public double substraction(double[] args) {
        double total = 0;
        for(double value: args) {
            total-=value;
        }
        return total;
    }

    @Override
    public double multiply(double[] args) {
        double total = 0;
        for(double value: args) {
            total*=value;
        }
        return total;
    }

    @Override
    public double divider(double[] args) {
        double total = 0;
        for(double value: args) {
            total/=value;
        }
        return total;
    }
}
