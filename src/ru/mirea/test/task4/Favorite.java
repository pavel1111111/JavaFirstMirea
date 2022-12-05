package ru.mirea.test.task4;

public class Favorite {
    public static void main(String[] args){
        Season season1 = Season.SUMMER;
        System.out.println(season1);
        print(Season.SPRING);
        printAllValues();
        Season season2 = Season.valueOf("WINTER");
        System.out.println(season2);
    }

    public static void print(Season season){
        switch (season) {
            case WINTER:
                System.out.println("Мне нравится зима");
                break;
            case SPRING:
                System.out.println("Мне нравится весна");
                break;
            case SUMMER:
                System.out.println("Мне нравится лето");
                break;
            case AUTUMN:
                System.out.println("Мне нравится осен");
                break;
        }
    }

    public static void printAllValues(){
        for (Season s: Season.values()){
            System.out.println(s + " " + s.getAvgTemp()+ " " + s.getDescription());
        }
    }
}
