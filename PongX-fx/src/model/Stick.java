/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.GameFieldManager;
import static controller.GameFieldManager.MAP_HEIGHT;
import static controller.GameFieldManager.MAP_WIDTH;
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
      @Override
      public void setLocation(int x, int y) {
        if (x >= GameFieldManager.MAP_WIDTH_OFFSET
                && x <= GameFieldManager.MAP_WIDTH_OFFSET + GameFieldManager.MAP_WIDTH
                && y >= GameFieldManager.MAP_HEIGHT_OFFSET
                && y + getHeight() <= GameFieldManager.MAP_HEIGHT_OFFSET + GameFieldManager.MAP_HEIGHT) {
             getLocation().x = x;
             getLocation().y = y;
            getShape().setLayoutX( getLocation().getX());
            getShape().setLayoutY( getLocation().getY());
        }
        
    }
      
      public void setInitial(int p) {
          if(p == 1)
            setLocation(200, MAP_HEIGHT / 2 + 40);
          else
             setLocation(MAP_WIDTH + 140, MAP_HEIGHT / 2 + 40); 
          setHeight(100);
          setWidth(20);
          
      }


}
