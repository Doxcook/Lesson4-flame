package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    int age =15;
    public MyPanel() {
        JTextField textField = new JTextField("                          ");
        JTextField textField1 = new JTextField("                         ");
        JButton button = new JButton("Go");
        add(textField);
        add(textField1);
        add(button);
        button.addActionListener(
                new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    String first = textField.getText().trim();
                    try {
                        int f = Integer.parseInt(first);
                        textField1.setText("" + f * age);
                    }
                    catch (NumberFormatException a){
                        textField.setText("Try imput");
                    }
                }
            }
        );
    }
}
