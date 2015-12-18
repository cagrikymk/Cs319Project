/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Ball;
import model.Stick;

/**
 *
 * @author user
 */
public interface AIStrategy {
    public void aiStick(Ball ball, Stick stick);
    public void setAILevel(int level);
}
