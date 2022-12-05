package ru.mirea.test.task10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TestStudent
{
    public static void main(String[] args)
    {
        Student st1 = new Student("A", "AA", "a", 1, 1);
        Student st2 = new Student("B", "BB", "b", 3, 5);
        Student st3 = new Student("C", "CC", "c", 2, 12);
        Student st4 = new Student("D", "DD", "d", 4, 2);
        ArrayList<Student> IDNumber = new ArrayList<Student>();
        IDNumber.add(st1);
        IDNumber.add(st2);
        IDNumber.add(st3);
        IDNumber.add(st4);
        for(Student s: IDNumber)
        {
            System.out.println(s.toString());
        }
        Compare myPriceComparator = new Compare();
        IDNumber.sort(myPriceComparator);

        System.out.println("Sorted: ");
        for(Student s: IDNumber)
        {
            System.out.println(s.toString());
        }
    }
}
