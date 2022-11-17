package ru.mirea.test.task3;
import java.util.Vector;
import java.util.Scanner;

public class Tester {
    public static Vector<Circle> circles = new Vector<>();
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ch = 1;
        double x, y;
        while(ch != 2){
            System.out.println("Введите координаты центра X и Y:");
            x = input.nextDouble();
            y = input.nextDouble();
            Point point = new Point(x, y);
            circles.addElement(new Circle(point));
            System.out.println("Добавить еще окружность? (1 - да, 2 - нет)");
            ch = input.nextInt();
        }
        System.out.println("Список окружностей:");
        for (int i=0;i < circles.size(); i++)
            System.out.println("Окружность №" + (i+1) + ": "+circles.get(i).toString());
        System.out.println("Самая маленькая - окружность №" + Smallest());
        System.out.println("Самая большая - окружность №" + Biggest());
        Sort();
        System.out.println("Отсортированный массив:");
        for (int i=0;i < circles.size(); i++)
            System.out.println("Окружность №" + (i+1) + ": "+circles.get(i).toString());
    }

    public static int Biggest(){
        int index = 0;
        for (int i=0; i < circles.size();i++){
            if (circles.get(i).GetSize() > circles.get(index).GetSize())
                index = i;
        }
        return index + 1;
    }

    public static int Smallest(){
        int index = 0;
        for (int i = 0; i < circles.size();i++){
            if (circles.get(i).GetSize() < circles.get(index).GetSize())
                index = i;
        }
        return index + 1;
    }

    public static void Sort(){
        for (int i = 0; i < circles.size();i++){
            for(int j = 1; j < circles.size(); j++) {
                if (circles.get(j).GetSize() < circles.get(j - 1).GetSize()) {
                    Circle obj = circles.get(j - 1);
                    circles.set(j - 1, circles.get(j));
                    circles.set(j, obj);
                }
            }
        }
    }
}
