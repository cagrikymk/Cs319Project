/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Point;

/**
 *
 * @author cagrikaymak
 */
public class SpeedUpBalPower implements BallPower{
    
     private int speedUp;
    public SpeedUpBalPower() {
        speedUp = 2;
    }
    @Override
    public void applyBallPower(Ball b) {
        Point p1 = b.getVelocityVector();
           if ( Math.abs(p1.x) < 14){
               p1.x += p1.x / speedUp;
               p1.y += p1.y / speedUp;
               b.setVelocityVector(p1);
           }
    }
    
}
