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
public abstract class Power extends GameObject {
    private int powerID; // NegativePower=0, PositivePower=1, StickNegativePower=2, StickPositivePower=3
    private BallPower ballPower; 
    private StickPower stickPower;

    public Power(int x, int y) {
        super(x, y, new Circle(x, y, 22));
        
    }

    public int getPowerID() {
        return powerID;
    }
    
    public void getPower(Ball b) {
        if(ballPower != null && isAlive())
            ballPower.applyBallPower(b);
    }
    
    public void getPower(Stick s) {
        if(stickPower != null && isAlive())
            stickPower.applyStickPower(s);
    }



    public void setPowerID(int powerID) {
        this.powerID = powerID;
    }

    public BallPower getBallPower() {
        return ballPower;
    }

    public void setBallPower(BallPower ballPower) {
        this.ballPower = ballPower;
    }

    public StickPower getStickPower() {
        return stickPower;
    }

    public void setStickPower(StickPower stickPower) {
        this.stickPower = stickPower;
    }
    
    
    
    
    
    
    
}
