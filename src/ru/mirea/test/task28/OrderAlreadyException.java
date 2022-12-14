package ru.mirea.test.task28;

public class OrderAlreadyException extends Exception
{
    public OrderAlreadyException(int ex){
        super("Order is already added at " + ex + " table");
    }
}