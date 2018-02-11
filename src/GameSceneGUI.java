import javafx.scene.Scene;
import javafx.scene.layout.Pane;
//TODO possibly extend scene
public class GameSceneGUI {
	public GameSceneGUI() {}
	
	private static Pane gameSceneLayout = new Pane();
	public static Scene gameScene = new Scene(gameSceneLayout, GameWindow.currentWindowWidth, GameWindow.currentWindowHeight);
	public static ToggleButton[] ToggleButtonArray = new ToggleButton[16];
	
	public ForfeitGameButton forfeitGameButton  = new ForfeitGameButton(GameWindow.currentWindowWidth / 2 - 55, GameWindow.currentWindowHeight - 120, "images/forfeitGame.png");
	public ConfirmShotButton confirmShotButton  = new ConfirmShotButton(GameWindow.currentWindowWidth / 2 - 55, GameWindow.currentWindowHeight - 320, "images/ballPocketed.png");
	public FoulButton foulButton  = new FoulButton(GameWindow.currentWindowWidth / 2 - 55, GameWindow.currentWindowHeight - 220, "images/foul.png");
	
	//align toggle button variables
	private int buttonWidth = GameWindow.currentWindowWidth / 15 - GameWindow.currentWindowWidth / 15 / 4;
	private int buttonWidthBuffer = (GameWindow.currentWindowWidth - buttonWidth * 15) / 16;
	
	public void populateGameScene() {
		EventLog.logEvent("populate gameScene");
		
		//create ball buttons
		for(int i = 1; i < 16; i++) {
			ToggleButton toggleButtonInstance = new ToggleButton((buttonWidthBuffer * i) + ((i - 1) * (buttonWidth)), GameWindow.currentWindowHeight / 2 - 200, "images/" + i + "ball.png", i); 
			ToggleButtonArray[i] = toggleButtonInstance;
			ToggleButtonArray[i].generateToggleButton();
			gameSceneLayout.getChildren().add(ToggleButtonArray[i]);
		}
		
		//create cue ball button
		ToggleButtonArray[0] = new ToggleButton (GameWindow.currentWindowWidth / 2 - buttonWidth / 2, 0, "images/cueball.png", 0); 
		ToggleButtonArray[0].generateToggleButton();
	
		forfeitGameButton.generateForfeitGameButton();
		confirmShotButton.generateConfirmShotButton();
		foulButton.generateFoulButton();
		
		gameSceneLayout.setStyle("-fx-background-color: #0f770f");		
		gameSceneLayout.getChildren().addAll(forfeitGameButton, confirmShotButton, foulButton, ToggleButtonArray[0]);
	}
}
