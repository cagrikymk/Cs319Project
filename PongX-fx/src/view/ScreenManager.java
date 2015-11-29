/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PlayGameMenuController;
import mainPackage.MainClass;
import view.PlayGameMenuView;

/**
 *
 * @author AhmetAy
 */
public class ScreenManager {

	private MainMenu entranceView;

	public ScreenManager(MainMenu entranceView) {
		this.entranceView = entranceView;

		entranceView.getSingleplayerButton().setOnAction(e -> {
			PlayGameMenuView playGameMenuView = new PlayGameMenuView();
			PlayGameMenuController playGameMenuController = new PlayGameMenuController(playGameMenuView);
			MainClass.changeSceneRoot(playGameMenuView);
		});

		entranceView.getCreditsButton().setOnAction(e -> {

		});

		entranceView.getOptionsButton().setOnAction(e -> {

		});
	}

}
