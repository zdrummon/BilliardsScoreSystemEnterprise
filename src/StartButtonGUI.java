
import javafx.scene.control.Button;

public class StartButtonGUI extends Button {
	public StartButtonGUI() {
		this.setText("Start 8-ball Set");
	}
		
	public void createStartButton() {
		EventLog.logEvent("create startButton");	

		this.relocate(200, 200);
		this.setOnAction(e -> {
			EventLog.logEvent("start game");	
			
			GameWindow.stage.setScene(GameSceneGUI.gameScene);
			
			//TODO draw screen class
			GameWindow.gameSceneGUI.populateGameScene();
			GameWindow.startGameLogic();
		});
	}
}