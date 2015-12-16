/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Point;
import javafx.scene.shape.Shape;

/**
 *
 * @author cagrikaymak
 */
public class NegativePower extends Power{
    private double slowDown = 3;
    private double shrinkHeight;
    private double shrinkWidht;

    public NegativePower(int axisX, int axisY, Shape shape) {
        super(axisX, axisY, shape);
        super.setPowerID(0);
    }

    public double getSlowDown() {
        return slowDown;
    }

    public void setSlowDown(double slowDown) {
        this.slowDown = slowDown;
    }
    
    
    public void getPower(Ball b1 ){
       Point p1 = b1.getVelocityVector();
       p1.x -= p1.x/ slowDown;
       p1.y -= p1.y/ slowDown;
       b1.setVelocityVector( p1 );
   }
   
}
