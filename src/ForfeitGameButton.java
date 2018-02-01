import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import java.util.Date;
public class ForfeitGameButton extends Button {
	public ForfeitGameButton(int x, int y, String bFile) {
		buttonImageFile = bFile;
		buttonX = x;
		buttonY = y;
	}
	
	private String buttonImageFile = "";	
	public boolean buttonActive = false;
	private int buttonX;
	private int buttonY;
	private int buttonWidth = 10;
	private int buttonHeight = 10;

	public void generateForfeitGameButton () {
		EventLog.logEvent("create button using " + buttonImageFile);	
		
		Image buttonImage = new Image(getClass().getResourceAsStream(buttonImageFile));
		this.setGraphic(new ImageView(buttonImage));
		
		this.setPrefSize(buttonWidth, buttonHeight);
		this.relocate(buttonX, buttonY);
		this.setStyle("-fx-background-color: #0f770f");	
		
		this.setOnAction(e -> {	
			this.setStyle("-fx-background-color: #ffff00");
		});
		
		this.setOnMouseExited(ae ->{
			this.setStyle("-fx-background-color: #0f770f");	
		});
		
		this.setOnMouseEntered(be ->{
			this.setStyle("-fx-background-color: #074407");
		});
		
		this.setOnMousePressed(ce -> {
			this.setStyle("-fx-background-color: #ffff00");
		});
		
		this.setOnMouseReleased(de ->{
			this.setStyle("-fx-background-color: #0f770f");	
			
			forfeitGame();
		});
	}
	
	public void forfeitGame() {
		EventLog.logEvent("close game");
		Game.mainStage.close();
	}
	
}
