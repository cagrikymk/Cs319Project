/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fcagil
 */
public class Ball {
    
    private int x = WIDTH / 2; //WIDTH = oyun paneli genisligi
    private int y = HEIGHT / 2;//HEIGHT = oyun paneli yuksekligi
    private int xVelocity = -4;
    private int yVelocity = 4;
    private int size = 5;
    

    public void update() {
        x = x + xVelocity;
        y = y + yVelocity;

        if (x < 0) {
            xVelocity = 4;
            //RIGHT PLAYER GOAL
        } else if (x + size > WIDTH - 6) {
            xVelocity = -4;
            //LEFT PLAYER GOAL
        }

        if (y < 0) {
            yVelocity = 4;
        } else if (y + size > HEIGHT - 28) {
            yVelocity = -4;
        }
    }

    private void reverseDirectionX() {
        xVelocity = -xVelocity;
    }

    private void reverseDirectionY() {
        yVelocity = -yVelocity;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}