import java.util.Date;

public class BilliardLogicSupport {
	
	static Date dateLog = new Date();
	static int logCounter = 0;
	
//GAME-VARIABLES-------------------------------------------------------------------------------------------GAME-VARIABLES
	static int totalGameCount = 10;
	int currentGameNumber = 0;
	int[] gameWinRecordArray = new int[totalGameCount];
	int[] ballOnTableArray = new int[16];
	int[] currentInningArray = new int[totalGameCount];
	int[] playerOneStats = new int[8];
	int[] playerTwoStats = new int[8];
	int currentInning = 0;
	int turnCounter = 0;
	int playerOneTargetBalls = 0;
	int playerTwoTargetBalls = 0;
	
//INTERFACE-VARIABLES---------------------------------------------------------------------------------INTERFACE-VARIABLES
	boolean[] toggleButtonArray = new boolean[16];	
	
	public BilliardLogicSupport() {
//ARRAY-INITIALIZERS-----------------------------------------------------------------------------------ARRAY-INITIALIZERS		
		for (int i = 0; i < gameWinRecordArray.length; i++) {
			gameWinRecordArray[i] = 0;
		}		
		
		for (int i = 0; i < ballOnTableArray.length; i++) {
			ballOnTableArray[i] = 0;
		}	
				
		for (int i = 0; i < currentInningArray.length; i++) {
			currentInningArray[i] = 0;
		}	
		
		for (int i = 0; i < playerOneStats.length; i++) {
			playerOneStats[i] = 0;
		}	
		
		for (int i = 0; i < playerTwoStats.length; i++) {
			playerTwoStats[i] = 0;
		}	
		
		for (int i = 0; i < toggleButtonArray.length; i++) {
			toggleButtonArray[i] = false;
		}
	}
	
	public void eventLog(String logEvent) {
		dateLog = new Date();
		String logCounterString = String.format("| % 10d|", ++logCounter);
		System.out.println(dateLog.toString() + logCounterString + logEvent + " ");
	}
	
	public void exitGame() {
		eventLog("exitGame method called.");
	}
	
	public void forfeit() {
		eventLog("forfeit method called.");
		//TODO Exit game prompt
		exitGame();
	}
	
	public void exitSet() {
		eventLog("exitSet method called.");
		//TODO exit set prompt
	}

	public void clearSetVariables() {
		eventLog("clearSetVariables method called.");
	
		currentGameNumber = 0;
		
		for (int i = 0; i < gameWinRecordArray.length; i++) {
			gameWinRecordArray[i] = 0;
		}	
		
		for (int i = 0; i < currentInningArray.length; i++) {
			currentInningArray[i] = 0;
		}	
		
		for (int i = 0; i < playerOneStats.length; i++) {
			playerOneStats[i] = 0;
		}	
		
		for (int i = 0; i < playerTwoStats.length; i++) {
			playerTwoStats[i] = 0;
		}			
	}
	
	public void clearGameVariables() {
		eventLog("clearGameVariables method called.");
		
		//TODO stat recording
		
		for (int i = 0; i < ballOnTableArray.length; i++) {
				ballOnTableArray[i] = 0;
		}
		
		playerOneTargetBalls = 0;
		playerTwoTargetBalls = 0;
		
		currentGameNumber++;
	}
	
	public void startSetInstance() {
		eventLog("startSetInstance method called.");
		clearSetVariables();
	}
	
	public void startGameInstance() {
		eventLog("startGameInstance method called.");
		clearGameVariables();
	}
	
	public void breakTriangle() {
		eventLog("breakTriangle method called.");
	}
	
	public void modifyBallArray() {
		eventLog("modifyBallArray method called.");
	}

	public void switchTurn() {
		eventLog("switchTurn method called.");
	}
	
	public void scratchShot() {
		eventLog("scratchShot method called.");
	}
	
	public void foulShot() {
		eventLog("foulShot method called.");
	}
	
	public void missShot() {
		eventLog("missShot method called.");
	}
	
	public void defShot() {
		eventLog("defShot method called.");
	}
	
	public void assignBallTargets() {
		eventLog("assignBallTargets method called.");
	}
	
	public void autoLose() {
		eventLog("autoLose method called.");
	}
	
	public void callShot() {
		eventLog("callShot method called.");
	}
	
	public void toggleBall(int ballIndex) {
		eventLog("toggleBall method called.");
		if (toggleButtonArray[ballIndex] == true) {
			toggleButtonArray[ballIndex] = false;
			eventLog( "toggleButtonArray[" + (ballIndex) + "] toggled to false.");
		} else {
			toggleButtonArray[ballIndex] = true;
			eventLog( "toggleButtonArray[" + (ballIndex) + "] toggled to true.");
		}	
	}
}