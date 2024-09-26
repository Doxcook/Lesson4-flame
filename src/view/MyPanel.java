package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controller.Controller;

public class MyPanel extends JPanel {
    private Controller controller;

    public MyPanel(Controller controller) {
        this.controller = controller;

        JTextField textField = new JTextField("                        ");
        JTextField textField1 = new JTextField("                        ");
        JButton button = new JButton("Go");

        add(textField);
        textField.setBounds(10,10,150,50);
        add(textField1);
        textField.setBounds(20,20,150,50);
        add(button);
        textField.setBounds(20,20,150,50);

        button.addActionListener(
                new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    String first = textField.getText().trim();
                    try {
                        int f = Integer.parseInt(first);
                        controller.setAge(f);
                        textField1.setText("" + f * 1);
                    }
                    catch (NumberFormatException a){
                        textField.setText("Try imput");
                    }
                }
            }
        );
    }
}
