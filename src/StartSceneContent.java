//this class populates the scene
import javafx.scene.layout.Pane;

public class StartSceneContent{
	public StartSceneContent() {}
	
	public Pane startSceneLayout = new Pane();
	private ExitProgram exitProgram = new ExitProgram();
	private StartProgram startProgram = new StartProgram();

	public void populateScene() {		
		startSceneLayout.getChildren().addAll(exitProgram.exitButton, startProgram.playButton);
	}
}