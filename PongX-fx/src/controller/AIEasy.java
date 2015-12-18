/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Ball;
import model.Stick;

/**
 *
 * @author fcagil
 */
public class AIEasy implements AIStrategy {
    
   private int aiLevel = 1;
    @Override
    public void aiStick(Ball ball, Stick stick) {
        if ( ball.getAxisY() < stick.getAxisY())
            stick.setLocation(stick.getAxisX(), stick.getAxisY() -5 * aiLevel);
        if ( ball.getAxisY() > stick.getAxisY())
            stick.setLocation(stick.getAxisX(), stick.getAxisY() + 5 * aiLevel);
    }

    @Override
    public void setAILevel(int level) {
        aiLevel = level;
    }
    
}
