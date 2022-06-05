package applet;

import interfaces.Drawable;
import interfaces.Active;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Window extends JPanel implements MouseListener {
    private ArrayList<Drawable> drawables;
    private ArrayList<Active> actives;
    public Window(){
        drawables = new ArrayList<>();
        actives = new ArrayList<>();
        addMouseListener(this);
    }

    public void addDrawable(Drawable drawable){
        drawables.add(drawable);
    }
    public boolean removeDrawable(Drawable drawable){
        return drawables.remove(drawable);
    }
    public void clearDrawables(){
        drawables.clear();
    }

    public void addActive(Active active){
        actives.add(active);
    }
    public boolean removeActive(Active active){
        return actives.remove(active);
    }
    public void clearActives(){
        actives.clear();
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Drawable drawable : drawables){
            drawable.draw();
        }
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getPoint());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
