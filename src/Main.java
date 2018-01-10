//________________________TITLE________________________________________
/*Billiard System v.0002
*coded by Trevor Haggerty @ Zachary Drummond
*	cesismalon@gmail.com
*	zdrummon@gmail.com
* */

//what up johnny

//________________________*____________________________________________

import java.awt.Dimension;
import java.awt.Toolkit;

//________________________INCLUDES_____________________________________
import javafx.application.*;

import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;



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
	
	
	/*
	*/
	
	
	//________________________Start_____________________________________
	@Override
	public void start(Stage BSStage) throws Exception {
		BSWindow = BSStage;
		BSWindow.setResizable(false);
		
		BSWindow.setTitle("Billiard System - ObserVR 2018");
		
		//-------------------START-BUTTON--------------------------------
		Button startButton = new Button("click to start score keeping");
		startButton.setOnAction(e -> BSWindow.setScene(BSInterfaceScene));
		startButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		startButton.relocate(windowWidth / 2 -  buttonSizeWidth/2,windowHeight / 2 - buttonSizeHeight/2);
		
		//-------------------EXIT-BUTTON---------------------------------
		Button exitButton = new Button("click to exit program");
		exitButton.setOnAction(e ->{
		BSWindow.close();
		
		});
		exitButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		exitButton.relocate(windowWidth / 2-  buttonSizeWidth/2, windowHeight / 2 + buttonSizeHeight/2);
		
		//-------------------START-SCREEN-LAYOUT-------------------------
		Pane BSStartLayout = new Pane();
		BSStartLayout.getChildren().addAll(startButton,exitButton);
		BSStartScene = new Scene(BSStartLayout,windowWidth, windowHeight);
		BSWindow.setScene(BSStartScene);
		
		
		
		//-------------------SCORE-KEEPING-SCREEN-COMPONENTS-------------
		
		//-------------------BREAK-BUTTON--------------------------------
		Button breakButton = new Button("break");
		breakButton.setOnAction(e ->{
			BSLogic.breakTriangle();
			breakButton.setVisible(false);
		});
		breakButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		breakButton.relocate(windowWidth / 2 - buttonSizeWidth/2 ,windowHeight / 2 - buttonSizeHeight/2);
		
		//-------------------BALL-POCKETED--------------------------------
		Button ballPocketed = new Button("Balls\nPocketed");
		
		ballPocketed.setOnAction(e ->{
		BSLogic.modifyBallArray();
		});

		ballPocketed.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		ballPocketed.relocate(windowWidth / 2 -  buttonSizeWidth/2 ,windowHeight / 2 + buttonSizeHeight/2);
		
		//-------------------SCRATCH-BUTTON-------------------------------
		Button scratchButton = new Button("scratch");
		scratchButton.setOnAction(e -> BSLogic.scratchShot());
						
		scratchButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		scratchButton.relocate(windowWidth / 2 -  buttonSizeWidth ,windowHeight / 2 + buttonSizeHeight * 3/2);
		
		
		//-------------------DEFENSIVE-SHOT-BUTTON----------------------------------
		Button defShotButton = new Button("defence\nshot");
		defShotButton.setOnAction(e -> BSLogic.defShot());
		defShotButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		defShotButton.relocate(windowWidth / 2  ,windowHeight / 2 + buttonSizeHeight * 3/2);
		
		
		//-------------------FOUL-BUTTON----------------------------------
		Button foulButton = new Button("foul");
		foulButton.setOnAction(e -> BSLogic.foulShot());
		foulButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		foulButton.relocate(windowWidth / 2 -  buttonSizeWidth ,windowHeight / 2 + buttonSizeHeight * 5/2);
		//-------------------MISS-BUTTON----------------------------------
		Button missButton = new Button("miss");
		missButton.setOnAction(e -> BSLogic.missShot());
		missButton.setPrefSize(buttonSizeWidth, buttonSizeHeight);
		missButton.relocate(windowWidth / 2 ,windowHeight / 2 + buttonSizeHeight * 5/2);
		
		
		//-------------------FORFEIT-BUTTON-----------------------------------------
		Button forfeitButton = new Button("forfeit");
		forfeitButton.setOnAction(e -> BSLogic.forfeit());
		
		//-------------------SCORE-KEEPING-SCREEN-LAYOUT-----------------
		Pane BSInterfaceLayout = new Pane();
		

		BSInterfaceLayout.getChildren().addAll(breakButton,scratchButton,foulButton,missButton,defShotButton,
												forfeitButton,ballPocketed);
		BSInterfaceScene =  new Scene(BSInterfaceLayout, windowWidth, windowHeight);
		
		
		
		
		
		BSStage.show(); 
	}
	
	
	
	
	
	
	
	
}


