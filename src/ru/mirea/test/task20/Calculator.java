package ru.mirea.test.task20;

public class Calculator
{
    public static <T extends Number> double sum(T o1, T o2) {
        return o1.doubleValue() + o2.doubleValue();
    }

    public static <T extends Number> double multiply(T o1, T o2) {
        return o1.doubleValue() * o2.doubleValue();
    }

    public static <T extends Number> double divide(T o1, T o2) {
        return o1.doubleValue() / o2.doubleValue();
    }

    public static <T extends Number> double subtraction(T o1, T o2) {
        return o1.doubleValue() - o2.doubleValue();
    }

    public static void main(String[] args) {
        Integer o1 = 200;
        Long o2 = 16L;

        System.out.println("Initial numbers: " + o1 + " and " + o2);
        System.out.println("Sum: " + Calculator.sum(o1, o2));
        System.out.println("Multiplication: " + Calculator.multiply(o1, o2));
        System.out.println("Division: " + Calculator.divide(o1, o2));
        System.out.println("Subtraction: " + Calculator.subtraction(o1, o2));
    }
}