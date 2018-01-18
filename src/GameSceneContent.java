//this class populates the main game screen
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class GameSceneContent {
	public GameSceneContent() {}
	
	private static Pane gameSceneLayout = new Pane();
	public static Scene gameScene = new Scene(gameSceneLayout, Game.windowWidth, Game.windowHeight);
	private static int ballID = 0;
	
	public ToggleButton cueBallButton = new ToggleButton(Game.windowWidth / 2 - 15, Game.windowHeight / 2 - 240, "images/cueball.png", ballID++);
	public ToggleButton oneBallButton = new ToggleButton(Game.windowWidth / 2 - 390, Game.windowHeight / 2 - 200, "images/1ball.png", ballID++);
	public ToggleButton twoBallButton = new ToggleButton(Game.windowWidth / 2 - 340, Game.windowHeight / 2 - 200, "images/2ball.png", ballID++);
	public ToggleButton threeBallButton = new ToggleButton(Game.windowWidth / 2 - 290, Game.windowHeight / 2 - 200, "images/3ball.png", ballID++);
	public ToggleButton fourBallButton = new ToggleButton(Game.windowWidth / 2 - 240, Game.windowHeight / 2 - 200, "images/4ball.png", ballID++);
	public ToggleButton fiveBallButton = new ToggleButton(Game.windowWidth / 2 - 190, Game.windowHeight / 2 - 200, "images/5ball.png", ballID++);
	public ToggleButton sixBallButton = new ToggleButton(Game.windowWidth / 2 - 140, Game.windowHeight / 2 - 200, "images/6ball.png", ballID++);
	public ToggleButton sevenBallButton = new ToggleButton(Game.windowWidth / 2 - 90, Game.windowHeight / 2 - 200, "images/7ball.png", ballID++);
	public ToggleButton eightBallButton = new ToggleButton(Game.windowWidth / 2 -15, Game.windowHeight / 2 - 175, "images/8ball.png", ballID++);
	public ToggleButton nineBallButton = new ToggleButton(Game.windowWidth / 2 + 60, Game.windowHeight / 2 - 200, "images/9ball.png", ballID++);
	public ToggleButton tenBallButton = new ToggleButton(Game.windowWidth / 2 + 110, Game.windowHeight / 2 - 200, "images/10ball.png", ballID++);
	public ToggleButton elevenBallButton = new ToggleButton(Game.windowWidth / 2 + 160, Game.windowHeight / 2 - 200, "images/11ball.png", ballID++);
	public ToggleButton twelveBallButton = new ToggleButton(Game.windowWidth / 2 + 210, Game.windowHeight / 2 - 200, "images/12ball.png", ballID++);
	public ToggleButton thirteenBallButton = new ToggleButton(Game.windowWidth / 2 + 260, Game.windowHeight / 2 - 200, "images/13ball.png", ballID++);
	public ToggleButton fourteenBallButton = new ToggleButton(Game.windowWidth / 2 + 310, Game.windowHeight / 2 - 200, "images/14ball.png", ballID++);
	public ToggleButton fifteenBallButton = new ToggleButton(Game.windowWidth / 2 + 360, Game.windowHeight / 2 - 200, "images/15ball.png", ballID++);
	
	public ForfeitGameButton forfeitGameButton  = new ForfeitGameButton(Game.windowWidth / 2 - 45, Game.windowHeight - 120, "images/forfeitGame.png");
	public FoulButton foulButton  = new FoulButton(Game.windowWidth / 2 - 45, Game.windowHeight - 220, "images/foul.png");
	public ConfirmShotButton confirmShotButton  = new ConfirmShotButton(Game.windowWidth / 2 - 45, Game.windowHeight - 320, "images/ballPocketed.png");

	public void populateGameScene() {	
		EventLog.logEvent("populate gameScene");
		
		gameSceneLayout.setStyle("-fx-background-color: #0f770f");
		
		cueBallButton.generateToggleButton();	
		oneBallButton.generateToggleButton();
		twoBallButton.generateToggleButton();
		threeBallButton.generateToggleButton();
		fourBallButton.generateToggleButton();
		fiveBallButton.generateToggleButton();
		sixBallButton.generateToggleButton();
		sevenBallButton.generateToggleButton();
		eightBallButton.generateToggleButton();
		nineBallButton.generateToggleButton();
		tenBallButton.generateToggleButton();
		elevenBallButton.generateToggleButton();
		twelveBallButton.generateToggleButton();
		thirteenBallButton.generateToggleButton();
		fourteenBallButton.generateToggleButton();
		fifteenBallButton.generateToggleButton();
		
		forfeitGameButton.generateForfeitGameButton();
		confirmShotButton.generateConfirmShotButton();
		foulButton.generateFoulButton();
		
		
		
		gameSceneLayout.getChildren().addAll(cueBallButton, oneBallButton, twoBallButton, threeBallButton, fourBallButton, fiveBallButton, 
											 sixBallButton, sevenBallButton, eightBallButton, nineBallButton, tenBallButton, 
											 elevenBallButton, twelveBallButton, thirteenBallButton, fourteenBallButton, 
											 fifteenBallButton, forfeitGameButton, confirmShotButton, foulButton);
	}
	
	public void startGameLogic() {
		
		
		
	}
	
}
