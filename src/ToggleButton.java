//toggle button template
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
public class ToggleButton extends Button {
	public ToggleButton(int x, int y, String buttonFile, int ballData) {
		buttonImageFile = buttonFile;
		buttonX = x;
		buttonY = y;
		ballIndex = ballData;
	}
	
	private int ballIndex;
	private String buttonImageFile = "";	
	private int buttonX;
	private int buttonY;
	private boolean isPressed = false;
	private int buttonWidth = 0;
	private int buttonHeight = 0;
	
	public void generateToggleButton () {
		EventLog.logEvent("create ball with index " + ballIndex);
		EventLog.logEvent("create button using " + buttonImageFile);	
		
		Image buttonImage = new Image(getClass().getResourceAsStream(buttonImageFile));
		this.setGraphic(new ImageView(buttonImage));
		
		this.setPrefSize(buttonWidth, buttonHeight);
		this.relocate(buttonX, buttonY);
		this.setStyle("-fx-background-color: #0f770f");	
		
		this.setOnAction(e -> {
			if (isPressed == true) {
				EventLog.logEvent("deactive " + ballIndex + " ball button");
				
				this.setStyle("-fx-background-color: #0f770f");				
				isPressed = false;
				Game.gameLogic.ballTracker.ballArray[ballIndex].setBallToggled(false);
				
			} else {
				EventLog.logEvent("activate " + ballIndex + " ball button");
				
				this.setStyle("-fx-background-color: #FFFF00");
				isPressed = true;
				Game.gameLogic.ballTracker.ballArray[ballIndex].setBallToggled(true);
			}
		});
		
		this.setOnMouseExited(ae ->{
			if (isPressed == false)  {
			EventLog.logEvent("change button to green");
			this.setStyle("-fx-background-color: #0f770f");	
			}
		});
		
		this.setOnMouseEntered(be ->{
			if (isPressed == false)  {
			EventLog.logEvent("change button to dark green");
			this.setStyle("-fx-background-color: #074407");
			}
		});
	}
}