import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.stage.Stage;
//TODO possibly extend stage
public class GameWindow{
	public GameWindow() {}
	
	//screen and window dimensions
	//TODO add getters and setters for window dimension
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static int currentWindowHeight = (int) screenSize.getHeight() / 2;
	public static int currentWindowWidth = (int) screenSize.getWidth() / 2;
	
	//window layout and source
	public static StartSceneGUI startSceneGUI = new StartSceneGUI(); 
	public static GameSceneGUI gameSceneGUI = new GameSceneGUI();
	public static Stage stage = new Stage();
	
	//logic elements
	public static CoreLogic coreLogic = new CoreLogic();
		
	public void createStage() {
		EventLog.logEvent("create game window");	
		
		startSceneGUI.populateScene();
		
		stage.setTitle(EventLog.programVersion);
		stage.setResizable(true);
		stage.setScene(StartSceneGUI.startScene);
		stage.show();
		
		screenResize();
	}
	
	public static void startGameLogic() {
		EventLog.logEvent("create game logic elements");
		
		coreLogic.createBalls();
		coreLogic.createPlayers();	
		coreLogic.createGames();
	}
	
	//TODO screen resize listener redraw
	public static void screenResize() {
		stage.widthProperty().addListener(ea -> {			
			EventLog.logEvent("new screen width is " + currentWindowWidth);
			currentWindowWidth = (int)stage.getWidth();

		});
		
		stage.heightProperty().addListener(ea -> {
			EventLog.logEvent("new screen height is " + currentWindowHeight);
			currentWindowHeight = (int)stage.getHeight();
		});
	}
}