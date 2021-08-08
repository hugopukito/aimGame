package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class GamePanel extends JPanel implements MouseListener {

    static final int GAME_WIDTH = 1920/2;
    static final int GAME_HEIGHT = 1080/2;
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH,GAME_HEIGHT);
    static int CIRCLE_DIAMETER = 20;
    static final int CIRCLE_NUMBER = 20;
    Image image;
    Graphics graphics;
    Score score;
    Random random;
    Circle [] circle = new Circle[CIRCLE_NUMBER];

    GamePanel(){
        addMouseListener(this);
        score = new Score(GAME_WIDTH,GAME_HEIGHT);
        this.setFocusable(true);
        this.setPreferredSize(SCREEN_SIZE);

        Circle.number = circle.length;

        for(int i=circle.length-1; i>=0; i--){
            random = new Random();
            circle[i] = new Circle(random.nextInt(GAME_WIDTH-CIRCLE_DIAMETER),
                    random.nextInt(GAME_HEIGHT-CIRCLE_DIAMETER),
                    CIRCLE_DIAMETER,CIRCLE_DIAMETER);
        }
    }

    public void paint(Graphics g){
        image = createImage(getWidth(), getHeight());
        graphics = image.getGraphics();
            draw(graphics);
        g.drawImage(image,0,0,this);
    }

    public void draw(Graphics g){
        try {
            circle[Circle.number-1].draw(g);
            score.draw(g);
        }
        catch (Exception e){
            score.win(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

            if (e.getX() >= circle[Circle.number-1].x &&
                    e.getX() <= circle[Circle.number-1].x + CIRCLE_DIAMETER &&
                    e.getY() >= circle[Circle.number-1].y &&
                    e.getY() <= circle[Circle.number-1].y + CIRCLE_DIAMETER)
            {
                score.score++;
                Circle.number--;
            }
            repaint();
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
