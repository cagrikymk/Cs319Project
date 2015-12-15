/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.GameFieldManager;
import javafx.geometry.Point2D;
import javafx.scene.shape.Circle;

/**
 *
 * @author cagrikaymak
 */
public class Ball extends GameObject {
    
    private double radius;

    public Ball(double radius, double x, double y) {
        super(x, y, new Circle(x, y, radius));
        this.radius = radius;
    }
    

    public double getRadius() {
        return radius;
    }


    public void setRadius(double size) {
        this.radius = size;
    }


    
    
    
    public void changeSize (double r) {
        setRadius(r);
    }
    
    public void intialThrowBall(){
        getShape().setLayoutX(GameFieldManager.MAP_WIDTH / 2);
        getShape().setLayoutY(GameFieldManager.MAP_HEIGHT / 2);
        double speedX = (Math.random() * 5) + 3;
        double speedY = (Math.random() * 5) + 3;
        
        setVelocityVector(getVelocityVector().add(speedX, speedY)); 
        
    }
    
    public void reflectBall(){
    }
    
    
    
}
