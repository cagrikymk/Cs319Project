/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



/**
 *
 * @author cagrikaymak
 */
import javafx.scene.shape.Shape;
import javafx.geometry.Point2D;

public class GameObject {
    
    private Shape shape;
    private Point2D point;
    private Point2D velocityVector;
    private boolean isAlive;
    
   
    public GameObject(double axisX, double axisY, Shape shape) {
        this.shape = shape;
        isAlive = true;
        point = new Point2D (axisX, axisY);
        velocityVector = new Point2D(0, 0); // initial velocity is zero
        
    }
    
    
    public Point2D getLocation(){
        return this.point;
    }
    
    public Shape getShape() {
        return shape;
    }
    public void uptade (){
        point = point.add(velocityVector); // just add velocity to current loc
        shape.setTranslateX(point.getX());
        shape.setTranslateX(point.getY());
    }

    public double getAxisX() {
        return point.getX();
    }


    public double getAxisY() {
        return point.getY();
    }


    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }
    

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public Point2D getVelocityVector() {
        return velocityVector;
    }

    public void setVelocityVector(Point2D velocityVector) {
        this.velocityVector = velocityVector;
    }
    
    
    
    
}
