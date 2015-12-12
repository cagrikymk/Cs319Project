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
public class Ball extends GameObject{
    
    private double size;
    private double speed;

    public Ball(double axisX, double axisY, Shape shape) {
        super(axisX, axisY, shape);
    }

    public double getSize() {
        return size;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    public void changeSpeed (double s) {
        setSpeed(s);
    }
    
    public void changeSize (double r) {
        setSize(r);
    }
    
    public void intialThrowBall(){
        
    }
    
    public void reflectBall(){
        
    }
}
