//this class creates the game window and applies the scene
import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Game{
	public Game() {}	
	
	//screen and window dimensions
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static int windowHeight = (int) screenSize.getHeight() / 2;
	public static int windowWidth = (int) screenSize.getWidth() / 2;
	
	//window initial layout and source
	private static StartSceneContent startSceneContent = new StartSceneContent(); 
	public static Scene startScene = new Scene(startSceneContent.startSceneLayout, windowWidth, windowHeight);
	public static Stage mainStage = new Stage();
		
	//build and display the main program window
	public void makeMainStage() {
		EventLog.logEvent("show window");	
		
		startSceneContent.populateScene();
		mainStage.setScene(startScene);
		mainStage.show();
	}
}