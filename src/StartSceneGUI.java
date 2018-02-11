import javafx.scene.Scene;
import javafx.scene.layout.Pane;
//TODO possibly extend scene
public class StartSceneGUI{
	public StartSceneGUI() {}
	
	public static Pane startSceneLayout = new Pane();
	public static Scene startScene = new Scene(startSceneLayout, GameWindow.currentWindowWidth, GameWindow.currentWindowHeight);
	private StartButtonGUI startButton = new StartButtonGUI();

	public void populateScene() {
		EventLog.logEvent("populate startScene");
		
		startButton.createStartButton();
		
		startSceneLayout.setStyle("-fx-background-color: #0f770f");
		startSceneLayout.getChildren().add(startButton);
	}
}