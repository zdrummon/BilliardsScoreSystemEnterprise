//this class populates the scene
import javafx.scene.layout.Pane;

public class StartSceneContent{
	public StartSceneContent() {}
	
	public Pane startSceneLayout = new Pane();
	private ExitProgram exitProgram = new ExitProgram();
	private StartProgram startProgram = new StartProgram();

	public void populateScene() {
		EventLog.logEvent("populate startScene");
		
		exitProgram.generateExitButton();
		startProgram.generateStartButton();
		
		startSceneLayout.setStyle("-fx-background-color: #0f770f");
		startSceneLayout.getChildren().addAll(exitProgram.exitButton, startProgram.playButton);
	}
}