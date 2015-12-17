/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Shape;

/**
 *
 * @author cagrikaymak
 */
public class NegativeBrick extends Brick{
    int speedDown;

    public NegativeBrick(int axisX, int axisY) {
        super(axisX, axisY);
        setTexture((new ImageView(new Image(getClass().getResourceAsStream("/bricks/NegativeBrick.png"), getWidth(), getHeight(), false, true))));
        setLife(2);
        
    }

    public int getSpeedDown() {
        return speedDown;
    }

    public void setSpeedDown(int speedDown) {
        this.speedDown = speedDown;
    }
    
    public void speedDownBall(Ball b){
        getVelocityVector().x = getVelocityVector().x - speedDown;
        getVelocityVector().y = getVelocityVector().y - speedDown;
    }
}
