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
 * @author cagrikaymak
 */
public class AIManager {
    AIStrategy strategy;
    Ball ball;
    Stick stick;
    
    public AIManager( AIStrategy strategy, Ball ball, Stick stick){
        this.strategy = strategy;
        this.ball = ball;
        this.stick = stick;
    }
    
    public void execute(){
        strategy.aiStick(this.ball, this.stick);
    }

    void setLevel(int AILevel) {
        strategy.setAILevel(AILevel);
    }
}
