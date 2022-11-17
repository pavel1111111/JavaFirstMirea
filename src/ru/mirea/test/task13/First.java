package ru.mirea.test.task13;

import java.util.Arrays;
import java.util.Scanner;

public class First {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        AnyString(str);
    }

    static void AnyString(String str){
        int len = str.length();
        System.out.println("Последний символ: ");
        System.out.println(str.charAt(len - 1));
        if(str.endsWith("!!!"))
            System.out.println("Строка заканчивается на '!!!' ");
        else
            System.out.println("Строка не заканчивается на '!!!' ");
        if(str.startsWith("I like"))
            System.out.println("Строка начинается на 'I like' ");
        else
            System.out.println("Строка не начинается на 'I like' ");
        if(str.contains("Java")) {
            System.out.println("Строка содержит 'Java' ");
            System.out.print("Позиция подстроки 'Java' в строке: ");
            System.out.println(getIndex(str, "Java"));
        }
        else
            System.out.println("Строка не содержит 'Java' ");
        String str1 = str.replace('a','o');
        System.out.print("Строка, в которой а заменена на о: ");
        System.out.println(str1);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }

    static int getIndex(String str, String substring)
    {
        return Arrays.asList(str.split("\\s+")).indexOf(substring)+1;
    }
}
