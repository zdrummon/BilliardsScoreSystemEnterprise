import java.util.Date;

public class BilliardLogicSupport {
	
	static Date dateLog = new Date();
	static int logCounter = 0;

	static int totalGameCount = 10;
	int currentGameNumber = 0;
	int[] gameWinRecordArray = new int[totalGameCount];
	int[][] ballOnTableArray = new int[16][2];
	int[] currentInningArray = new int[totalGameCount];
	int[] playerOneStats = new int[8];
	int[] playerTwoStats = new int[8];
	int currentInning = 0;
	int turnCounter = 0;
	int playerOneTargetBalls = 0;
	int playerTwoTargetBalls = 0;
	//WIP
	boolean[] pocketBallArray = new boolean[16]; 
			
	public BilliardLogicSupport() {
//ARRAY-INITIALIZERS-----------------------------------------------------------------------------------------------------		
		for (int i = 0; i < gameWinRecordArray.length; i++) {
			gameWinRecordArray[i] = 0;
		}
		
		for (int j = 0; j < 16; j++) {
			for (int i = 0; i < 2; i++) {
				ballOnTableArray[j][i] = 0;
			}	
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
	
	public void eventLog(String logEvent) {
		dateLog = new Date();
		String logCounterString = String.format("| % 10d|", ++logCounter);
		System.out.println(dateLog.toString() + logCounterString + logEvent);
	}
	
	public void exitGame() {
		eventLog(" exitGame method called.");
	}
	
	public void forfeit() {
		eventLog(" forfeit method called.");
		//TODO Exit game prompt
		exitGame();
	}
	
	public void exitSet() {
		eventLog(" exitSet method called.");
		//TODO exit set prompt
	}

	public void clearSetVariables() {
		eventLog(" clearSetVariables method called.");
	
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
		eventLog(" clearGameVariables method called.");
		
		//TODO stat recording
		
		for (int j = 0; j < 16; j++) {
			for (int i = 0; i < 2; i++) {
				ballOnTableArray[j][i] = 0;
			}	
		}
		
		playerOneTargetBalls = 0;
		playerTwoTargetBalls = 0;
		
		currentGameNumber++;
	}
	
	public void startSetInstance() {
		eventLog(" startSetInstance method called.");
		clearSetVariables();
	}
	
	public void startGameInstance() {
		eventLog(" startGameInstance method called.");
		clearGameVariables();
	}
	
	public void breakTriangle() {
		eventLog(" breakTriangle method called.");
	}
	
	public void modifyBallArray() {
		eventLog(" modifyBallArray method called.");
	}

	public void switchTurn() {
		eventLog(" switchTurn method called.");
	}
	
	public void scratchShot() {
		eventLog(" scratchShot method called.");
	}
	
	public void foulShot() {
		eventLog(" foulShot method called.");
	}
	
	public void missShot() {
		eventLog(" missShot method called.");
	}
	
	public void defShot() {
		eventLog(" defShot method called.");
	}
	
	public void assignBallTargets() {
		eventLog(" assignBallTargets method called.");
	}
	
	public void autoLose() {
		eventLog(" autoLose method called.");
	}
	
	public void callShot() {
		eventLog(" callShot method called.");
	}
	
	public void cueBall() {
		eventLog(" cueBall method called.");
	}

	public void oneBall() {
		eventLog(" oneBall method called.");
/*		if (pocketBallArray[1] == false) {
			ballOnTableArray[0][1] = 1;
		} else {
			ballOnTableArray[0][1] = 0;
		}
*/	}

	public void twoBall() {
		eventLog(" twoBall method called.");
	}

	public void threeBall() {
		eventLog(" threeBall method called.");
	}
	
	public void fourBall() {
		eventLog(" fourBall method called.");
	}
	
	public void fiveBall() {
		eventLog(" fiveBall method called.");
	}
	
	public void sixBall() {
		eventLog(" sixBall method called.");	
	}
	
	public void sevenBall() {
		eventLog(" sevenBall method called.");
	}
	
	public void eightBall() {
		eventLog(" eightBall method called.");
	}
	
	public void nineBall() {
		eventLog(" nineBall method called.");
	}
	
	public void tenBall() {
		eventLog(" tenBall method called.");
	}
	
	public void elevenBall() {
		eventLog(" elevenBall method called.");
	}
	
	public void twelveBall() {
		eventLog(" twelveBall method called.");
	}
	
	public void thirteenBall() {
		eventLog(" thirteenBall method called.");
	}
	
	public void fourteenBall() {
		eventLog(" fourteenBall method called.");
	}
	
	public void fifteenBall() {
		eventLog(" fifteenBall method called.");
	}
}