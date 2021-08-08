package com.company;

import java.awt.*;

public class Score extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    static int score = 0;

    Score(int GAME_WIDTH, int GAME_HEIGHT){
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 30));
        //g.drawLine(GAME_WIDTH/2,0,GAME_WIDTH/2,GAME_HEIGHT);
        g.drawString(String.valueOf(score), (GAME_WIDTH/2)-17, 30);
    }

    public void win(Graphics g){
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 30));
        //g.drawLine(GAME_WIDTH/2,0,GAME_WIDTH/2,GAME_HEIGHT);
        g.drawString("gagné !", (GAME_WIDTH/2)-17, 30);
    }
}
