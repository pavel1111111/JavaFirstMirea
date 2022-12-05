package ru.mirea.test.task7;

public class TestMovable
{
    public static void main(String args[])
    {
        Movable two = new MovableRectangle(1,5,5,3,4,1);
        System.out.println();
        System.out.println("Начальная позиция");
        System.out.println(two.toString());
        System.out.println();
        System.out.println("ВПРАВО");
        two.moveRight();
        System.out.println(two.toString());
        System.out.println();
        System.out.println("ВВЕРХ");
        two.moveUp();
        System.out.println(two.toString());
        System.out.println();
        System.out.println("ВЛЕВО");
        two.moveLeft();
        System.out.println(two.toString());
        System.out.println();
        two.SpeedTest(1, 4);
    }
}