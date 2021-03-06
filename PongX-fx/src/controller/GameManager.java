/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.AnimationTimer;
import javafx.scene.shape.Rectangle;
import model.Brick;
import model.FastBrick;
import model.NegativeBrick;
import model.NegativePower;
import model.Options;
import model.PositivePower;
import model.Power;
import model.RegularBrick;
import model.StickNegativePower;
import model.StickPositivePower;
import model.StrongBrick;
import view.GameRendererPane;

/**
 *
 * @author cagrikaymak
 */
public class GameManager implements Runnable {

    private GameState gameState;
    private Options options;
    private GameFieldManager gameFieldManager;
    private GameRendererPane renderer;
    private static GameManager gameManagerInstance; // SİNGLETON PATTERN
    public static final int WIDTH = 1366;
    public static final int HEIGHT = 768;
    private int aiLevel;
    private int waitMS;
    
    private String brickSet;

    private AnimationTimer timer;
    
    private String winner;
    

    private GameManager() {

    }

    public static GameManager getInstance() {
        if (null == gameManagerInstance) {
            gameManagerInstance = new GameManager();
        }
        return gameManagerInstance;
    }

    public void init(Options options, double friction, String brickSet, boolean isSingleplayer, String imageURL) {
        if (gameManagerInstance != null) {

            try {
                gameFieldManager = new GameFieldManager(friction, getBrickFromFile(brickSet), getPowerFromFile(), isSingleplayer, imageURL);
            } catch (IOException ex) {
                System.err.println("bricks couldnt load");
            }
            this.options = options;
            gameState = GameState.RUNNING;
            this.brickSet = brickSet;
            winner = "";
        } else {
            System.err.println("No instance of game manager");
        }

    }

    public void update() {
        if (gameState == GameState.RUNNING) {
            getGameFieldManager().updateGameField();
        } 
        renderer.update();

    }
    
    public void restartGame() {
        stop();
        init(Options.getInstance(), gameFieldManager.getFriction(), this.brickSet, gameFieldManager.isIsSingleplayer(), gameFieldManager.getImageURL());
        startGame();
    }

    // prepare thread
    public void initializeGame() {
        gameFieldManager.initGameFieldManager();

        timer = new AnimationTimer() {
            long start = System.currentTimeMillis();

            // this method will called 60 times per sec

            @Override
            public void handle(long now) {
                
                if(waitMS > 0) {
                    long start = System.currentTimeMillis();
                    while(System.currentTimeMillis() - start < waitMS);
                    waitMS = 0;
                }
                
                update();
                
                if(gameFieldManager.getPlayer1Score() == 5) {
                    winner = "Player 1";
                    gameState = GameState.GAMEOVER;
                }
                else if (gameFieldManager.getPlayer2Score() == 5) {
                    winner = "Player 2";
                    gameState = GameState.GAMEOVER;
                }

                if (isRunning()) {
                    if (System.currentTimeMillis() - start > 5000) {
                        gameFieldManager.generatePower();
                        start = System.currentTimeMillis();
                    }
                }

            }

        };
    }

    public void pauseGame() {
        if (gameState == GameState.RUNNING) {
            gameState = GameState.PAUSE;
        } else {
            System.err.println("game is already running");
        }
    }

    public void resumeGame() {
        if (gameState == GameState.PAUSE) {
            gameState = GameState.RUNNING;

        } else {
            System.err.println("game is not paused so cant be resumed");
        }
    }

    public boolean isRunning() {
        return (gameState == GameState.RUNNING);
    }

    public void startGame() {
        initializeGame();
        run();
    }

    public void endGame() {
        stop();
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
    
    public String getWinner() {
        return winner;
    }

    public int getAiLevel() {
        return aiLevel;
    }

    public void setAiLevel(int aiLevel) {
        this.aiLevel = aiLevel;
        gameFieldManager.setAILevel(this.aiLevel);
    }
    
    


    private ArrayList<Brick> getBrickFromFile(String brickSet) throws FileNotFoundException, IOException {

        if (brickSet == "Empty brick set") {
            return new ArrayList<Brick>(0);
        } else {
            BufferedReader bufferedReader = null;
            String fileLoc = null;
            ArrayList<Brick> bricks = new ArrayList<Brick>();
            System.out.println(brickSet);
            try {
                if (brickSet == "Brick set 1") {
                    fileLoc = "options/brickset1.txt";
                } else if (brickSet == "Brick set 2") {
                    fileLoc = "options/brickset2.txt";
                } else if (brickSet == "Brick set 3") {
                    fileLoc = "options/brickset3.txt";
                }
                bufferedReader = new BufferedReader(new FileReader(fileLoc));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String arr[] = line.split(" ");
                    if (arr[0].equals("NegativeBrick")) {
                        bricks.add(new NegativeBrick(Integer.valueOf(arr[1]), Integer.valueOf(arr[2])));
                    } else if (arr[0].equals("FastBrick")) {
                        bricks.add(new FastBrick(Integer.valueOf(arr[1]), Integer.valueOf(arr[2])));
                    } else if (arr[0].equals("StrongBrick")) {
                        bricks.add(new StrongBrick(Integer.valueOf(arr[1]), Integer.valueOf(arr[2])));
                    } else {
                        bricks.add(new RegularBrick(Integer.valueOf(arr[1]), Integer.valueOf(arr[2])));
                    }
                }
            } finally {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            }
            System.out.println(bricks);
            return bricks;
        }

    }

    public GameRendererPane getRenderer() {
        return renderer;
    }

    public void setRenderer(GameRendererPane renderer) {
        this.renderer = renderer;
    }

    private ArrayList<Power> getPowerFromFile() throws FileNotFoundException, IOException {

        ArrayList<Power> powers = new ArrayList<Power>();

//        BufferedReader bufferedReader = null;
//        String fileLoc = null;
//        try {
//            fileLoc = "options/powers.txt";
//            bufferedReader = new BufferedReader(new FileReader(fileLoc));
//            String line;
//            System.out.println("Reading powers from file");
//            while ((line = bufferedReader.readLine()) != null) {
//                String arr[] = line.split(" ");
//                System.out.println(arr[0]);
//                if (arr[0] == "PositiveBall") {
//                    PositivePower ballPositive = new PositivePower(Integer.valueOf(arr[1]), Integer.valueOf(arr[2]));
//                    powers.add(ballPositive);
//                    System.out.println("PositiveBall added");
//                } else if (arr[0] == "NegativeBall") {
//                    NegativePower ballNegative = new NegativePower(Integer.valueOf(arr[1]), Integer.valueOf(arr[2]));
//                    powers.add(ballNegative);                    
//                    System.out.println("NegativeBall added");
//                } else if (arr[0] == "PositiveStick") {
//                    System.out.println("StickPositive added");
//                    StickPositivePower stickPositive = new StickPositivePower(Integer.valueOf(arr[1]), Integer.valueOf(arr[2]));
//                    powers.add(stickPositive);                    
//                } else if (arr[0] == "NegativeStick") { //Negative Stick
//                    System.out.println("StickNegative added");
//                    StickNegativePower stickNegative = new StickNegativePower(Integer.valueOf(arr[1]), Integer.valueOf(arr[2]));
//                    powers.add(stickNegative);                    
//                }
//            }
//        } finally {
//            if (bufferedReader != null) {
//                bufferedReader.close();
//            }
//        } 
        return powers;
    }

    @Override
    public void run() {

        timer.start();

    }

    public void stop() {

        timer.stop();

    }
    
    public void wait(int ms) {
       waitMS = ms;
    }

 
    public enum GameState {

        RUNNING, GAMEOVER, PAUSE, BEFORESTART

    }

}
