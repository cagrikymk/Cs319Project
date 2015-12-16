/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.GameFieldManager;
import java.awt.Point;
import javafx.geometry.Point2D;
import javafx.scene.shape.Circle;

/**
 *
 * @author cagrikaymak
 */
public class Ball extends GameObject {
    
    private double radius;

    public Ball(double radius, int x, int y) {
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
    
    public void intialThrowBall(int x, int y){
        this.getLocation().translate(x, y);
        double speedX = (Math.random() * 5) + 3;
        double speedY = (Math.random() * 5) + 3;
        
        getVelocityVector().setLocation(speedY, speedY);
        
    }
     // top bottom reflect
    public void reflectBall1(){
        System.out.println("reflect ball 1--" + getLocation().toString());
        System.out.println("reflect ball 1--" + getVelocityVector().toString());
        getVelocityVector().y = -1 * getVelocityVector().y; 
     
    }
     // right left reflect
    public void reflectBall2(){
        getVelocityVector().x = -1 * getVelocityVector().x;         
    }
    
   
  
    
    
    
    
    
}
