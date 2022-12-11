package org.example.jpanel;

import javax.swing.*;

public class DialogueBox {
    public static void main(String[] args) {

        String qOne = JOptionPane.showInputDialog("Podaj wiek?");
        int age = Integer.parseInt(qOne);
        if (age < 18) {
            JOptionPane.showMessageDialog(null, "Dzieci nie mają dostępu do programu!");
        } else if (age > 17 && age < 30) {
            JOptionPane.showMessageDialog(null, "Jesteś średniowieczna DUPA");
        } else {
            JOptionPane.showMessageDialog(null, "Stara DUPA");
        }
    }
}
