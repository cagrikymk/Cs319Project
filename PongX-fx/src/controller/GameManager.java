/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
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
    

    private GameManager() {
        
    }
    
    public static GameManager getInstance() {
         if (null == gameManagerInstance) {
            gameManagerInstance = new GameManager();
        }
        return gameManagerInstance;
    }
    
    public void init(Options options, double friction, ArrayList<Brick> brickSet, boolean isSingleplayer, String imageURL) {
        if(gameManagerInstance != null) {
            gameFieldManager = new GameFieldManager(friction, brickSet, false, imageURL);
            this.options = options;
            gameState = GameState.BEFORESTART; 
        }
        else 
            System.err.println("No instance of game manager");
        
    }
    
    public void update() {
        
    }
    
    public void startGameLoop() { 
        
    }
    
    public void initializeGame() {
        
    }
    
    public void pauseGame() {
        
    }
    
    public void resumeGame() {
        
    }
    
    public void startGame() {
        
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

 
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public enum GameState {

        RUNNING, GAMEOVER, PAUSE, BEFORESTART

    }
    
    
    
}
