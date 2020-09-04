// Main.java

package com.company;

import java.awt.*;
import javax.swing.*;

class Main extends JFrame {
    int rand = (int) (Math.random() * 10);
    int attemps = 3;

    JTextField input = new JTextField(20);
    JButton btn = new JButton("ok.");

    void process()
    {
        try {
            int t = Integer.parseInt(input.getText());

            if (t > rand)
                JOptionPane.showMessageDialog(
                        null,
                        String.format("Искомое число меньше.\nОставшиеся попытки: %d", attemps--),
                        "Важная информация",
                        JOptionPane.INFORMATION_MESSAGE);

            else if (t < rand)
                JOptionPane.showMessageDialog(
                        null,
                        String.format("Искомое число больше.\nОставшиеся попытки: %d", attemps--),
                        "Важная информация",
                        JOptionPane.INFORMATION_MESSAGE);

            else {
                JOptionPane.showMessageDialog(
                        null,
                        String.format("Вы выиграли!", attemps--),
                        "Важная информация",
                        JOptionPane.INFORMATION_MESSAGE);

                System.exit(0);
            }

            if (attemps < 0) { System.exit(0); }
        } catch (Exception ignored) { }
    }

    public Main() {
        super("lab 6");
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setSize(300, 100);
        setLayout(new FlowLayout());

        add(input);
        add(btn);

        btn.addActionListener(t -> {
            process();
        });
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}