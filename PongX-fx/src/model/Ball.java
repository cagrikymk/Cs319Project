/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.GameFieldManager;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

/**
 *
 * @author cagrikaymak
 */
public class Ball extends GameObject{
    
    private double radius;
    private double speedX;
    private double speedY;

    public Ball(double radius, double x, double y) {
        super(x, y, new Circle(x, y, radius));
        this.radius = radius;
        speedX = speedY = 0; // initially zero
    }
    

    public double getRadius() {
        return radius;
    }

    public double getSpeedX() {
        return speedX;
    }

    public void setRadius(double size) {
        this.radius = size;
    }

    public void setSpeedX(double speed) {
        this.speedX = speed;
    }
    
    
    
    public void changeSize (double r) {
        setRadius(r);
    }
    
    public void intialThrowBall(){
        getShape().setLayoutX(GameFieldManager.MAP_WIDTH / 2);
        getShape().setLayoutY(GameFieldManager.MAP_HEIGHT / 2);
        speedX = (Math.random() * 10) + 3;
        speedY = (Math.random() * 10) + 3;
    }
    
    public void reflectBall(){
        
    }
    
    public void update() {
        
    }
    
}
