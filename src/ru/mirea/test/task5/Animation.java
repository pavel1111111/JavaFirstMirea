package ru.mirea.test.task5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

class Animation extends JFrame
{
    private JFrame frame = new JFrame();

    public static void main(String[] args) throws IOException, InterruptedException {
        Animation image = new Animation();
    }

    public Animation() throws IOException, InterruptedException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        BufferedImage picture = ImageIO.read(new File("C:/Users/lslks/Desktop/img" + 1 + ".png"));
        JLabel background = new JLabel(new ImageIcon(picture));
        add(background);
        background.setLayout(new FlowLayout());
        background.add(new JButton("Image"));
        setSize(1000, 500);
        setVisible(true);
        ImageIcon[] images = new ImageIcon[8];
        for (int i = 0; i < 8; i++){
            picture = ImageIO.read(new File("C:/Users/lslks/Desktop/img" + (i+1) + ".png"));
            images[i]=new ImageIcon(picture);
        }
        while(true) {
            for (int i = 0; i < 8; i++) {
                background.setIcon(images[i]);
                TimeUnit.MILLISECONDS.sleep(1000);
            }
        }
    }
}