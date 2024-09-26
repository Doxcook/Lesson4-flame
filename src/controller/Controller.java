package controller;

import Model.Cat;
import view.MyFrame;
import view.MyPanel;

public class Controller {
    public static void main(String[] args) {
        Cat cat = new Cat();
        MyPanel panel = new MyPanel();
        MyFrame frame = new MyFrame(panel);

    }
}
