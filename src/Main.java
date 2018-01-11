//____________________TITLE______________________________________________________________________________________________
/*Billiard System v.0003
*coded by
*	Trevor Haggerty - cesismalon@gmail.com
*	Zachary Drummond - zdrummon@gmail.com
* */
//____________________INCLUDES___________________________________________________________________________________________
import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//____________________MAIN_______________________________________________________________________________________________
public class Main extends Application  {
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int windowHeight = (int) screenSize.getHeight() / 2;
	int windowWidth = (int) screenSize.getWidth() / 2;
	
	int buttonSizeWidth = windowWidth / 8;
	int buttonSizeHeight = windowHeight / 8;
		
	//int windowHeight = 600;
	//int windowWidth = 800;
						
	BilliardLogicSupport BSLogic = new BilliardLogicSupport();
	Stage BSWindow;
	Scene BSInterfaceScene, BSStartScene;
	
	public static void main(String[] arg) {
		launch(arg);		
	}
	
//____________________START______________________________________________________________________________________________
	@Override
	public void start(Stage BSStage) throws Exception {
		BSWindow = BSStage;
		BSWindow.setResizable(false);
		
		BSWindow.setTitle("Billiard Score System Enterprise - ObserVR 2018");
	
		int ballRowHeight = windowHeight / 8 - 15;		
	
//-------------------START-BUTTON----------------------------------------------------------------------------------------
		Button startButton = new Button("click to start score keeping");
		startButton.setOnAction(e -> BSWindow.setScene(BSInterfaceScene));
		startButton.setPrefSize(buttonSizeWidth * 2, buttonSizeHeight);
		startButton.relocate(windowWidth / 2 - buttonSizeWidth, windowHeight / 2 - buttonSizeHeight / 2);
	
//-------------------EXIT-BUTTON-----------------------------------------------------------------------------------------	
		Button exitButton = new Button("click to exit program");
		exitButton.setOnAction(e ->{
		BSWindow.close();
		
		});
		exitButton.setPrefSize(buttonSizeWidth * 2, buttonSizeHeight);
		exitButton.relocate(windowWidth / 2 - buttonSizeWidth, windowHeight / 2 + buttonSizeHeight / 2);
		
//-------------------START-SCREEN-LAYOUT---------------------------------------------------------------------------------
		Pane BSStartLayout = new Pane();
		BSStartLayout.getChildren().addAll(startButton,exitButton);
		BSStartScene = new Scene(BSStartLayout, windowWidth, windowHeight);
		BSWindow.setScene(BSStartScene);
			
//-------------------SCORE-KEEPING-SCREEN-COMPONENTS---------------------------------------------------------------------	
		Button breakButton = new Button("break");
		Button defShotButton = new Button("defense");
		Button ballPocketed = new Button("pocketed");
		Button missButton = new Button("miss");
		Button foulButton = new Button("foul");		
		Button forfeitButton = new Button("forfeit");		
		Button cueBallButton = new Button("Cue Ball");		
		Button oneBallButton = new Button("1 Ball");		
		Button twoBallButton = new Button("2 Ball");		
		Button threeBallButton = new Button("3 Ball");		
		Button fourBallButton = new Button("4 Ball");
		Button fiveBallButton = new Button("5 Ball");
		Button sixBallButton = new Button("6 Ball");		
		Button sevenBallButton = new Button("7 Ball");		
		Button eightBallButton = new Button("8 Ball");		
		Button nineBallButton = new Button("9 Ball");		
		Button tenBallButton = new Button("10 Ball");		
		Button elevenBallButton = new Button("11 Ball");		
		Button twelveBallButton = new Button("12 Ball");		
		Button thirteenBallButton = new Button("13 Ball");		
		Button fourteenBallButton = new Button("14 Ball");
		Button fifteenBallButton = new Button("15 Ball");					
		
//-------------------BREAK-BUTTON----------------------------------------------------------------------------------------
		breakButton.setOnAction(e ->{
			BSLogic.breakTriangle();
			breakButton.setVisible(false);
			defShotButton.setVisible(true);
		});
		breakButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		breakButton.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 - buttonSizeHeight * 5 / 2 - 10);
		
//-------------------BALL-POCKETED---------------------------------------------------------------------------------------		
		ballPocketed.setOnAction(e ->{
			BSLogic.modifyBallArray();
		});

		ballPocketed.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		ballPocketed.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 - buttonSizeHeight * 3 / 2 - 10);
				
//-------------------DEFENSIVE-SHOT-BUTTON-------------------------------------------------------------------------------
		defShotButton.setVisible(false);
		defShotButton.setOnAction(e -> BSLogic.defShot());
		defShotButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		defShotButton.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 - buttonSizeHeight / 2 - 10);

//-------------------MISS-BUTTON-----------------------------------------------------------------------------------------
		missButton.setOnAction(e -> BSLogic.missShot());
		missButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		missButton.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 + buttonSizeHeight / 2 - 10);
	
//-------------------FOUL-BUTTON-----------------------------------------------------------------------------------------
		foulButton.setOnAction(e -> BSLogic.foulShot());
		foulButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		foulButton.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 + buttonSizeHeight * 3 / 2 - 10);
			
//-------------------FORFEIT-BUTTON--------------------------------------------------------------------------------------
		forfeitButton.setOnAction(e -> BSLogic.forfeit());
		forfeitButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		forfeitButton.relocate(windowWidth / 2 - buttonSizeWidth / 4, windowHeight - buttonSizeHeight / 2 - 10);
		
//-------------------BALL-BUTTONS----------------------------------------------------------------------------------------	
		cueBallButton.setOnAction(e -> BSLogic.cueBall());
		cueBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		cueBallButton.relocate(windowWidth / 2 - buttonSizeWidth / 4, ballRowHeight - buttonSizeHeight / 2 - 10);

		oneBallButton.setOnAction(e -> BSLogic.oneBall());
		oneBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		oneBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 7) - buttonSizeWidth / 4 - 10, ballRowHeight);

		twoBallButton.setOnAction(e -> BSLogic.twoBall());
		twoBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		twoBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 6) - buttonSizeWidth / 4 - 10, ballRowHeight);

		threeBallButton.setOnAction(e -> BSLogic.threeBall());
		threeBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		threeBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 5) - buttonSizeWidth / 4 - 10, ballRowHeight);
		
		fourBallButton.setOnAction(e -> BSLogic.fourBall());
		fourBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		fourBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 4) - buttonSizeWidth / 4 - 10, ballRowHeight);		

		fiveBallButton.setOnAction(e -> BSLogic.fiveBall());
		fiveBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		fiveBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 3) - buttonSizeWidth / 4 - 10, ballRowHeight);		

		sixBallButton.setOnAction(e -> BSLogic.sixBall());
		sixBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		sixBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 2) - buttonSizeWidth / 4 - 10, ballRowHeight);		

		sevenBallButton.setOnAction(e -> BSLogic.sevenBall());
		sevenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		sevenBallButton.relocate(windowWidth / 2 - (windowWidth / 16) - buttonSizeWidth / 4 - 10, ballRowHeight);		

		eightBallButton.setOnAction(e -> BSLogic.eightBall());
		eightBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		eightBallButton.relocate(windowWidth / 2 - buttonSizeWidth / 4, ballRowHeight);		

		nineBallButton.setOnAction(e -> BSLogic.nineBall());
		nineBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		nineBallButton.relocate(windowWidth / 2 + (windowWidth / 16) - buttonSizeWidth / 4 + 10, ballRowHeight);		

		tenBallButton.setOnAction(e -> BSLogic.tenBall());
		tenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		tenBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 2) - buttonSizeWidth / 4 + 10, ballRowHeight);		

		elevenBallButton.setOnAction(e -> BSLogic.elevenBall());
		elevenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		elevenBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 3) - buttonSizeWidth / 4 + 10, ballRowHeight);		

		twelveBallButton.setOnAction(e -> BSLogic.twelveBall());
		twelveBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		twelveBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 4) - buttonSizeWidth / 4 + 10, ballRowHeight);		

		thirteenBallButton.setOnAction(e -> BSLogic.thirteenBall());
		thirteenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		thirteenBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 5) - buttonSizeWidth / 4 + 10, ballRowHeight);
			
		fourteenBallButton.setOnAction(e -> BSLogic.fourteenBall());
		fourteenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		fourteenBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 6) - buttonSizeWidth / 4 + 10, ballRowHeight);		

		fifteenBallButton.setOnAction(e -> BSLogic.fifteenBall());		
		fifteenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		fifteenBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 7) - buttonSizeWidth / 4 + 10, ballRowHeight);
		
//-------------------SCORE-KEEPING-SCREEN-LAYOUT-------------------------------------------------------------------------
		Pane BSInterfaceLayout = new Pane();
		
		BSInterfaceLayout.getChildren().addAll( breakButton, foulButton, missButton, defShotButton,
												forfeitButton, ballPocketed, cueBallButton, oneBallButton, 
												twoBallButton, threeBallButton, fourBallButton, fiveBallButton,
												sixBallButton, sevenBallButton, eightBallButton, nineBallButton,
												tenBallButton, elevenBallButton, twelveBallButton,
												thirteenBallButton, fourteenBallButton, fifteenBallButton);
		BSInterfaceScene =  new Scene(BSInterfaceLayout, windowWidth, windowHeight);
				
		BSStage.show(); 
	}	
}