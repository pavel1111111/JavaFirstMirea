package ru.mirea.test.task30;

public class OrderAlreadyException extends Exception
{
    public OrderAlreadyException(int num){
        super("The table " + num + " is added!");
    }
}