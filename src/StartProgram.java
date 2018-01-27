//this class creates the play button
import javafx.scene.control.Button;

public class StartProgram{
	public StartProgram() {}
	
	public Button playButton = new Button("Start Program");
	public static GameSceneContent gameSceneContent = new GameSceneContent();
	
	public void generateStartButton() {
		EventLog.logEvent("generate startButton");	
		playButton.relocate(200, 200);
		playButton.setOnAction(e -> {
			EventLog.logEvent("start game");	
			
			Game.mainStage.setScene(GameSceneContent.gameScene);
			gameSceneContent.populateGameScene();
			Game.beginGameLogic();
		});
	}
}