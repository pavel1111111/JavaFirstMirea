package ru.mirea.test.task5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Matches implements java.awt.event.ActionListener {
    private int MilanClicks = 0;
    private int MadridClicks = 0;
    private JLabel label = new JLabel("Number of clicks:  0     ");
    private JLabel label1 = new JLabel("Last Scorer: N/A");
    private JLabel label2 = new JLabel("Winner: DRAW");
    private JFrame frame = new JFrame();

    public Matches() {

        JButton button = new JButton("AC Milan");
        button.addActionListener(this);

        JButton button1 = new JButton("Real Madrid");
        button1.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(button1);
        panel.add(label);
        panel.add(label1);
        panel.add(label2);

        frame.add(panel, BorderLayout.WEST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("AC Milan vs Real Madrid");
        frame.pack();
        frame.setVisible(true);
    }

    // process the button clicks
    public void actionPerformed(ActionEvent e) {
        if("AC Milan".equals(e.getActionCommand())) {
            MilanClicks++;
            label1.setText("Latest Scorer: AC Milan");
        }
        if("Real Madrid".equals(e.getActionCommand())) {
            MadridClicks++;
            label1.setText("Latest Scorer: Real Madrid");
        }
        if(MilanClicks > MadridClicks)
            label2.setText("Winner: AC Milan");
        else if (MilanClicks < MadridClicks)
            label2.setText("Winner: Real Madrid");
        else
            label2.setText("Winner: DRAW");
        label.setText("Result:  " + MilanClicks + " x " + MadridClicks);
    }

    // create one Frame
    public static void main(String[] args) {
        new Matches();
    }
}