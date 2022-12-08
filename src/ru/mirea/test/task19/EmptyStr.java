package ru.mirea.test.task19;

public class EmptyStr extends  Exception{
    public EmptyStr() {
        super("Empty string is not allowed");
    }
}