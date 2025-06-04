package org.example.calculator;

public class Calculator {

    public int sum(int i, int i1) {
        return i + i1;
    }

    public int sub(int i, int i1) {
        return i - i1;
    }

    public int multply(int i, int i1) {
        return i * i1;
    }

    public int divide(int i, int i1) {
        if (i1 == 0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return i / i1;
    }
}
