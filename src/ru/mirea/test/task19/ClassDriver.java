package ru.mirea.test.task19;

public class ClassDriver
{
    public static void main(String[] args) {
        Class Class = new Class();
        ClassUI ui = new ClassUI(Class);
        try {
            ui.run();
        } catch (EmptyStr e) {
            System.out.println(e.getMessage());
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}