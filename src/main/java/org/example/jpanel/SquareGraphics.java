package org.example.jpanel;

import javax.swing.*;
import java.awt.*;

public class SquareGraphics extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 100);
        g.clearRect(30, 30, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Square JAVA drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        SquareGraphics panel = new SquareGraphics();
        frame.add(panel);

        frame.setVisible(true);
    }
}