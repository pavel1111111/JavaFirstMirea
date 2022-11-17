package ru.mirea.test.task4;

import java.util.Scanner;

public class Favorite {
    public enum Season{
        Лето, Осень, Зима, Весна
    }

    public static void main(String[] args) {
        Season fav;
        Scanner input = new Scanner(System.in);
        String choice;
        boolean flag = true;
        while(flag){
            System.out.println("Введите ваше любимое время года с заглавной буквы:");
            choice = input.next();
            switch (choice) {
            case "Лето":
                fav = Season.Лето;
                flag = false;
                break;
            case "Осень":
                fav = Season.Осень;
                flag = false;
                break;
            case "Зима":
                fav = Season.Зима;
                flag = false;
                break;
            case "Весна":
                fav = Season.Весна;
                flag = false;
                break;
            default:
                System.out.println("Нет такого времени года");
            }
        }
    }

    public void ILove(Season love){
        switch(love) {
            case Лето:
                System.out.println("Я люблю лето");
                break;
            case Осень:
                System.out.println("Я люблю осень");
                break;
            case Зима:
                System.out.println("Я люблю зиму");
                break;
            case Весна:
                System.out.println("Я люблю весну");
                break;
        }
    }
}
