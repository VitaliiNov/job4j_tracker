package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return x + z;
    }

    public int divide(int z) {
        return z / x;
    }

    public int sumAllOperation(int z) {
        return sum(z) + minus(z) + multiply(z) + divide(z);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        result = Calculator.minus(3);
        System.out.println(result);
        Calculator primer = new Calculator();
        System.out.println(primer.multiply(5));
        System.out.println(primer.divide(10));
        System.out.println(primer.sumAllOperation(20));
    }
}
