//this class creates the play button
import javafx.scene.control.Button;

public class StartProgram{
	public StartProgram() {		
		playButton.relocate(200, 200);
		playButton.setOnAction(e -> {
			EventLog.logEvent("start game");	
			Game.mainStage.setScene(Game.startScene);
		});
	}
	
	public Button playButton = new Button("Start Program");
}