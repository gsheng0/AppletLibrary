package applet;

import javax.swing.*;

public class Applet {
    private int width = 1000;
    private int height = 800;
    private JFrame frame;
    private Window window;
    private static JFrame setupFrame(int width, int height){
        JFrame frame = new JFrame();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }
    public Applet(Window window){
        this.window = window;
        frame = setupFrame(width, height);
        frame.add(window);
    }
    public Applet(Window window, int width, int height){
        this.width = width;
        this.height = height;
        this.window = window;
        frame = setupFrame(width, height);
        frame.add(window);
    }
    public void setLocation(int x, int y){
        frame.setLocation(x, y);
    }

    public void show(){
        frame.setVisible(true);
    }
}
