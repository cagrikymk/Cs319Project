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
public class PositivePower extends Power{
    private double speedUp;
    private double enlargeHeight;
    private double enlargeWidht;

    public PositivePower(double axisX, double axisY, Shape shape) {
        super(axisX, axisY, shape);
    }

    public double getSpeedUp() {
        return speedUp;
    }

    public double getEnlargeHeight() {
        return enlargeHeight;
    }

    public double getEnlargeWidht() {
        return enlargeWidht;
    }

    public void setSpeedUp(double speedUp) {
        this.speedUp = speedUp;
    }

    public void setEnlargeHeight(double enlargeHeight) {
        this.enlargeHeight = enlargeHeight;
    }

    public void setEnlargeWidht(double enlargeWidht) {
        this.enlargeWidht = enlargeWidht;
    }
    
   public void enlargePaddle(Stick s){
       s.changeSize(s.getWidth()+enlargeWidht, s.getHeight()+enlargeHeight);
   }
   public void speedPaddle(Stick s){
       s.changeSpeed(s.getSpeed()+speedUp);
   }
}
