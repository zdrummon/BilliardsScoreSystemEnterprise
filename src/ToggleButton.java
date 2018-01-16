//toggle button template
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

public class ToggleButton extends Button {
	public ToggleButton(int x, int y, String bFile, int i) {
		buttonFile = bFile;
		buttonX = x;
		buttonY = y;
		ballIndex = i;
	}
	
	private int ballIndex;
	private String buttonFile = "";	
	private int buttonX;
	private int buttonY;
	private boolean isPressed = false;
	private int buttonWidth = 10;
	private int buttonHeight = 10;
	
	public void generateToggleButton () {
		EventLog.logEvent("create ball with index " + ballIndex);
		Image buttonImage = new Image(getClass().getResourceAsStream(buttonFile));
		EventLog.logEvent("create " + buttonFile);	
		this.setGraphic(new ImageView(buttonImage));
		this.setPrefSize(buttonWidth, buttonHeight);
		this.relocate(buttonX, buttonY);
		this.setStyle("-fx-background-color: #0f770f");	
		this.setOnAction(e -> {
			if (isPressed == true) {
				this.setStyle("-fx-background-color: #0f770f");				
				EventLog.logEvent("untoggle " + ballIndex + " ball button");
				isPressed = false;
			} else {
				this.setStyle("-fx-background-color: #FFFF00");
				EventLog.logEvent("toggle " + ballIndex + " ball button");
				isPressed = true;
			}
		});
	}
}