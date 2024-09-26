package controller;

import Model.Cat;
import view.MyFrame;
import view.MyPanel;

public class Controller {
    public Controller() {
        Cat cat = new Cat();
        MyPanel panel = new MyPanel();
        MyFrame frame = new MyFrame(panel);
    }

    public static void main(String[] args) {

       new Controller();
    }
}
