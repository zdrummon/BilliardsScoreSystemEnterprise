//this class populates the main game screen
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class GameSceneContent {
	public GameSceneContent() {}
	
	private static Pane gameSceneLayout = new Pane();
	public static Scene gameScene = new Scene(gameSceneLayout, Game.currentWindowWidth, Game.currentWindowHeight);

/*
	public ToggleButton cueBallButton = new ToggleButton(Game.windowWidth / 2 - 15, Game.windowHeight / 2 - 240, "images/cueball.png", ballID++);
*/
	public ForfeitGameButton forfeitGameButton  = new ForfeitGameButton(Game.currentWindowWidth / 2 - 55, Game.currentWindowHeight - 120, "images/forfeitGame.png");
	public FoulButton foulButton  = new FoulButton(Game.currentWindowWidth / 2 - 55, Game.currentWindowHeight - 220, "images/foul.png");
	public ConfirmShotButton confirmShotButton  = new ConfirmShotButton(Game.currentWindowWidth / 2 - 55, Game.currentWindowHeight - 320, "images/ballPocketed.png");
	
	
	private int buttonWidth = Game.currentWindowWidth / 15 - Game.currentWindowWidth / 15 / 4;
	private int buttonHeight = 30;
	private int buttonWidthBuffer = (Game.currentWindowWidth - buttonWidth * 15) / 16;
	
	public static ToggleButton[] ToggleButtonArray = new ToggleButton[16];
	
	public void populateGameScene() {
		
		
		for(int i = 1; i < 16; i++) {
			ToggleButton toggleButtonInstance = new ToggleButton((buttonWidthBuffer * i) + ((i - 1) * (buttonWidth)), Game.currentWindowHeight / 2 - 200, "images/"+ i +"ball.png", i); 
			EventLog.logEvent("button " + i + " is at " + (buttonWidthBuffer + ((i - 1) * buttonWidth)));
			ToggleButtonArray[i] = toggleButtonInstance;
			ToggleButtonArray[i].generateToggleButton();
			gameSceneLayout.getChildren().add(ToggleButtonArray[i]);
		}
		
		ToggleButtonArray[0] = new ToggleButton (Game.currentWindowWidth / 2 - buttonWidth / 2, 0, "images/cueball.png", 0); 
		ToggleButtonArray[0].generateToggleButton();
		EventLog.logEvent("populate gameScene");
		
		gameSceneLayout.setStyle("-fx-background-color: #0f770f");
		
		
		forfeitGameButton.generateForfeitGameButton();
		confirmShotButton.generateConfirmShotButton();
		foulButton.generateFoulButton();
				
		gameSceneLayout.getChildren().addAll(forfeitGameButton, confirmShotButton, foulButton, ToggleButtonArray[0]);
	}
	

	
}
