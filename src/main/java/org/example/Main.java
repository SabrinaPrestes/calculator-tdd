package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.calculator.Calculator;
@Slf4j
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.sum(7,3);
        int sub = calculator.sub(5,3);
        int multiply = calculator.multply(3,3);
        int divide = calculator.divide(8,2);

       log.info("Sum result: {}", sum);
       log.info("Subtraction result: {}", sub);
       log.info("Multiplication result: {}", multiply);
       log.info("Division result: {}", divide);

        try {
            calculator.divide(10, 0);
        } catch (ArithmeticException e) {
            log.error("Error while dividing: ", e.getMessage());
        }
    }
}