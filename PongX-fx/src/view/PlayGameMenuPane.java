package view;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class PlayGameMenuPane extends Pane {

	private Button startGameButton;
    private Button chooseLevelButton;
    
	public PlayGameMenuPane() {
		
		startGameButton = new Button("   Start New Game  ");
		startGameButton.getStyleClass().add("gameKinds");
		startGameButton.setLayoutX(270);
		startGameButton.setLayoutY(200);

		chooseLevelButton = new Button("    Choose Level      ");
		chooseLevelButton.getStyleClass().add("gameKinds");
		chooseLevelButton.setLayoutX(270);
		chooseLevelButton.setLayoutY(360);
        
		getChildren().addAll(startGameButton, chooseLevelButton);
	}

	public Button getStartGameButton() {
		return startGameButton;
	}

	public void setStartGameButton(Button startGameButton) {
		this.startGameButton = startGameButton;
	}

	public Button getChooseLevelButton() {
		return chooseLevelButton;
	}

	public void setChooseLevelButton(Button chooseLevelButton) {
		this.chooseLevelButton = chooseLevelButton;
	}
}
