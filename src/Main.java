/*Billiard Score System - Enterprise v6
*coded by
*	Trevor Haggerty 	- cesismalon@gmail.com
*	Zachary Drummond 	- zdrummon@gmail.com
*/

import javafx.application.*;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static EventLog Logger = new EventLog();
	public BSSE BSSEManager = new BSSE();
	
	public static void main(String[] arg) {		
		launch(arg);	
	}
	
	@Override
	public void start(Stage MainStage) throws Exception {		
		Logger.logEvent("start program");			
		BSSEManager.makeMainStage();	
		Logger.logEvent("end program");
	}
}