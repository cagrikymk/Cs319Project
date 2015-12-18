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
public class SlowDownBallPower implements BallPower {
    private int slowDown;
    public SlowDownBallPower() {
        slowDown = 3;
    }
    
    
    @Override
    public void applyBallPower(Ball b1) {
       Point p1 = b1.getVelocityVector();
            System.out.println("Vel Vec before slowDown " + p1);
            if (Math.abs(p1.x) > 5) {
                p1.x -= p1.x / slowDown;
                p1.y -= p1.y / slowDown;
                b1.setVelocityVector(p1);
                System.out.println("Vel Vec after slowDown " + p1);
            }
    }
    
}
