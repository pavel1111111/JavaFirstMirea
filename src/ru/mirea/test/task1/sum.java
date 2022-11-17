package ru.mirea.test.task1;

import java.util.Arrays;
import java.util.Scanner;

public class sum {
    public sum(){
        Scanner input = new Scanner(System.in);
        int size, sumfor = 0, sumwhile = 0, sumdo = 0;
        do {
            System.out.println("Введите количество элементов массива: ");
            size = input.nextInt();
        } while (size <= 0);
        int[] Array = new int[size];
        System.out.println("Введите массив: ");

        for (int i = 0; i < size; i++) {
            Array[i] = input.nextInt();
            sumfor += Array[i];
        }

        int max = Array[0], min = Array[0];
        int i = size - 1;

        while (i >= 0) {
            sumwhile += Array[i];
            if(Array[i] > max)
                max = Array[i];
            if (Array[i] < min)
                min = Array[i];
            i--;
        }

        do {
            sumdo += Array[size - 1];
            size--;
        } while (size > 0);
        System.out.println("Сумма элементов массива: ");
        System.out.println("Через for: " + sumfor);
        System.out.println("Через while: " + sumwhile);
        System.out.println("Через do while: " + sumdo);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Среднее арифметическое: " + (double)sumfor/(double)Array.length);
    }
}
