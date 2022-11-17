package ru.mirea.test.task1;

import ru.mirea.test.task3.rand;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0, num;
        System.out.println("Список команд");
        System.out.println("1 - выход");
        System.out.println("2 - сумма");
        System.out.println("3 - аргументы командной строки");
        System.out.println("4 - гармоничесский ряд");
        System.out.println("5 - факториал");
        while (choice != 1){
            System.out.println("Выберите выполняемую программу:");
            choice = input.nextInt();
            switch(choice){
                case 1:
                    break;
                case 2:
                    sum obj1 = new sum();
                    break;
                case 3:
                    for (String arg : args) System.out.println(arg);
                    break;
                case 4:
                    harmon obj2 = new harmon();
                    break;
                case 5:
                    System.out.println("Введите число: ");
                    num = input.nextInt();
                    factorial obj4 = new factorial(num);
                    break;
                default:
                    System.out.println("Введенной команды не существует");
                    break;
            }
        }
    }
}
