package applet;

import javax.swing.*;

public class Applet {
    private int width = 1000;
    private int height = 800;
    private JFrame frame;
    private JPanel panel;
    private static JFrame setupFrame(int width, int height){
        JFrame frame = new JFrame();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }
    public Applet(){
        frame = setupFrame(width, height);
        panel = new JPanel();
        frame.add(panel);

    }
    public Applet(int width, int height){
        this.width = width;
        this.height = height;
        frame = setupFrame(width, height);
        panel = new JPanel();
        frame.add(panel);
    }
    public void setLocation(int x, int y){
        frame.setLocation(x, y);
    }

    public void show(){
        frame.setVisible(true);
    }
}
