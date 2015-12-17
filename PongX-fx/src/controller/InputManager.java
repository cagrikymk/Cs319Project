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
    private Stick p2;
    private boolean keys[];
    public InputManager(String[] p1Keys, String[] p2Keys, Stick p1) {
        this.p1Keys = p1Keys;
        this.p2Keys = p2Keys;
        this.p1 = p1;
        keys = new boolean[4];
    }

    @Override
    public void handle(KeyEvent event) {
        
        if (event.getEventType() == KeyEvent.KEY_PRESSED) {
            
            if (event.getText().equalsIgnoreCase(p1Keys[0])) {
                keys[0] = true;

            }  if (event.getText().equalsIgnoreCase(p1Keys[1])) {
                keys[1] = true;
            }

            if (p2 != null) {

                if (event.getText().equalsIgnoreCase(p2Keys[0])) {
                    keys[2] = true;
                } else if (event.getText().equalsIgnoreCase(p2Keys[1])) {
                    keys[3] = true;
                }
            }
        }
        else if (event.getEventType() == KeyEvent.KEY_RELEASED) {
            if (event.getText().equalsIgnoreCase(p1Keys[0])) {
                keys[0] = false;

            } if (event.getText().equalsIgnoreCase(p1Keys[1])) {
                keys[1] = false;
            }

            if (p2 != null) {

                if (event.getText().equalsIgnoreCase(p2Keys[0])) {
                    keys[2] = false;
                } else if (event.getText().equalsIgnoreCase(p2Keys[1])) {
                    keys[3] = false;
                }
            }
        }

        if (keys[0] == true) {
            p1.setLocation(p1.getAxisX(), p1.getAxisY() - 10);
        }
        if (keys[1] == true) {
            p1.setLocation(p1.getAxisX(), p1.getAxisY() + 10);
        }
        if (keys[2] == true) {
            p2.setLocation(p2.getAxisX(), p2.getAxisY() - 10);
        }
        if (keys[3] == true) {
            p2.setLocation(p2.getAxisX(), p2.getAxisY() + 10);
        }

    }

    public Stick getP1() {
        return p1;
    }

    public void setP1(Stick p1) {
        this.p1 = p1;
    }

    public Stick getP2() {
        return p2;
    }

    public void setP2(Stick p2) {
        this.p2 = p2;
    }

}
