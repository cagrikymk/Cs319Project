/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import model.Stick;

/**
 *
 * @author cagrikaymak
 */
public class InputManager implements EventHandler<KeyEvent> {
    
    private String p1Keys[];
    private String p2Keys[];
    private Stick p1;

    public InputManager(String[] p1Keys, String[] p2Keys, Stick p1) {
        this.p1Keys = p1Keys;
        this.p2Keys = p2Keys;
    }
    

    @Override
    public void handle(KeyEvent event) {
        if(p1Keys[0] == event.getText()) {
            p1.getLocation().y = p1.getLocation().y - 5;
        }
        if(p1Keys[1] == event.getText()) {
            p1.getLocation().y = p1.getLocation().y + 5;
        }
    }
    
}
