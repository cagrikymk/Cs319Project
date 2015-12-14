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
    
    private double axisX;
    private double axisY;
    private Shape shape;
    private Point2D point;
   
    public GameObject(double axisX, double axisY, Shape shape) {
        this.axisX = axisX;
        this.axisY = axisY;
        this.shape = shape;
        point = new Point2D (axisX, axisY);
    }
    
    
    public Point2D getLocation(){
        return this.point;
    }
    
    public Shape getShape() {
        return shape;
    }
    public void uptade (double x, double y){
        axisX = x;
        axisY = y;
    }
}
