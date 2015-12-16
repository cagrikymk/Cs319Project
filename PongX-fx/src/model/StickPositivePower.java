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
 * @author fcagil
 */
public class StickPositivePower extends Power{
    
    private double enlargeHeight = 18;
    

    public StickPositivePower(int axisX, int axisY, Shape shape) {
        super(axisX, axisY, shape);
    }

    public double getEnlargeHeight() {
        return enlargeHeight;
    }

    public void setEnlargeHeight(double enlargeHeight) {
        this.enlargeHeight = enlargeHeight;
    }
    
   public void enlargeStick(Stick s){
       s.changeSize(s.getWidth(), s.getHeight()+enlargeHeight);
   }
}
