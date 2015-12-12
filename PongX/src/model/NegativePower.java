/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.shape.Shape;

/**
 *
 * @author cagrikaymak
 */
public class NegativePower extends Power{
    private double slowDown;
    private double shrinkHeight;
    private double shrinkWidht;

    public NegativePower(double axisX, double axisY, Shape shape) {
        super(axisX, axisY, shape);
    }

    public double getSlowDown() {
        return slowDown;
    }

    public double getShrinkHeight() {
        return shrinkHeight;
    }

    public double getShrinkWidht() {
        return shrinkWidht;
    }

    public void setSlowDown(double slowDown) {
        this.slowDown = slowDown;
    }

    public void setShrinkHeight(double shrinkHeight) {
        this.shrinkHeight = shrinkHeight;
    }

    public void setShrinkWidht(double shrinkWidht) {
        this.shrinkWidht = shrinkWidht;
    }


    
   public void enlargePaddle(Stick s){
       s.changeSize(s.getWidth()-shrinkWidht, s.getHeight()-shrinkHeight);
   }
   public void speedPaddle(Stick s){
       s.changeSpeed(s.getSpeed()-slowDown);
   }
}
