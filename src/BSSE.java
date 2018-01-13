import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
/*
import javafx.scene.text.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
*/

public class BSSE {
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int windowHeight = (int) screenSize.getHeight() / 2;
	int windowWidth = (int) screenSize.getWidth() / 2;
	
	Pane StartSceneLayout = new Pane();
	Scene StartScene = new Scene(StartSceneLayout, windowWidth, windowHeight);
	Stage MainStage = new Stage();
	EventLog Logger = new EventLog();
	
	public BSSE() {}
	
	public void makeMainStage() {
		
		//TEST OBJECTS
		Button testButton = new Button("test exit button");
		
		testButton.relocate(0, 0);
		testButton.setOnAction(e -> {
			MainStage.close();
			Logger.logEvent("end program");	
		});
		
		StartSceneLayout.getChildren().addAll(testButton);
		MainStage.setScene(StartScene);
		MainStage.show();
	}
}