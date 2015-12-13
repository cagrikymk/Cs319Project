/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author cagrikaymak
 */
public class InputManager implements EventHandler<KeyEvent> {
    
    private String p1Keys[];
    private String p2Keys[];

    public InputManager(String[] p1Keys, String[] p2Keys) {
        this.p1Keys = p1Keys;
        this.p2Keys = p2Keys;
    }
    

    @Override
    public void handle(KeyEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
