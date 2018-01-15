import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;

/*
import javafx.scene.text.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
*/

public class BSSE {
	
	//screen and window dimensions
	private Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private int windowHeight = (int) ScreenSize.getHeight() / 2;
	private int windowWidth = (int) ScreenSize.getWidth() / 2;
	
	//window initial layout and source
	private Pane StartSceneLayout = new Pane();
	private Scene StartScene = new Scene(StartSceneLayout, windowWidth, windowHeight);
	private Stage MainStage = new Stage();
	
	public Button ExitButton = new Button("exit program");
	
	public BSSE() {}
	
	public void makeMainStage() {
		EventLog.logEvent("log object test");	
		
		//TEST OBJECTS
		
		ExitButton.relocate(50, 50);
		ExitButton.setOnAction(e -> {
			MainStage.close();
			EventLog.endLog();	
		});
//		ExitButton.buttonPress();


		StartSceneLayout.getChildren().addAll(ExitButton);
		MainStage.setScene(StartScene);
		MainStage.show();

	}
}