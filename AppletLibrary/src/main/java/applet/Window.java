package applet;

import interfaces.Drawable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Window extends JPanel {
    private ArrayList<Drawable> drawables;
    public Window(){
        drawables = new ArrayList<>();

    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Drawable drawable : drawables){
            drawable.draw();
        }
    }
}
