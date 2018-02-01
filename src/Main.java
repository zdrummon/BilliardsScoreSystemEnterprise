
 /*===============================================
 *Billiards Score System - Enterprise v9		 *
 *coded by										 *
 *	Trevor Haggerty 	- cesismalon@gmail.com	 *
 *	Zachary Drummond 	- zdrummon@gmail.com	 *
 ===============================================*/

import javafx.application.*;
import javafx.stage.Stage;

public class Main extends Application {	
	public static void main(String[] arg) {				
		//executes start for javafx
		launch(arg);	
	}
	
	public Game gameWindow = new Game();
	
	//executes the main program
	@Override
	public void start(Stage MainStage) throws Exception {				
		EventLog.startLog();
		EventLog.logEvent("start program");	
		
		gameWindow.makeMainStage();	
	}
}