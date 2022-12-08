package ru.mirea.test.task22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GrCalculator implements java.awt.event.ActionListener{

    String operation  = "";
    boolean operand  =  false;
    char op;
    private JLabel label = new JLabel("");

    public static void main(String[] args) {
        new GrCalculator();
    }

    public void actionPerformed(ActionEvent e){
        if("1".equals(e.getActionCommand())) {
            operation += 1;
            label.setText(operation);
        }
        if("2".equals(e.getActionCommand())) {
            operation += 2;
            label.setText(operation);
        }
        if("3".equals(e.getActionCommand())) {
            operation += 3;
            label.setText(operation);
        }
        if("4".equals(e.getActionCommand())) {
            operation += 4;
            label.setText(operation);
        }
        if("5".equals(e.getActionCommand())) {
            operation += 5;
            label.setText(operation);
        }
        if("6".equals(e.getActionCommand())) {
            operation += 6;
            label.setText(operation);
        }
        if("7".equals(e.getActionCommand())) {
            operation += 7;
            label.setText(operation);
        }
        if("8".equals(e.getActionCommand())) {
            operation += 8;
            label.setText(operation);
        }
        if("9".equals(e.getActionCommand())) {
            operation += 9;
            label.setText(operation);
        }
        if("0".equals(e.getActionCommand())) {
            operation += 0;
            label.setText(operation);
        }
        if("+".equals(e.getActionCommand())) {
            int x = operation.charAt(operation.length() - 1) -  48;
            if ((x <= 9)&&(x>=0)&&!operand) {
                operand = true;
                op = '+';
                operation += '+';
            }
            label.setText(operation);
        }

        if("-".equals(e.getActionCommand())) {
            int x = operation.charAt(operation.length() - 1) -  48;
            if ((x <= 9)&&(x>=0)&&!operand) {
                operand = true;
                op = '-';
                operation += '-';
            }
            label.setText(operation);
        }
        if("*".equals(e.getActionCommand())) {
            int x = operation.charAt(operation.length() - 1) -  48;
            if ((x <= 9)&&(x>=0)&&!operand) {
                operand = true;
                operation += '*';
                op = '*';
            }
            label.setText(operation);
        }
        if("/".equals(e.getActionCommand())) {
            int x = operation.charAt(operation.length() - 1) -  48;
            if ((x <= 9)&&(x>=0)&&!operand) {
                operand = true;
                operation += '/';
                op = '/';
            }
            label.setText(operation);
        }
        if("=".equals(e.getActionCommand())) {
            double result  = 0;
            int x = operation.charAt(operation.length() - 1) -  48;
            if ((x <= 9)&&(x>=0)&&operand) {
                int a = 0;
                int b = 0;
                a = Integer.parseInt(operation.substring(0,operation.indexOf(op)));
                b = Integer.parseInt(operation.substring(operation.indexOf(op)+1));
                switch(op) {
                    case ('+'):
                        result = a + b;
                        break;
                    case  ('-'):
                        result = a - b;
                        break;
                    case ('*'):
                        result = a*b;
                        break;
                    case('/'):
                        result = (double)(a)/(double)(b);
                        break;
                }
                operand = false;
                operation = "";
                label.setText(String.valueOf(result));
            }
        }
    }

    public GrCalculator(){
        JFrame f = new JFrame("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TextField tf = new TextField("");
        label.setBounds(10,10, 300,70);

        Button b7 = new Button("7");
        b7.setBounds(10,100,60,30);
        b7.setSize(70,40);
        b7.addActionListener(this);

        Button b8 = new Button("8");
        b8.setBounds(90,100,60,30);
        b8.setSize(70,40);
        b8.addActionListener(this);

        Button b9 = new Button("9");
        b9.setBounds(170,100,60,30);
        b9.setSize(70,40);
        b9.addActionListener(this);

        Button bdiv = new Button("/");
        bdiv.setBounds(250,100,60,30);
        bdiv.setSize(70,40);
        bdiv.addActionListener(this);

        Button b4 = new Button("4");
        b4.setBounds(10,150,60,30);
        b4.setSize(70,40);
        b4.addActionListener(this);

        Button b5 = new Button("5");
        b5.setBounds(90,150,60,30);
        b5.setSize(70,40);
        b5.addActionListener(this);

        Button b6 = new Button("6");
        b6.setBounds(170,150,60,30);
        b6.setSize(70,40);
        b6.addActionListener(this);

        Button bmul = new Button("*");
        bmul.setBounds(250,150,60,30);
        bmul.setSize(70,40);
        bmul.addActionListener(this);

        Button b1 = new Button("1");
        b1.setBounds(10,200,60,30);
        b1.setSize(70,40);
        b1.addActionListener(this);

        Button b2 = new Button("2");
        b2.setBounds(90,200,60,30);
        b2.setSize(70,40);
        b2.addActionListener(this);

        Button b3 = new Button("3");
        b3.setBounds(170,200,60,30);
        b3.setSize(70,40);
        b3.addActionListener(this);

        Button bmin = new Button("-");
        bmin.setBounds(250,200,60,30);
        bmin.setSize(70,40);
        bmin.addActionListener(this);

        Button b0 = new Button("0");
        b0.setBounds(10,250,60,30);
        b0.setSize(70,40);
        b0.addActionListener(this);

        Button bdot = new Button(".");
        bdot.setBounds(90,250,60,30);
        bdot.setSize(70,40);
        bdot.addActionListener(this);

        Button beq = new Button("=");
        beq.setBounds(170,250,60,30);
        beq.setSize(70,40);
        beq.addActionListener(this);

        Button bpl = new Button("+");
        bpl.setBounds(250,250,60,30);
        bpl.setSize(70,40);
        bpl.addActionListener(this);

        f.add(b7);f.add(label);f.add(b8);f.add(b9);f.add(bdiv);
        f.add(b4);f.add(b5);f.add(b6);f.add(bmul);
        f.add(b1);f.add(b2);f.add(b3);f.add(bmin);
        f.add(b0);f.add(bdot);f.add(beq);f.add(bpl);
        f.setSize(350,350);
        f.setLayout(null);
        f.setVisible(true);
    }
}
