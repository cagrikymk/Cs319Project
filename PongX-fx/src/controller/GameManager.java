/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import model.Brick;
import model.Options;

/**
 *
 * @author cagrikaymak
 */
public class GameManager implements Runnable {
    
    private GameState gameState;
    private Options options;
    private GameFieldManager gameFieldManager;
    
    private static GameManager gameManagerInstance; // SİNGLETON PATTERN
    
    private AnimationTimer timer;
    
    int i = 0;
            
    private GameManager() {
        
    }
    
    public static GameManager getInstance() {
         if (null == gameManagerInstance) {
            gameManagerInstance = new GameManager();
        }
        return gameManagerInstance;
    }
    
    public void init(Options options, double friction, String brickSet, boolean isSingleplayer, String imageURL) {
        if(gameManagerInstance != null) {
            gameFieldManager = new GameFieldManager(friction, null, false, imageURL);
            this.options = options;
            gameState = GameState.BEFORESTART; 
        }
        else 
            System.err.println("No instance of game manager");
        
    }
    
    public void update() {
        
    }
    
    // prepare thread
    public void initializeGame() {
       gameFieldManager.initGameFieldManager();
       
            timer = new AnimationTimer() {

             // this method will called 60 times per sec
            @Override
            public void handle(long now) {
                getGameFieldManager().updateGameField();
            }
            
        };
    }
    
    public void pauseGame() {
        if(gameState == GameState.RUNNING) {
            gameState = GameState.PAUSE;
            stop();
        }
            
        else
            System.err.println("game is already running");
    }
    
    public void resumeGame() {
         if(gameState == GameState.PAUSE) {
            gameState = GameState.RUNNING;
            run();

         }
        else
            System.err.println("game is not paused so cant be resumed");
    }
    
    public void startGame() {
        initializeGame(); 
        run();
    }
    
    public void endGame() {
        
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public GameFieldManager getGameFieldManager() {
        return gameFieldManager;
    }

    public void setGameFieldManager(GameFieldManager gameFieldManager) {
        this.gameFieldManager = gameFieldManager;
    }
    
    private ArrayList<Brick> getBrickFromFile(String brickSet) {
        if(brickSet == "Empty brick set") {
            return new ArrayList<>(0);
        }
        else if(brickSet == "Brick set 1") {
            
        }
        else if(brickSet == "Brick set 2") {
            
        }
        else if(brickSet == "Brick set 3") {
            
        }
        return null;
    }
    
    

 
    @Override
    public void run() {
         
        timer.start();
        
    }
    
    public void stop() {
         
        timer.stop();
        
    }
    
     public enum GameState {

        RUNNING, GAMEOVER, PAUSE, BEFORESTART

    }
    
    
    
}
