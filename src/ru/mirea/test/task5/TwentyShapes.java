package ru.mirea.test.task5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
public class TwentyShapes extends JFrame{

    public static void main(String[] args){
        new TwentyShapes();
    }

    TwentyShapes(){
        super("Twenty random shapes");
        setSize(600, 600);
        setBackground(Color.BLACK);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
