package controller;

import view.PlayGameMenuPane;

public class PlayGameMenuController {

	private PlayGameMenuPane playGameMenuView;
	
	public PlayGameMenuController(PlayGameMenuPane playGameMenuView) {
		this.playGameMenuView = playGameMenuView;
		
		playGameMenuView.getStartGameButton().setOnAction(e -> {
			
		});
		
		playGameMenuView.getChooseLevelButton().setOnAction(e -> {
			
		});
	}
}
