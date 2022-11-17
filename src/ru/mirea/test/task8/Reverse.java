package ru.mirea.test.task8;

import java.util.Scanner;

public class Reverse {
    public static void main(String  args[]){
        System.out.println("Введите число:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(func(0, n));
    }
    static int func(int rev, int number)
    {
        if (number == 0) {
            return rev;
        }
        else {
            return func( 10 * rev + number % 10,number / 10);
        }
    }
}
