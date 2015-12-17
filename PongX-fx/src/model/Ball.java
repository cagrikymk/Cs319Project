/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.shape.Circle;

/**
 *
 * @author cagrikaymak
 */
public class Ball extends GameObject {
    
    private int radius;
    private int lastHit;

    public Ball(int radius, int x, int y) {
        super(x, y, new Circle(x, y, radius));
        this.radius = radius;
        this.lastHit = -1;
    }
    

    public double getRadius() {
        return ((Circle)getShape()).getRadius();
    }


    public void setRadius(int size) {
        this.radius = size;
        ((Circle)getShape()).setRadius(size);
    }

    public void setLastHit(int i){
        this.lastHit = i;
    }
    
    public int getLastHit(){
        return this.lastHit;
    }
    
    
    public void changeSize (int r) {
        setRadius(r);
    }
    
    public void intialThrowBall(int x, int y){
        this.getLocation().setLocation(x, y);
        double speedX = 7;
        double speedY = 7;
        
        getVelocityVector().setLocation(speedY, speedY);
        
    }
     // top bottom reflect
    public void reflectBall(ImpactLocation location){
        if(location == ImpactLocation.BOTTOM || location == ImpactLocation.TOP)
            getVelocityVector().y = -1 * getVelocityVector().y; 
        else if(location == ImpactLocation.LEFT || location == ImpactLocation.RIGHT)
            getVelocityVector().x = -1 * getVelocityVector().x;         

    }
    
    
    public enum ImpactLocation {

        RIGHT, LEFT, TOP, BOTTOM

    }
       
    
}
