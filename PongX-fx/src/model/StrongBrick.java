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
public class StrongBrick extends Brick {

    public StrongBrick(int axisX, int axisY) {
        super(axisX, axisY);
        setTexture((new ImageView(new Image(getClass().getResourceAsStream("/bricks/StrongBrick.png"), getWidth(), getHeight(), false, true))));
        setLife(5);
    }

}
