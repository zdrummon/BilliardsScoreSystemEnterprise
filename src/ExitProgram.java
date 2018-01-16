//this class creates the exit button
import javafx.scene.control.Button;

public class ExitProgram{
	public ExitProgram() {
		exitButton.relocate(200, 400);
		exitButton.setOnAction(e -> {
			Game.mainStage.close();
			EventLog.logEvent("end program");	
			EventLog.endLog();	
		});
	}
	
	public Button exitButton = new Button("Exit Program");

}