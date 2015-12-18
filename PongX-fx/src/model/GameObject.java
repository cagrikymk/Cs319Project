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
import controller.GameFieldManager;
import java.awt.Point;
import javafx.scene.shape.Shape;
import javafx.geometry.Point2D;

public abstract class GameObject {

    private Shape shape;
    private Point point;
    private Point velocityVector;
    private boolean isAlive;

    public GameObject(int axisX, int axisY, Shape shape) {
        this.shape = shape;
        isAlive = true;
        point = new Point(axisX, axisY);
        velocityVector = new Point(0, 0); // initial velocity is zero

    }

    public Point getLocation() {
        return this.point;
    }

    public Shape getShape() {
        return shape;
    }

    public void uptade() {
        point.translate(velocityVector.x, velocityVector.y);
        shape.setLayoutX(point.getX());
        shape.setLayoutY(point.getY());
    }

    public int getAxisX() {
        return (int) point.getX();
    }

    public int getAxisY() {
        return (int) point.getY();
    }

    public void setLocation(Point point) {
      
        this.point = point;
        shape.setLayoutX(point.getX());
        shape.setLayoutY(point.getY());
        
    }
    
     public void setLocation(int x, int y) {
        if (x >= GameFieldManager.MAP_WIDTH_OFFSET
                && x  <= GameFieldManager.MAP_WIDTH_OFFSET + GameFieldManager.MAP_WIDTH
                && y >= GameFieldManager.MAP_HEIGHT_OFFSET
                && y <= GameFieldManager.MAP_HEIGHT_OFFSET + GameFieldManager.MAP_HEIGHT) {
            this.point.x = x;
            this.point.y = y;
            shape.setLayoutX(point.getX());
            shape.setLayoutY(point.getY());
        }
        
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public Point getVelocityVector() {
        return velocityVector;
    }

    public void setVelocityVector(Point velocityVector) {
        this.velocityVector = velocityVector;
    }

    public enum Coll {

        RUNNING, GAMEOVER, PAUSE, BEFORESTART

    }

}
