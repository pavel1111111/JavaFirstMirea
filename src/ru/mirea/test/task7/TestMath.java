package ru.mirea.test.task7;

public class TestMath {
    public static void main(String args[])
    {
        MathCalculable mc = new MathFunc(5,7);
        System.out.println("Ваше число: 5 + 7*i");
        mc.mod();
        mc.stepen(2);
    }
}
