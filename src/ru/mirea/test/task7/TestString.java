package ru.mirea.test.task7;

public class TestString
{
    public static void main(String args[])
    {
        StrFunc st = new StrFunc("ABCAAB");
        st.counter();
        st.returnSt();
        System.out.println();
        st.invert();

    }
}