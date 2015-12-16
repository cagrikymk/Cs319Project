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
public class PositivePower extends Power{
    private double speedUp = 2 ;

    public PositivePower(int axisX, int axisY, Shape shape) {
        super(axisX, axisY, shape);
    }

    public double getSpeedUp() {
        return speedUp;
    }

    public void setSpeedUp(double speedUp) {
        this.speedUp = speedUp;
    }

   
   public void getPower(Ball b1 ){
       Point p1 = b1.getVelocityVector();
       p1.x += p1.x/speedUp;
       p1.y += p1.y/speedUp;
       b1.setVelocityVector( p1 );
   }
}
