package org.example;

import org.example.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.sum(7,3);
        int sub = calculator.sub(5,3);
        int multiply = calculator.multply(3,3);
        int divide = calculator.divide(8,2);

        System.out.println("Sum result: " + sum);
        System.out.println("Subtraction result: " + sub);
        System.out.println("Multiplication result: " + multiply);
        System.out.println("Division result: " + divide);

        try {
            calculator.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error while dividing: " + e.getMessage());
        }
    }
}