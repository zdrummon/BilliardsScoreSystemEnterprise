//this class populates the main game screen
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class GameSceneContent {
	public GameSceneContent() {}
	
	private static Pane gameSceneLayout = new Pane();
	public static Scene gameScene = new Scene(gameSceneLayout, Game.windowWidth, Game.windowHeight);

	public void populateGameScene() {
		EventLog.logEvent("populate gameScene");	
		gameSceneLayout.getChildren().addAll();
	}
}
