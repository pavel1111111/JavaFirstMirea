package ru.mirea.test.task6;

import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.println("1 - точка, 2 - круг, 3 - прямоугольник");
        Scanner input = new Scanner(System.in);
        int ch = input.nextInt();
        String choice;
        int x, y, xSpeed, ySpeed, radius;
        if(ch == 1){
            System.out.println("Введите координаты точки и скорость по координатам:");
            x = input.nextInt();
            y = input.nextInt();
            xSpeed = input.nextInt();
            ySpeed = input.nextInt();
            MovablePoint point = new MovablePoint(x,y,xSpeed,ySpeed);
            System.out.println("w - вверх, a - влево, s - вниз, d - вправо, e - завершение");
            choice = input.next();
            while(!Objects.equals(choice, "e"))
            {
                switch (choice){
                    case "w":
                        point.moveUp();
                        break;
                    case "s":
                        point.moveDown();
                        break;
                    case "a":
                        point.moveLeft();
                        break;
                    case "d":
                        point.moveRight();
                        break;
                    case "e":
                        break;
                    default:
                        System.out.println("Нет такой команды!");
                        break;
                }
                System.out.println(point);
                choice = input.next();
            }
        }
        else if(ch == 2){
            System.out.println("Введите координаты центра, скорость по координатам и радиус:");
            x = input.nextInt();
            y = input.nextInt();
            xSpeed = input.nextInt();
            ySpeed = input.nextInt();
            radius = input.nextInt();
            MovableCircle circle = new MovableCircle(radius,x,y,xSpeed,ySpeed);
            System.out.println("w - вверх, a - влево, s - вниз, d - вправо, e - завершение");
            choice = input.next();
            while(!Objects.equals(choice, "e"))
            {
                switch (choice){
                    case "w":
                        circle.moveUp();
                        break;
                    case "s":
                        circle.moveDown();
                        break;
                    case "a":
                        circle.moveLeft();
                        break;
                    case "d":
                        circle.moveRight();
                        break;
                    case "e":
                        break;
                    default:
                        System.out.println("Нет такой команды!");
                        break;
                }
                choice = input.next();
            }
        }
        else if (ch == 3) {
            System.out.println("Введите скорости по осям,координаты левой верхней и нижней правой точек:");
            xSpeed = input.nextInt();
            ySpeed = input.nextInt();
            x = input.nextInt();
            y = input.nextInt();
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            MovableRectangle rectangle = new MovableRectangle(x,y,x1,y1, xSpeed, ySpeed);
            System.out.println("w - вверх, a - влево, s - вниз, d - вправо, e - завершение");
            choice = input.next();
            while(!Objects.equals(choice, "e"))
            {
                switch (choice){
                    case "w":
                        rectangle.moveUp();
                        break;
                    case "s":
                        rectangle.moveDown();
                        break;
                    case "a":
                        rectangle.moveLeft();
                        break;
                    case "d":
                        rectangle.moveRight();
                        break;
                    case "e":
                        break;
                    default:
                        System.out.println("Нет такой команды!");
                        break;
                }
                choice = input.next();
            }
        }
        else{
            System.out.println("Введено некорректное значение!");
        }
    }
}
