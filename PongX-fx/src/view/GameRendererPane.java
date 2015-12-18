/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GameFieldManager;
import controller.GameManager;
import controller.InputManager;
import controller.ScreenManager;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import model.Brick;
import model.GameField;
import model.Power;
import model.Stick;

/**
 *
 * @author cagrikaymak
 */
public class GameRendererPane extends Pane {

    private GameManager gameManager;
    private GameFieldManager gameFieldManager;
    private GameField gameField;
    private ImageView gameBackgroundImage;
    private Label scoreP1, scoreP2, winnerLabel;
    private Button pause;
    private PauseMenu pauseMenu;
    private boolean isPauseMenuShown;

    public GameRendererPane() {
        isPauseMenuShown = false;
        scoreP1 = new Label();
        scoreP2 = new Label();
        winnerLabel = new Label();
        gameManager = GameManager.getInstance();
        gameFieldManager = gameManager.getGameFieldManager();
        gameField = gameFieldManager.getGameField();
        // drawing game background
        gameBackgroundImage = new ImageView(new Image(getClass().getResourceAsStream(gameField.getImageURL()),
                gameField.getActiveField().getWidth(), gameField.getActiveField().getHeight(), false, false));
        gameBackgroundImage.setLayoutX(gameField.getActiveField().getX());
        gameBackgroundImage.setLayoutY(gameField.getActiveField().getY());

        pauseMenu = new PauseMenu();

        scoreP1.setText("Score\n" + " " + gameFieldManager.getPlayer1Score() + "");
        scoreP1.setLayoutX(20);
        scoreP1.setLayoutY(320);
        scoreP1.getStyleClass().add("paneHeaderLabel");
        scoreP2.setText("Score\n" + " " + gameFieldManager.getPlayer2Score() + "");
        scoreP2.getStyleClass().add("paneHeaderLabel");
        scoreP2.setLayoutX(1200);
        scoreP2.setLayoutY(320);

        winnerLabel.getStyleClass().add("paneHeaderLabel");
        winnerLabel.setLayoutX(600);
        winnerLabel.setLayoutY(100);

        pause = new Button("Pause");
        pause.getStyleClass().add("menuButton");
        pause.setMinSize(200, 50);
        pause.setLayoutX(GameManager.WIDTH - 300);
        pause.setLayoutY(GameManager.HEIGHT - 50);

        ScreenManager.getScene().addEventHandler(KeyEvent.ANY, gameFieldManager.getInputManager());

        getChildren().addAll(gameBackgroundImage);

        getChildren().addAll(scoreP2, scoreP1, pause);

        this.setBackground(new Background(new BackgroundImage(new Image(getClass().getResourceAsStream("/emptybg.png"),
                1366, 768, true, true), BackgroundRepeat.SPACE, BackgroundRepeat.SPACE, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
    }

    public void update() {
        scoreP2.setText("Score\n" + " " + gameFieldManager.getPlayer2Score() + "");
        scoreP1.setText("Score\n" + " " + gameFieldManager.getPlayer1Score() + "");

        for (Power power : gameField.getPowers()) {
            if (!getChildren().contains(power.getShape())) {
                getChildren().add(power.getShape());
            }
        }

        if (gameManager.getGameState() == GameManager.GameState.PAUSE && isPauseMenuShown == false) {
            isPauseMenuShown = true;
            getChildren().add(pauseMenu);
        } else if (gameManager.getGameState() == GameManager.GameState.RUNNING && isPauseMenuShown == true) {
            isPauseMenuShown = false;
            getChildren().remove(pauseMenu);
            
        } else if (gameManager.getGameState() == GameManager.GameState.GAMEOVER) {
            isPauseMenuShown = true;
            winnerLabel.setText("Winner is-->\n" + gameManager.getWinner());
            pauseMenu.getResumeButton().setText("Restart");
            if (!getChildren().contains(pauseMenu)) {
                getChildren().add(pauseMenu);
            }
            if (!getChildren().contains(winnerLabel)) {
                getChildren().add(winnerLabel);
            }
        }

        for (Brick brick : gameField.getBricks()) {
            ImageView brickImage = brick.getTexture();
            brickImage.setLayoutX(brick.getAxisX());
            brickImage.setLayoutY(brick.getAxisY());
            if (!getChildren().contains(brickImage)) {
                getChildren().addAll(brickImage);
            }

        }

        for (Stick stick : gameField.getPlayers()) {
            if (!getChildren().contains(stick.getShape())) {
                getChildren().addAll(stick.getShape());
            }
        }
        getChildren().remove(gameField.getBall().getShape());
        getChildren().add(gameField.getBall().getShape());

    }

    public void restartRenderer() {
        getChildren().remove(winnerLabel);
        getChildren().remove(gameField.getBall().getShape());
        for (Stick stick : gameField.getPlayers()) {
            getChildren().remove(stick.getShape());
        }
        for (Brick brick : gameField.getBricks()) {
            getChildren().remove(brick.getTexture());
        }
        for (Power power : gameField.getPowers()) {
            getChildren().remove(power.getShape());
        }

        gameManager = GameManager.getInstance();
        gameFieldManager = gameManager.getGameFieldManager();
        gameField = gameFieldManager.getGameField();
        ScreenManager.getScene().addEventHandler(KeyEvent.ANY, gameFieldManager.getInputManager());
    }

    public Button getPauseButton() {
        return pause;
    }

    public void setPauseButton(Button pause) {
        this.pause = pause;
    }

    public PauseMenu getPauseMenu() {
        return pauseMenu;
    }

    public void setPauseMenu(PauseMenu pauseMenu) {
        this.pauseMenu = pauseMenu;
    }

}
