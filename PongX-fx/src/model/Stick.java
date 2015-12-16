/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/**
 *
 * @author cagrikaymak
 */
public class Stick extends GameObject{
    

    public Stick(int axisX, int axisY, Shape shape) {
        super(axisX, axisY, shape);
    }

   public double getHeight() {
        return ((Rectangle)getShape()).getHeight();
    }

    public double getWidth() {
        return ((Rectangle)getShape()).getWidth();
    }

    public double getSpeed() {
        return getVelocityVector().y;
    }

    public void setHeight(double height) {
        ((Rectangle)getShape()).setHeight(height);
    }

    public void setWidth(double width) {
        ((Rectangle)getShape()).setWidth(width);
    }

    public void setSpeed(double speed) {
        getVelocityVector().y = (int) speed;
    }
    
    
    public void changeSize(double w, double h){
        setWidth(w);
        setHeight(h);
    }
    
    public void applyPower(int pwrID){
        
    }


}
