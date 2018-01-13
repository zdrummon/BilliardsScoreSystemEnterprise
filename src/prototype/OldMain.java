package prototype;
//____________________TITLE______________________________________________________________________________________________
/*Billiard System v.0005
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.text.*;

//____________________MAIN_______________________________________________________________________________________________
public class OldMain extends Application  {
		
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int windowHeight = (int) screenSize.getHeight() / 2;
	int windowWidth = (int) screenSize.getWidth() / 2;
	
	int buttonSizeWidth = windowWidth / 8;
	int buttonSizeHeight = windowHeight / 8;
	int ballRowHeight = windowHeight / 8 - 20;	
	
	BilliardLogicSupport BSLogic = new BilliardLogicSupport();
	Stage BSStage;
	Scene BSInterfaceScene, BSStartScene;
	
	public static void main(String[] arg) {		
		System.out.println("          EVENT TIME        |EVENT COUNT|LOG ITEM");
		launch(arg);	
	}
	
//____________________START______________________________________________________________________________________________
	@Override
	public void start(Stage BSStage) throws Exception {
		BSLogic.eventLog("launch program");
		
//CONSTRUCTORS-----------------------------------------------------------------------------------------------CONSTRUCTORS
		Image cueBallIcon      		= new Image(getClass().getResourceAsStream("cueball.png"));
		Image oneBallIcon      		= new Image(getClass().getResourceAsStream("1ball.png"));
		Image twoBallIcon      		= new Image(getClass().getResourceAsStream("2ball.png"));
		Image threeBallIcon    		= new Image(getClass().getResourceAsStream("3ball.png"));
		Image fourBallIcon     		= new Image(getClass().getResourceAsStream("4ball.png"));
		Image fiveBallIcon  	   	= new Image(getClass().getResourceAsStream("5ball.png"));
		Image sixBallIcon      		= new Image(getClass().getResourceAsStream("6ball.png"));
		Image sevenBallIcon    		= new Image(getClass().getResourceAsStream("7ball.png"));
		Image eightBallIcon    		= new Image(getClass().getResourceAsStream("8ball.png"));
		Image nineBallIcon     		= new Image(getClass().getResourceAsStream("9ball.png"));
		Image tenBallIcon      		= new Image(getClass().getResourceAsStream("10ball.png"));
		Image elevenBallIcon   		= new Image(getClass().getResourceAsStream("11ball.png"));
		Image twelveBallIcon   		= new Image(getClass().getResourceAsStream("12ball.png"));
		Image thirteenBallIcon 		= new Image(getClass().getResourceAsStream("13ball.png"));
		Image fourteenBallIcon 		= new Image(getClass().getResourceAsStream("14ball.png"));
		Image fifteenBallIcon  		= new Image(getClass().getResourceAsStream("15ball.png"));
			
		Pane BSStartLayout			= new Pane();
		Pane BSInterfaceLayout 		= new Pane();
		BSStartScene				= new Scene(BSStartLayout, windowWidth, windowHeight);
		BSInterfaceScene 			= new Scene(BSInterfaceLayout, windowWidth, windowHeight);
			
		Button startButton 			= new Button("click to start score keeping");
		Button exitButton 			= new Button("click to exit program");
		Button defShotButton 		= new Button("defense");
		Button ballPocketed 		= new Button("pocketed");
		Button missButton 			= new Button("miss");
		Button foulButton 			= new Button("foul");		
		Button forfeitButton 		= new Button("forfeit");		
		Button cueBallButton 		= new Button();		
		Button oneBallButton 		= new Button();		
		Button twoBallButton 		= new Button();		
		Button threeBallButton 		= new Button();		
		Button fourBallButton 		= new Button();
		Button fiveBallButton 		= new Button();
		Button sixBallButton 		= new Button();		
		Button sevenBallButton 		= new Button();		
		Button eightBallButton 		= new Button();		
		Button nineBallButton 		= new Button();		
		Button tenBallButton 		= new Button();		
		Button elevenBallButton 	= new Button();		
		Button twelveBallButton 	= new Button();		
		Button thirteenBallButton	= new Button();		
		Button fourteenBallButton 	= new Button();
		Button fifteenBallButton 	= new Button();	
		
		Text playerTurnText			= new Text();
		Text playerOneWins			= new Text();
		Text playerTwoWins			= new Text();
												
//STAGE-DETAILS---------------------------------------------------------------------------------------------STAGE-DETAILS		
		BSStage.setResizable(false);
		BSStage.setTitle("Billiard Score System Enterprise - ObserVR 2018");
					
//START-BUTTON-----------------------------------------------------------------------------------------------START-BUTTON
		startButton.setPrefSize(buttonSizeWidth * 2, buttonSizeHeight);
		startButton.relocate(windowWidth / 2 - buttonSizeWidth, windowHeight / 2 - buttonSizeHeight / 2);
		startButton.setOnAction(e -> {
			BSLogic.eventLog("start button pressed");
			BSStage.setScene(BSInterfaceScene);
			BSLogic.startSetInstance();
		});
		
//EXIT-BUTTON-------------------------------------------------------------------------------------------------EXIT-BUTTON
		exitButton.setPrefSize(buttonSizeWidth * 2, buttonSizeHeight);
		exitButton.relocate(windowWidth / 2 - buttonSizeWidth, windowHeight / 2 + buttonSizeHeight / 2);
		exitButton.setOnAction(e -> {
			BSLogic.eventLog("exit button pressed");
			BSStage.close();
		});
				
//START-SCREEN-LAYOUT---------------------------------------------------------------------------------START-SCREEN-LAYOUT
		BSStartLayout.getChildren().addAll(startButton, exitButton);
		BSStage.setScene(BSStartScene);
				
//SCORE-KEEPING-SCREEN-COMPONENTS---------------------------------------------------------SCORE-KEEPING-SCREEN-COMPONENTS
														//  @  \\
//PLAYER-TURN-DISPLAY--------------------------------------------------------------------------------PLAYYER-TURN-DISPLAY
		playerTurnText.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 - buttonSizeHeight * 5 / 2 - 10);
		playerTurnText.setText("player " + BSLogic.playerTurn + "'s turn");

//PLAYER-ONE-WINS--------------------------------------------------------------------------------PLAYYER-TURN-DISPLAY
		playerOneWins.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 - buttonSizeHeight * 5 / 2 + 5);
		playerOneWins.setText("player one total wins: " + BSLogic.playerOneStats[3]);

//PLAYER-TWO-WINS--------------------------------------------------------------------------------PLAYYER-TURN-DISPLAY
		playerTwoWins.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 - buttonSizeHeight * 5 / 2 + 20);
		playerTwoWins.setText("player two total wins: " + BSLogic.playerTwoStats[3]);

//BALL-POCKETED---------------------------------------------------------------------------------------------BALL-POCKETED
		ballPocketed.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		ballPocketed.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 - buttonSizeHeight * 3 / 2 - 10);
		ballPocketed.setOnAction(e -> {
			BSLogic.eventLog("ball pocketed button pressed.");
						
			BSLogic.modifyBallArray();
			
			if (BSLogic.ballOnTableArray[0] == 1) {
				cueBallButton.setStyle("-fx-background-color: #FFFFFF");
			} 	
			
			if (BSLogic.ballOnTableArray[1] == 1) {
				oneBallButton.setVisible(false);
			} 
			
			if (BSLogic.ballOnTableArray[2] == 1) {
				twoBallButton.setVisible(false);	
			} 
			
			if (BSLogic.ballOnTableArray[3] == 1) {
				threeBallButton.setVisible(false);	
			} 
			
			if (BSLogic.ballOnTableArray[4] == 1) {
				fourBallButton.setVisible(false);	
			} 
			
			if (BSLogic.ballOnTableArray[5] == 1) {
				fiveBallButton.setVisible(false);	
			} 
			
			if (BSLogic.ballOnTableArray[6] == 1) {
				sixBallButton.setVisible(false);
			}
			
			if (BSLogic.ballOnTableArray[7] == 1) {
				sevenBallButton.setVisible(false);
			} 
						
			if (BSLogic.ballOnTableArray[9] == 1) {
				nineBallButton.setVisible(false);
			} 
			
			if (BSLogic.ballOnTableArray[10] == 1) {
				tenBallButton.setVisible(false);
			} 
			
			if (BSLogic.ballOnTableArray[11] == 1) {
				elevenBallButton.setVisible(false);
			} 
			
			if (BSLogic.ballOnTableArray[12] == 1) {
				twelveBallButton.setVisible(false);
			} 
			
			if (BSLogic.ballOnTableArray[13] == 1) {
				thirteenBallButton.setVisible(false);
			} 
			
			if (BSLogic.ballOnTableArray[14] == 1) {
				fourteenBallButton.setVisible(false);
			} 
			
			if (BSLogic.ballOnTableArray[15] == 1) {
				fifteenBallButton.setVisible(false);
			}
					
			for (int i = 0; i < BSLogic.toggleButtonArray.length; i++) {
				if (BSLogic.toggleButtonArray[i] == true) {
					BSLogic.toggleButtonArray[i] = false;
				}
			}	
			
			if (BSLogic.restartGame == true) {
				oneBallButton.setVisible(true);		 
				twoBallButton.setVisible(true);			
				threeBallButton.setVisible(true);	
				fourBallButton.setVisible(true);	
				fiveBallButton.setVisible(true);
				sixBallButton.setVisible(true);
				sevenBallButton.setVisible(true);
				nineBallButton.setVisible(true);
				tenBallButton.setVisible(true);
				elevenBallButton.setVisible(true);
				twelveBallButton.setVisible(true);
				thirteenBallButton.setVisible(true);
				fourteenBallButton.setVisible(true);
				fifteenBallButton.setVisible(true);	
				
				cueBallButton.setStyle("-fx-background-color: #FFFFFF");
				oneBallButton.setStyle("-fx-background-color: #FFFFFF");
				twoBallButton.setStyle("-fx-background-color: #FFFFFF");
				threeBallButton.setStyle("-fx-background-color: #FFFFFF");
				fourBallButton.setStyle("-fx-background-color: #FFFFFF");
				fiveBallButton.setStyle("-fx-background-color: #FFFFFF");
				sixBallButton.setStyle("-fx-background-color: #FFFFFF");
				sevenBallButton.setStyle("-fx-background-color: #FFFFFF");
				eightBallButton.setStyle("-fx-background-color: #FFFFFF");
				nineBallButton.setStyle("-fx-background-color: #FFFFFF");
				tenBallButton.setStyle("-fx-background-color: #FFFFFF");
				elevenBallButton.setStyle("-fx-background-color: #FFFFFF");
				twelveBallButton.setStyle("-fx-background-color: #FFFFFF");
				thirteenBallButton.setStyle("-fx-background-color: #FFFFFF");
				fourteenBallButton.setStyle("-fx-background-color: #FFFFFF");
				fifteenBallButton.setStyle("-fx-background-color: #FFFFFF");
				
				
				playerOneWins.setText("player one total wins: " + BSLogic.playerOneStats[3]);
				playerTwoWins.setText("player two total wins: " + BSLogic.playerTwoStats[3]);

				BSLogic.restartGame = false;
			}
									
			for (int i = 0; i < BSLogic.toggleButtonArray.length; i++) {		
				BSLogic.toggleButtonArray[i] = false;
			}	
			playerTurnText.setText("player " + BSLogic.playerTurn + "'s turn");
		});	
		
//DEFENSIVE-SHOT-BUTTON-----------------------------------------------------------------------------DEFENSIVE-SHOT-BUTTON
		defShotButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		defShotButton.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 - buttonSizeHeight / 2 - 10);
		defShotButton.setOnAction(e -> {
			BSLogic.eventLog("defense shot button pressed.");
			BSLogic.defShot();
			playerTurnText.setText("player " + BSLogic.playerTurn + "'s turn");
		});
		
//MISS-BUTTON-------------------------------------------------------------------------------------------------MISS-BUTTON
		missButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		missButton.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 + buttonSizeHeight / 2 - 10);
		missButton.setOnAction(e -> {
			BSLogic.eventLog("missed shot button pressed.");
			BSLogic.missShot();
			playerTurnText.setText("player " + BSLogic.playerTurn + "'s turn");
		});
	
//FOUL-BUTTON-------------------------------------------------------------------------------------------------FOUL-BUTTON
		foulButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		foulButton.relocate(windowWidth / 2 - buttonSizeWidth / 2, windowHeight / 2 + buttonSizeHeight * 3 / 2 - 10);
		foulButton.setOnAction(e -> {
			BSLogic.eventLog("foul button pressed.");
			BSLogic.foulShot();
			playerTurnText.setText("player " + BSLogic.playerTurn + "'s turn");
		});
			
//FORFEIT-BUTTON-------------------------------------------------------------------------------------------FORFEIT-BUTTON
		forfeitButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		forfeitButton.relocate(windowWidth / 2 - buttonSizeWidth / 4, windowHeight - buttonSizeHeight / 2 - 10);
		forfeitButton.setOnAction(e -> {
			BSLogic.eventLog("forfeit button pressed.");
			BSLogic.forfeit();
			if (BSLogic.quitProgram == true) {
				BSStage.setScene(BSStartScene);
			}
			playerTurnText.setText("player " + BSLogic.playerTurn + "'s turn");
		});
		
//-------------------BALL-BUTTONS----------------------------------------------------------------------------------------
		cueBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		cueBallButton.relocate(windowWidth / 2 - buttonSizeWidth / 4, ballRowHeight - buttonSizeHeight / 2 - 10);
		cueBallButton.setGraphic(new ImageView(cueBallIcon));
		cueBallButton.setStyle("-fx-background-color: #FFFFFF");
		cueBallButton.setOnAction(e -> { 
			BSLogic.eventLog("cueBallButton pressed.");
			BSLogic.toggleBall(0);
			if (BSLogic.toggleButtonArray[0] == true) {
				cueBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				cueBallButton.setStyle("-fx-background-color: #FFFFFF");
			}
		});
		
		oneBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		oneBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 7) - buttonSizeWidth / 4 - 10, ballRowHeight);
		oneBallButton.setGraphic(new ImageView(oneBallIcon));
		oneBallButton.setStyle("-fx-background-color: #FFFFFF");
		oneBallButton.setOnAction(e -> { 
			BSLogic.eventLog("oneBallButton pressed.");
			BSLogic.toggleBall(1);
			if (BSLogic.toggleButtonArray[1] == true) {
				oneBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				oneBallButton.setStyle("-fx-background-color: #FFFFFF");
			}			
		});

		twoBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		twoBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 6) - buttonSizeWidth / 4 - 10, ballRowHeight);
		twoBallButton.setGraphic(new ImageView(twoBallIcon));
		twoBallButton.setStyle("-fx-background-color: #FFFFFF");
		twoBallButton.setOnAction(e -> { 
			BSLogic.eventLog("twoBallButton pressed.");
			BSLogic.toggleBall(2);
			if (BSLogic.toggleButtonArray[2] == true) {
				twoBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				twoBallButton.setStyle("-fx-background-color: #FFFFFF");
			}			
		});

		threeBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		threeBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 5) - buttonSizeWidth / 4 - 10, ballRowHeight);
		threeBallButton.setGraphic(new ImageView(threeBallIcon));
		threeBallButton.setStyle("-fx-background-color: #FFFFFF");
		threeBallButton.setOnAction(e -> { 
			BSLogic.eventLog("threeBallButton pressed.");
			BSLogic.toggleBall(3);
			if (BSLogic.toggleButtonArray[3] == true) {
				threeBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				threeBallButton.setStyle("-fx-background-color: #FFFFFF");
			}			
		});
		
		fourBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		fourBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 4) - buttonSizeWidth / 4 - 10, ballRowHeight);	
		fourBallButton.setGraphic(new ImageView(fourBallIcon));
		fourBallButton.setStyle("-fx-background-color: #FFFFFF");
		fourBallButton.setOnAction(e -> { 
			BSLogic.eventLog("fourBallButton pressed.");
			BSLogic.toggleBall(4);
			if (BSLogic.toggleButtonArray[4] == true) {
				fourBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				fourBallButton.setStyle("-fx-background-color: #FFFFFF");
			}		
		});

		fiveBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		fiveBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 3) - buttonSizeWidth / 4 - 10, ballRowHeight);	
		fiveBallButton.setGraphic(new ImageView(fiveBallIcon));
		fiveBallButton.setStyle("-fx-background-color: #FFFFFF");
		fiveBallButton.setOnAction(e -> { 
			BSLogic.eventLog("fiveBallButton pressed.");
			BSLogic.toggleBall(5);
			if (BSLogic.toggleButtonArray[5] == true) {
				fiveBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				fiveBallButton.setStyle("-fx-background-color: #FFFFFF");
			}			
		});
		
		sixBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		sixBallButton.relocate(windowWidth / 2 - (windowWidth / 16 * 2) - buttonSizeWidth / 4 - 10, ballRowHeight);		
		sixBallButton.setGraphic(new ImageView(sixBallIcon));
		sixBallButton.setStyle("-fx-background-color: #FFFFFF");
		sixBallButton.setOnAction(e -> { 
			BSLogic.eventLog("sixBallButton pressed.");
			BSLogic.toggleBall(6);
			if (BSLogic.toggleButtonArray[6] == true) {
				sixBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				sixBallButton.setStyle("-fx-background-color: #FFFFFF");
			}		
		});

		sevenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		sevenBallButton.relocate(windowWidth / 2 - (windowWidth / 16) - buttonSizeWidth / 4 - 10, ballRowHeight);		
		sevenBallButton.setGraphic(new ImageView(sevenBallIcon));
		sevenBallButton.setStyle("-fx-background-color: #FFFFFF");
		sevenBallButton.setOnAction(e -> { 
			BSLogic.eventLog("sevenBallButton pressed.");
			BSLogic.toggleBall(7);
			if (BSLogic.toggleButtonArray[7] == true) {
				sevenBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				sevenBallButton.setStyle("-fx-background-color: #FFFFFF");
			}			
		});

		eightBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		eightBallButton.relocate(windowWidth / 2 - buttonSizeWidth / 4, ballRowHeight);		
		eightBallButton.setGraphic(new ImageView(eightBallIcon));
		eightBallButton.setStyle("-fx-background-color: #FFFFFF");
		eightBallButton.setOnAction(e -> { 
			BSLogic.eventLog("eightBallButton pressed.");
			BSLogic.toggleBall(8);
			if (BSLogic.toggleButtonArray[8] == true) {
				eightBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				eightBallButton.setStyle("-fx-background-color: #FFFFFF");
			}			
		});

		nineBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		nineBallButton.relocate(windowWidth / 2 + (windowWidth / 16) - buttonSizeWidth / 4 + 10, ballRowHeight);		
		nineBallButton.setGraphic(new ImageView(nineBallIcon));
		nineBallButton.setStyle("-fx-background-color: #FFFFFF");
		nineBallButton.setOnAction(e -> { 
			BSLogic.eventLog("nineBallButton pressed.");
			BSLogic.toggleBall(9);
			if (BSLogic.toggleButtonArray[9] == true) {
				nineBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				nineBallButton.setStyle("-fx-background-color: #FFFFFF");
			}			
		});
		
		tenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		tenBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 2) - buttonSizeWidth / 4 + 10, ballRowHeight);		
		tenBallButton.setGraphic(new ImageView(tenBallIcon));
		tenBallButton.setStyle("-fx-background-color: #FFFFFF");
		tenBallButton.setOnAction(e -> { 
			BSLogic.eventLog("tenBallButton pressed.");
			BSLogic.toggleBall(10);
			if (BSLogic.toggleButtonArray[10] == true) {
				tenBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				tenBallButton.setStyle("-fx-background-color: #FFFFFF");
			}			
		});

		elevenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		elevenBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 3) - buttonSizeWidth / 4 + 10, ballRowHeight);	
		elevenBallButton.setGraphic(new ImageView(elevenBallIcon));
		elevenBallButton.setStyle("-fx-background-color: #FFFFFF");
		elevenBallButton.setOnAction(e -> { 
			BSLogic.eventLog("elevenBallButton pressed.");
			BSLogic.toggleBall(11);
			if (BSLogic.toggleButtonArray[11] == true) {
				elevenBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				elevenBallButton.setStyle("-fx-background-color: #FFFFFF");
			}			
		});

		twelveBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		twelveBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 4) - buttonSizeWidth / 4 + 10, ballRowHeight);	
		twelveBallButton.setGraphic(new ImageView(twelveBallIcon));
		twelveBallButton.setStyle("-fx-background-color: #FFFFFF");
		twelveBallButton.setOnAction(e -> { 
			BSLogic.eventLog("twelveBallButton pressed.");
			BSLogic.toggleBall(12);
			if (BSLogic.toggleButtonArray[12] == true) {
				twelveBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				twelveBallButton.setStyle("-fx-background-color: #FFFFFF");
			}			
		});

		thirteenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		thirteenBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 5) - buttonSizeWidth / 4 + 10, ballRowHeight);
		thirteenBallButton.setGraphic(new ImageView(thirteenBallIcon));
		thirteenBallButton.setStyle("-fx-background-color: #FFFFFF");
		thirteenBallButton.setOnAction(e -> { 
			BSLogic.eventLog("thirteenBallButton pressed.");
			BSLogic.toggleBall(13);
			if (BSLogic.toggleButtonArray[13] == true) {
				thirteenBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				thirteenBallButton.setStyle("-fx-background-color: #FFFFFF");
			}			
		});
			
		fourteenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		fourteenBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 6) - buttonSizeWidth / 4 + 10, ballRowHeight);
		fourteenBallButton.setGraphic(new ImageView(fourteenBallIcon));
		fourteenBallButton.setStyle("-fx-background-color: #FFFFFF");

		fourteenBallButton.setOnAction(e -> { 
			BSLogic.eventLog("fourteenBallButton pressed.");
			BSLogic.toggleBall(14);
			if (BSLogic.toggleButtonArray[14] == true) {
				fourteenBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				fourteenBallButton.setStyle("-fx-background-color: #FFFFFF");
			}		
		});

		fifteenBallButton.setPrefSize(buttonSizeWidth / 2, buttonSizeHeight / 2);
		fifteenBallButton.relocate(windowWidth / 2 + (windowWidth / 16 * 7) - buttonSizeWidth / 4 + 10, ballRowHeight);
		fifteenBallButton.setGraphic(new ImageView(fifteenBallIcon));
		fifteenBallButton.setStyle("-fx-background-color: #FFFFFF");

		fifteenBallButton.setOnAction(e -> { 
			BSLogic.eventLog("fifteenBallButton pressed.");
			BSLogic.toggleBall(15);
			if (BSLogic.toggleButtonArray[15] == true) {
				fifteenBallButton.setStyle("-fx-background-color: #FFFF00");
			} else {
				fifteenBallButton.setStyle("-fx-background-color: #FFFFFF");
			}
		});	
		
//-------------------SCORE-KEEPING-SCREEN-LAYOUT-------------------------------------------------------------------------		
		BSInterfaceLayout.getChildren().addAll( foulButton, missButton, defShotButton,
												forfeitButton, ballPocketed, cueBallButton, oneBallButton, 
												twoBallButton, threeBallButton, fourBallButton, fiveBallButton,
												sixBallButton, sevenBallButton, eightBallButton, nineBallButton,
												tenBallButton, elevenBallButton, twelveBallButton,
												thirteenBallButton, fourteenBallButton, fifteenBallButton, 
												playerTurnText, playerOneWins, playerTwoWins);				
		BSStage.show(); 
	}	
}