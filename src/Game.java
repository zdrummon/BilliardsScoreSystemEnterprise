//this class creates the game window and applies the scene
import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Game{
	public Game() {}	
	
	//screen and window dimensions
	public static GameLogic gameLogic = new GameLogic();
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private static int startWindowHeight = (int) screenSize.getHeight() / 2;
	private static int startWindowWidth = (int) screenSize.getWidth() / 2;
	public static int currentWindowHeight = startWindowHeight;
	public static int currentWindowWidth = startWindowWidth;
	
	//window initial layout and source
	private static StartSceneContent startSceneContent = new StartSceneContent(); 
	public static Scene startScene = new Scene(startSceneContent.startSceneLayout, currentWindowWidth, currentWindowHeight);
	public static Stage mainStage = new Stage();
		
	//build and display the main program window
	public void makeMainStage() {
		EventLog.logEvent("show window");	
		
		startSceneContent.populateScene();
		
		mainStage.setTitle(EventLog.programVersion);
		mainStage.setResizable(true);
		mainStage.setScene(startScene);
		mainStage.show();
		screenResize();
	}
	
	public static void beginGameLogic() {
		gameLogic.trackBalls();
		gameLogic.createPlayers();
		
	}
	
	public static void screenResize() {
		mainStage.widthProperty().addListener(ea -> {
			currentWindowWidth = (int)mainStage.getWidth();
			EventLog.logEvent("new screen width is " + currentWindowWidth);
		});
		
		mainStage.heightProperty().addListener(ea -> {
			currentWindowHeight = (int)mainStage.getHeight();
			EventLog.logEvent("new screen height is " + currentWindowHeight);
		});
	}
}