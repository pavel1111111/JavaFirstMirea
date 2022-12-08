package ru.mirea.test.task20;

public class GenericTest
{
    public static void main(String[] args) {
        Integer obj1 = 4;
        Animal dog = new Animal("casey", 3);
        double[] array = new double[]{5.0, 0.00, 1.0};
        Generic genericClass = new Generic(obj1, dog, array);
        genericClass.printAllVars();
    }
}