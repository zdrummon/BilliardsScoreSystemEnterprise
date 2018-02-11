import javafx.scene.control.Button;
public class StartButtonGUI extends Button {
	public StartButtonGUI() {
		this.setText("Start 8-ball Set");
	}
		
	public void createStartButton() {
		EventLog.logEvent("create startButton");	

		this.relocate(GameWindow.currentWindowWidth / 2, GameWindow.currentWindowHeight / 2);
		this.setOnAction(e -> {
			EventLog.logEvent("start game");	
			
			GameWindow.stage.setScene(GameSceneGUI.gameScene);
			GameWindow.gameSceneGUI.populateGameScene();
			GameWindow.startGameLogic();
		});
	}
}