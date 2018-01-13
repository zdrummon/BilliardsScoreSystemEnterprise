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
	int[] playerOneStats = new int[10];
	int[] playerTwoStats = new int[10];
	/* 0 = sets played
	 * 1 = set won
	 * 2 = games played
	 * 3 = games won
	 * 4 = shots taken total
	 * 5 = innings played
	 * 6 = defense shots taken
	 * 7 = miss shots taken
	 * 8 = scratch shots taken
	 * 9 = foul shots taken
	 */
	
	int currentInning = 0;
	int playerTurn = 1;
	int playerOneTargetBalls = 0;
	int playerTwoTargetBalls = 0;
	int shotsTaken = 0;
	boolean takeAnotherShot = false;
	boolean quitProgram = false;
	boolean triangleBreak = true;
	boolean playerOneFinalShot = false;
	boolean playerTwoFinalShot = false;
	boolean restartGame = false;
	
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
		
		quitProgram = true;
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
		triangleBreak = true;
		currentGameNumber++;
		
		playerOneFinalShot = false;
		playerTwoFinalShot = false;
	}
	
	public void startSetInstance() {
		eventLog("startSetInstance method called.");
		clearSetVariables();
	}
	
	public void startGameInstance() {
		eventLog("startGameInstance method called.");
		clearGameVariables();
	}
	
	public void modifyBallArray() {
		eventLog("modifyBallArray method called.");
		
		if ((playerOneTargetBalls == 0 || playerTwoTargetBalls == 0 ) && triangleBreak == false) {
			assignBallTargets();
		}
		
		for (int i = 0; i < toggleButtonArray.length; i++) {		
			if (toggleButtonArray[i] == true) {
				ballOnTableArray[i] = 1;
			}
		}	
		
		for (int i = 0; i < toggleButtonArray.length; i++) {		
			if (toggleButtonArray[i] == true) {
				 if (i == 0 && triangleBreak == true) {
					loseGame();
									
				} else if (i == 0) {
					//if the cue ball went in
					scratchShot();
					
				} else if (i == 8) {
					//if the 8 ball went in
					if (playerTurn == 1 && playerOneFinalShot == true) {
						winGame();
					} else if (playerTurn == 2 && playerTwoFinalShot == true) {
						winGame();
					} else if (playerTurn == 1 && playerOneFinalShot == false) {
						loseGame();
					} else if (playerTurn == 2 && playerTwoFinalShot == false) {
						loseGame();
					}					
					
				} else if (i < 8 && i > 0 && !(playerOneTargetBalls == 0 || playerTwoTargetBalls == 0 )) {
					//if a solid went in
					if (playerTurn == 1 && playerOneTargetBalls == 1) {
						takeAnotherShot = true;
					} else if (playerTurn == 2 && playerTwoTargetBalls == 1) {
						takeAnotherShot = true;
					} 
					
				} else if (i > 8) {
					//if a stripe went in
					if (playerTurn == 1 && playerOneTargetBalls == 2) {
						takeAnotherShot = true;
					} else if (playerTurn == 2 && playerTwoTargetBalls == 2) {
						takeAnotherShot = true;
					}
				}
			}
		}	
		
		if (ballOnTableArray[1] == 1 && ballOnTableArray[2] == 1 && ballOnTableArray[3] == 1 && 
			ballOnTableArray[4] == 1 && ballOnTableArray[5] == 1 && ballOnTableArray[6] == 1 && 
			ballOnTableArray[7] == 1 && playerOneTargetBalls == 1 && playerTurn == 1) {
				playerOneFinalShot = true;
		}
		if (ballOnTableArray[9] == 1 && ballOnTableArray[10] == 1 && ballOnTableArray[11] == 1 && 
			ballOnTableArray[12] == 1 && ballOnTableArray[13] == 1 && ballOnTableArray[14] == 1 && 
			ballOnTableArray[15] == 1 && playerOneTargetBalls == 2 && playerTurn == 1) {
				playerOneFinalShot = true;
		}
		if (ballOnTableArray[1] == 1 && ballOnTableArray[2] == 1 && ballOnTableArray[3] == 1 && 
			ballOnTableArray[4] == 1 && ballOnTableArray[5] == 1 && ballOnTableArray[6] == 1 && 
			ballOnTableArray[7] == 1 && playerTwoTargetBalls == 1 && playerTurn == 2) {
				playerTwoFinalShot = true;
			}
			
		if (ballOnTableArray[9] == 1 && ballOnTableArray[10] == 1 && ballOnTableArray[11] == 1 && 
			ballOnTableArray[12] == 1 && ballOnTableArray[13] == 1 && ballOnTableArray[14] == 1 && 
			ballOnTableArray[15] == 1 && playerTwoTargetBalls == 2 && playerTurn == 2) {
				playerTwoFinalShot = true;
		}
			
		if (takeAnotherShot == false && triangleBreak == false) {
			switchTurn();
		} else {
			takeAnotherShot = false;
		}
	
		triangleBreak = false;
	}	

	public void switchTurn() {
		if (playerTurn == 1 ) {
			playerTurn = 2;
		} else if (playerTurn == 2 ){
			playerTurn = 1;		
		}
		
		eventLog("switchTurn method called.");
		eventLog("it is now player " + playerTurn + "'s turn");
	}
	
	public void scratchShot() {
		if (playerTurn == 1) {
			playerOneStats[8] = ++playerOneStats[8];
			eventLog("scratchShot method called.");
			eventLog("the player has scratched "+ playerOneStats[8] + " shots");
			++shotsTaken;
		
		} else {
			playerTwoStats[8] = ++playerTwoStats[8];
			eventLog("scratchShot method called.");
			eventLog("the player has scratched "+ playerTwoStats[8] + " shots");
			++shotsTaken;	
		}
	}
	
	public void foulShot() {
		if (playerTurn == 1 ) {
			playerOneStats[9]= ++playerOneStats[9];
			eventLog("foulShot method called.");
			eventLog("the player has had "+ playerOneStats[9] + " foul shots");
			++shotsTaken;
			switchTurn();
			
		} else {
			playerTwoStats[9]= ++playerTwoStats[9];
			eventLog("foulShot method called.");
			eventLog("the player has had "+ playerTwoStats[9] + " foul shots");
			++shotsTaken;
			switchTurn();
		}
	}
	
	public void missShot() {
		if (playerTurn == 1 ) {
			playerOneStats[7]= ++playerOneStats[7];
			eventLog("missShot method called.");
			eventLog("the player has missed "+ playerOneStats[7] + " shots");
			++shotsTaken;
			switchTurn();
		
		} else {
			playerTwoStats[7]= ++playerTwoStats[7];
			eventLog("missShot method called.");
			eventLog("the player has missed "+ playerTwoStats[7] + " shots");
			++shotsTaken;
			switchTurn();
		}
	}
	
	public void defShot() {
		if (playerTurn == 1 ) {
			playerOneStats[6]= ++playerOneStats[6];
			eventLog("defShot method called.");
			eventLog("the player has had "+ playerOneStats[6] + " defensive shots");
			++shotsTaken;
			switchTurn();
		
		} else {
			playerTwoStats[6]= ++playerTwoStats[6];
			eventLog("defShot method called.");
			eventLog("the player has had "+ playerTwoStats[6] + " defensive shots");
			++shotsTaken;
			switchTurn();
		}
	}

	public void assignBallTargets() {
		
		for (int i = 0; i < toggleButtonArray.length; i++) {		
			if (toggleButtonArray[i] == true && i < 8) {
				if (playerTurn == 1 ) {
					playerOneTargetBalls = 1;
					playerTwoTargetBalls = 2;
				} else if (playerTurn == 2 ){
					playerOneTargetBalls = 2;
					playerTwoTargetBalls = 1;
				}
				
			} else if (toggleButtonArray[i] == true && i > 8) {
				if (playerTurn == 1 ) {
					playerOneTargetBalls = 2;
					playerTwoTargetBalls = 1;
				} else if (playerTurn == 2 ){
					playerOneTargetBalls = 1;
					playerTwoTargetBalls = 2;
				}			
			}
		}	
		
		eventLog("assignBallTargets method called.");
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
	
	public void winGame() {
		eventLog("winGame method called.");
		if (playerTurn == 1) {
			gameWinRecordArray[currentGameNumber] = 1;
			eventLog("playerOne set to victor of game number " + currentGameNumber);
			playerOneStats[3]++;
			restartGame = true;
		} else {
			gameWinRecordArray[currentGameNumber] = 2;
			eventLog("playerTwo set to victor of game number " + currentGameNumber);
			playerTwoStats[3]++;
			restartGame = true;
		}
		
		clearGameVariables();		
	}
	
	public void loseGame() {
		eventLog("loseGame method called.");
		if (playerTurn == 1) {
			gameWinRecordArray[currentGameNumber] = 2;
			eventLog("playerTwo set to victor of game number " + currentGameNumber);
			playerTwoStats[3]++;
			restartGame = true;
		} else {
			gameWinRecordArray[currentGameNumber] = 1;
			eventLog("playerOne set to victor of game number " + currentGameNumber);
			playerOneStats[3]++;
			restartGame = true;
		}
		
		switchTurn();
		clearGameVariables();
	}
}