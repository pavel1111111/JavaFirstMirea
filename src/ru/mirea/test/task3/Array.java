package ru.mirea.test.task3;

public class Array {
    public static void main(String[] args){
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
            System.out.print(arr[i] + " ");
        }
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
             if (arr[i] >= arr[i + 1]) {
                flag = false;
             }
        }
        if(flag)
            System.out.println("\nМассив является строго возрастающей прогрессией");
        else
            System.out.println("\nМассив не является строго возрастающей прогрессией");
    }
}
