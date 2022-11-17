package ru.mirea.test.task16;
import javax.swing.*;

public class Password extends JFrame{
    private Password(){
        JLabel label1 = new JLabel("Service:");
        label1.setBounds(10,15, 110, 15);
        JLabel label2 = new JLabel("User name:");
        label2.setBounds(10,55, 110, 15);
        JLabel label3 = new JLabel("Password:");
        label3.setBounds(10,95, 110, 15);
        JLabel label4 = new JLabel("");
        label3.setBounds(10,135, 110, 15);

        JFrame f = new JFrame("Password application");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea Service = new JTextArea();
        Service.setSize(100, 100);
        Service.setBounds(110, 15, 250, 20);

        JTextArea Username = new JTextArea();
        Username.setSize(100, 100);
        Username.setBounds(110, 55, 250, 20);

        JTextArea Password = new JTextArea();
        Password.setSize(100, 100);
        Password.setBounds(110, 95, 250, 20);
        f.add(Service);f.add(Username); f.add(Password);
        f.add(label1);f.add(label2); f.add(label3); f.add(label4);
        f.setSize(400,250);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Password();
    }
}
