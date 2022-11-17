package ru.mirea.test.task5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image extends JFrame{

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        Image image = new Image(file);
    }

    public Image(File file) throws IOException {
        setLayout(new BorderLayout());
        BufferedImage picture = ImageIO.read(file);
        JLabel background = new JLabel(new ImageIcon(picture));
        add(background);
        background.setLayout(new FlowLayout());
        background.add(new JButton("Image"));
        setSize(300, 300);
        setVisible(true);
    }
}
