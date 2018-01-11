//____________________TITLE______________________________________________________________________________________________
/*Billiard System v.0004
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
	int ballRowHeight = windowHeight / 8 - 15;	
	//int windowHeight = 600;
	//int windowWidth = 800;
			
	BilliardLogicSupport BSLogic = new BilliardLogicSupport();
	Stage BSStage;
	Scene BSInterfaceScene, BSStartScene;
	
	public static void main(String[] arg) {		
		System.out.println( "          EVENT TIME        |EVENT COUNT|LOG ITEM");
		launch(arg);	
	}
	
//____________________START______________________________________________________________________________________________
	@Override
	public void start(Stage BSStage) throws Exception {
		BSLogic.eventLog(" launch program");
		
//CONSTRUCTORS-----------------------------------------------------------------------------------------------CONSTRUCTORS
		Pane BSStartLayout = new Pane();
		Pane BSInterfaceLayout = new Pane();
		BSStartScene = new Scene(BSStartLayout, windowWidth, windowHeight);
		BSInterfaceScene =  new Scene(BSInterfaceLayout, windowWidth, windowHeight);
		Button startButton = new Button("click to start score keeping");
		Button exitButton = new Button("click to exit program");
		Button breakButton = new Button("break");
		Button defShotButton = new Button("defense");
		Button ballPocketed = new Button("pocketed");
		Button missButton = new Button("miss");
		Button foulButton = new Button("foul");		
		Button forfeitButton = new Button("forfeit");		
		Button cueBallButton = new Button("cue Ball");		
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
													
//STAGE-DETAILS---------------------------------------------------------------------------------------------STAGE-DETAILS		
		BSStage.setResizable(false);
		BSStage.setTitle("Billiard Score System Enterprise - ObserVR 2018");
					
//START-BUTTON-----------------------------------------------------------------------------------------------START-BUTTON
		startButton.setPrefSize(buttonSizeWidth * 2, buttonSizeHeight);
		startButton.relocate(windowWidth / 2 - buttonSizeWidth, windowHeight / 2 - buttonSizeHeight / 2);
		startButton.setOnAction(e -> {
			BSLogic.eventLog(" start button pressed");
			BSStage.setScene(BSInterfaceScene);
			BSLogic.startSetInstance();
		});
		
//EXIT-BUTTON-------------------------------------------------------------------------------------------------EXIT-BUTTON
		exitButton.setPrefSize(buttonSizeWidth * 2, buttonSizeHeight);
		exitButton.relocate(windowWidth / 2 - buttonSizeWidth, windowHeight / 2 + buttonSizeHeight / 2);
		exitButton.setOnAction(e -> {
			BSLogic.eventLog(" exit button pressed");
			BSStage.close();
		});
				
//START-SCREEN-LAYOUT---------------------------------------------------------------------------------START-SCREEN-LAYOUT
		BSStartLayout.getChildren().addAll(startButton, exitButton);
		BSStage.setScene(BSStartScene);
			
//SCORE-KEEPING-SCREEN-COMPONENTS---------------------------------------------------------SCORE-KEEPING-SCREEN-COMPONENTS
														//  @  \\
//BREAK-BUTTON-----------------------------------------------------------------------------------------------BREAK-BUTTON
		breakButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		breakButton.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 - buttonSizeHeight * 5 / 2 - 10);
		breakButton.setOnAction(e -> {
			BSLogic.eventLog(" break button pressed.");
			BSLogic.breakTriangle();
			breakButton.setVisible(false);
			defShotButton.setVisible(true);
		});
		
//BALL-POCKETED---------------------------------------------------------------------------------------------BALL-POCKETED
		ballPocketed.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		ballPocketed.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 - buttonSizeHeight * 3 / 2 - 10);
		ballPocketed.setOnAction(e -> {
			BSLogic.eventLog(" ball pocketed button pressed.");
			BSLogic.modifyBallArray();
		});	
		
//DEFENSIVE-SHOT-BUTTON-----------------------------------------------------------------------------DEFENSIVE-SHOT-BUTTON
		defShotButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		defShotButton.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 - buttonSizeHeight / 2 - 10);
		defShotButton.setVisible(false);
		defShotButton.setOnAction(e -> {
			BSLogic.eventLog(" defense shot button pressed.");
			BSLogic.defShot();
		});
		
//MISS-BUTTON-------------------------------------------------------------------------------------------------MISS-BUTTON
		missButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		missButton.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 + buttonSizeHeight / 2 - 10);
		missButton.setOnAction(e -> {
			BSLogic.eventLog(" missed shot button pressed.");
			BSLogic.missShot();
		});
	
//FOUL-BUTTON-------------------------------------------------------------------------------------------------FOUL-BUTTON
		foulButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		foulButton.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 + buttonSizeHeight * 3 / 2 - 10);
		foulButton.setOnAction(e -> {
			BSLogic.eventLog(" foul button pressed.");
			BSLogic.foulShot();
		});
			
//FORFEIT-BUTTON-------------------------------------------------------------------------------------------FORFEIT-BUTTON
		forfeitButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		forfeitButton.relocate(windowWidth / 2 - buttonSizeWidth / 4, windowHeight - buttonSizeHeight / 2 - 10);
		forfeitButton.setOnAction(e -> {
			BSLogic.eventLog(" forfeit button pressed.");
			BSLogic.forfeit();
		});
		
//-------------------BALL-BUTTONS----------------------------------------------------------------------------------------
		cueBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		cueBallButton.relocate(windowWidth / 2 - buttonSizeWidth / 4, ballRowHeight - buttonSizeHeight / 2 - 10);
		cueBallButton.setOnAction(e -> { 
			BSLogic.eventLog(" cue ball button pressed.");
			BSLogic.cueBall();
		});
		
		oneBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		oneBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 7) - buttonSizeWidth / 4 - 10, ballRowHeight);
		oneBallButton.setOnAction(e -> {
			BSLogic.eventLog(" 1 ball button pressed.");
			BSLogic.oneBall();
		});

		twoBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		twoBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 6) - buttonSizeWidth / 4 - 10, ballRowHeight);
		twoBallButton.setOnAction(e -> {
			BSLogic.eventLog(" 2 ball button pressed.");
			BSLogic.twoBall();
		});

		threeBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		threeBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 5) - buttonSizeWidth / 4 - 10, ballRowHeight);
		threeBallButton.setOnAction(e -> {
			BSLogic.eventLog(" 3 ball button pressed.");
			BSLogic.threeBall();
		});
		
		fourBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		fourBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 4) - buttonSizeWidth / 4 - 10, ballRowHeight);	
		fourBallButton.setOnAction(e -> {
			BSLogic.eventLog(" 4 ball button pressed.");
			BSLogic.fourBall();
		});

		fiveBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		fiveBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 3) - buttonSizeWidth / 4 - 10, ballRowHeight);	
		fiveBallButton.setOnAction(e -> {
			BSLogic.eventLog(" 5 ball button pressed.");
			BSLogic.fiveBall();
		});

		sixBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		sixBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 2) - buttonSizeWidth / 4 - 10, ballRowHeight);		
		sixBallButton.setOnAction(e -> {
			BSLogic.eventLog(" 6 ball button pressed.");
			BSLogic.sixBall();
		});

		sevenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		sevenBallButton.relocate(windowWidth / 2 - (windowWidth / 16) - buttonSizeWidth / 4 - 10, ballRowHeight);		
		sevenBallButton.setOnAction(e -> {
			BSLogic.eventLog(" 7 ball button pressed.");
			BSLogic.sevenBall();
		});

		eightBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		eightBallButton.relocate(windowWidth / 2 - buttonSizeWidth / 4, ballRowHeight);		
		eightBallButton.setOnAction(e -> {
			BSLogic.eventLog(" 8 ball button pressed.");
			BSLogic.eightBall();
		});

		nineBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		nineBallButton.relocate(windowWidth / 2 + (windowWidth / 16) - buttonSizeWidth / 4 + 10, ballRowHeight);		
		nineBallButton.setOnAction(e -> {
			BSLogic.eventLog(" 9 ball button pressed.");
			BSLogic.nineBall();
		});

		tenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		tenBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 2) - buttonSizeWidth / 4 + 10, ballRowHeight);		
		tenBallButton.setOnAction(e -> {
			BSLogic.eventLog(" 10 ball button pressed.");
			BSLogic.tenBall();
		});

		elevenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		elevenBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 3) - buttonSizeWidth / 4 + 10, ballRowHeight);	
		elevenBallButton.setOnAction(e -> {
			BSLogic.eventLog(" 11 ball button pressed.");
			BSLogic.elevenBall();
		});

		twelveBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		twelveBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 4) - buttonSizeWidth / 4 + 10, ballRowHeight);	
		twelveBallButton.setOnAction(e -> {
			BSLogic.eventLog(" 12 ball button pressed.");
			BSLogic.twelveBall();
		});

		thirteenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		thirteenBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 5) - buttonSizeWidth / 4 + 10, ballRowHeight);
		thirteenBallButton.setOnAction(e -> {
			BSLogic.eventLog(" 13 ball button pressed.");
			BSLogic.thirteenBall();
		});
			
		fourteenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		fourteenBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 6) - buttonSizeWidth / 4 + 10, ballRowHeight);
		fourteenBallButton.setOnAction(e -> {
			BSLogic.eventLog(" 14 ball button pressed.");
			BSLogic.fourteenBall();
		});

		fifteenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		fifteenBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 7) - buttonSizeWidth / 4 + 10, ballRowHeight);
		fifteenBallButton.setOnAction(e -> {
			BSLogic.eventLog(" 15 ball button pressed.");
			BSLogic.fifteenBall();
		});		
		
//-------------------SCORE-KEEPING-SCREEN-LAYOUT-------------------------------------------------------------------------		
		BSInterfaceLayout.getChildren().addAll( breakButton, foulButton, missButton, defShotButton,
												forfeitButton, ballPocketed, cueBallButton, oneBallButton, 
												twoBallButton, threeBallButton, fourBallButton, fiveBallButton,
												sixBallButton, sevenBallButton, eightBallButton, nineBallButton,
												tenBallButton, elevenBallButton, twelveBallButton,
												thirteenBallButton, fourteenBallButton, fifteenBallButton);				
		BSStage.show(); 
	}	
}