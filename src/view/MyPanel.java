package view;

import javax.swing.*;

public class MyPanel extends JPanel {
    public MyPanel() {
        JTextField textField = new JTextField("   ");
        JTextField textField1 = new JTextField("   ");
        JButton button = new JButton("null");
        add(textField);
        add(textField1);
        add(button);
        button.addActionListener();
    }
}
