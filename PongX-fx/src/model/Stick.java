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
public class Stick extends GameObject{
    
    private double height;
    private double width;
    private double speed;

    public Stick(int axisX, int axisY, Shape shape) {
        super(axisX, axisY, shape);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getSpeed() {
        return speed;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    public void changeSpeed(double s){
        setSpeed(s);
    }
    
    public void changeSize(double w, double h){
        setWidth(w);
        setHeight(h);
    }
    
    public void applyPower(int pwrID){
        
    }
}
