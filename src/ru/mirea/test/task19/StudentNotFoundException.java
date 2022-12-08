package ru.mirea.test.task19;

public class StudentNotFoundException extends Exception
{
    public StudentNotFoundException() {
        super("Student not found");
    }
}