package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Circle extends Rectangle implements MouseListener{

    final int x;
    final int y;
    static int number;

    Circle(int x, int y, int width, int height){
        super(x,y,width,height);
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x,y,height,width);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

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
