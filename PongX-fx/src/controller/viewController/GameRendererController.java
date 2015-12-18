/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.viewController;

import controller.GameManager;
import controller.ScreenManager;
import javafx.scene.layout.Pane;
import view.CreditsPane;
import view.GameRendererPane;
import view.MainMenu;
import view.MultiplayerPane;
import view.OptionsPane;
import view.PauseMenu;
import view.SingleplayerPane;

/**
 *
 * @author cagrikaymak
 */
public class GameRendererController {

    private GameRendererPane rendererPane;

    public GameRendererController(GameRendererPane renderer) {
        this.rendererPane = renderer;
        PauseMenu pauseMenu = renderer.getPauseMenu();

        rendererPane.getPauseButton().setOnAction(e -> {
            if (GameManager.getInstance().getGameState() == GameManager.GameState.RUNNING) {
                GameManager.getInstance().pauseGame();
                 rendererPane.getPauseButton().setText("Resume");
            }
            else if (GameManager.getInstance().getGameState() == GameManager.GameState.PAUSE) {
                GameManager.getInstance().resumeGame();
                rendererPane.getPauseButton().setText("Pause");

            }
        });
        
        pauseMenu.getMainMenuButton().setOnAction(e -> {
            MainMenu menu = new MainMenu();
            ScreenManager.changeSceneRoot(renderer, menu);
            new MainMenuController(menu);
            GameManager.getInstance().stop();
        });
        
         pauseMenu.getResumeButton().setOnAction(e -> {
            if(GameManager.getInstance().getGameState() == GameManager.GameState.GAMEOVER) {
               GameManager.getInstance().restartGame();
               rendererPane.restartRenderer();
               pauseMenu.getResumeButton().setText("Resume");
            }
            else {
               GameManager.getInstance().setGameState(GameManager.GameState.RUNNING);
                rendererPane.getPauseButton().setText("Pause"); 
            }
           
            
            
        });
        

    }
}
