
 /*===============================================
 *Billiards Score System - Enterprise v11		 *
 *coded by										 *
 *	Trevor Haggerty 	- cesismalon@gmail.com	 *
 *	Zachary Drummond 	- zdrummon@gmail.com	 *
 ===============================================*/

import javafx.application.*;
import javafx.stage.Stage;
public class Main extends Application {	
	public static void main(String[] arg) {				
		launch(arg);	
	}
	
	public GameWindow gameWindow = new GameWindow();
	
	@Override
	public void start(Stage MainStage) throws Exception {				
		EventLog.startLog();	
		
		gameWindow.createStage();	
	}
}