package controller;

import Model.Cat;
import view.MyFrame;
import view.MyPanel;

public class Controller {
    Cat cat;
    MyPanel panel;
    MyFrame frame;
    public Controller() {
        Cat cat = new Cat();
        MyPanel panel = new MyPanel();
        MyFrame frame = new MyFrame(panel);
    }

    public static void main(String[] args) {
       new Controller();

    }

    public void setAge(int f) {
        cat.setAge(f);
    }
}
