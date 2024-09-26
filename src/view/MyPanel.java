package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    public MyPanel() {
        JTextField textField = new JTextField("   ");
        JTextField textField1 = new JTextField("   ");
        JButton button = new JButton("null");
        add(textField);
        add(textField1);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
