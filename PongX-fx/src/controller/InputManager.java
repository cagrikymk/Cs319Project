/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
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
        this.p1 = p1;
    }
    

    @Override
    public void handle(KeyEvent event) {
        if(event.getCode() == KeyCode.W) {
            p1.getLocation().y = p1.getLocation().y - 10;
            
        }
        if(event.getCode() == KeyCode.S) {
            p1.getLocation().y = p1.getLocation().y + 10;
        }
    }
    
}
