
public class GameLogic {
	public GameLogic() {}
	public BallTracker ballTracker = new BallTracker();
	public Player[] playerArray = new Player[2];
	public int playerTurn = 0;
	
	
	
	
	public void trackBalls() {
		BallTracker ballTrackerBufferObj = new BallTracker();
		ballTrackerBufferObj.createBalls();
		ballTracker = ballTrackerBufferObj;
	}
	
	public void createPlayers() {
		for(int i = 0; i < 2 ; i++) {
			Player bufferPlayer = new Player(i);
			playerArray[i] = bufferPlayer;
			//TODO load players data from long term memoruuuuu
			
		}
	}
	
	public void confirmShot() {
		
		if ((playerArray[0].getBallsAssigned() == 0 || playerArray[1].getBallsAssigned() == 0 ) && ballTracker.getBreakShot() == false) {
			// TODO assignBallTargets();
		}
		
		for (int i = 1; i < ballTracker.ballArray.length; i++) {		
			if (ballTracker.ballArray[i].getBallToggled() == true) {
				ballTracker.ballArray[i].setOnTable(false);
				ballTracker.ballArray[i].setBallToggled(false);
				EventLog.logEvent("ball " + i + "'s data has been set to pocketed");
				GameSceneContent.ToggleButtonArray[i].setVisible(false);
			}
			
			
		}	
		if (ballTracker.ballArray[0].getBallToggled() == true) {
			GameSceneContent.ToggleButtonArray[0].isPressed = false;
			GameSceneContent.ToggleButtonArray[0].setStyle("-fx-background-color: #0f770f");	
		}
		
		for (int i = 0; i < 16; i++) {		
			if (ballTracker.ballArray[i].getOnTable() == true) {
				 if (i == 0 && ballTracker.breakShot == true) {
					 EventLog.logEvent("//TODO loseGame();");
									
				} 
				 else if (i == 0) {
					//if the cue ball went in
					 EventLog.logEvent("//TODO scratchShot();");
					
				} else if (i == 8) {
					EventLog.logEvent("//if the 8 ball went in");
					if (playerTurn == 1 && playerArray[0].getFinalShot() == true) {
						EventLog.logEvent("//TODO winGame();");
					} else if (playerTurn == 2 && playerArray[1].getFinalShot() == true) {
						EventLog.logEvent("//winGame();");
					} else if (playerTurn == 1 && playerArray[0].getFinalShot() == false) {
						EventLog.logEvent("//TODO loseGame();");
					} else if (playerTurn == 2 && playerArray[1].getFinalShot() == false) {
						EventLog.logEvent("//loseGame();");
					}					
					
				} else if (i < 8 && i > 0 && !(playerArray[0].getBallsAssigned() == 0 || playerArray[1].getBallsAssigned() == 0 )) {
					EventLog.logEvent("//if a solid went in");
					if (playerTurn == 1 && playerArray[0].getBallsAssigned() == 1) {
						EventLog.logEvent("//takeAnotherShot = true;");
					} else if (playerTurn == 2 && playerArray[1].getBallsAssigned() == 1) {
						EventLog.logEvent("//takeAnotherShot = true;");
					} 
					
				} else if (i > 8) {
					EventLog.logEvent("//if a stripe went in");
					if (playerTurn == 1 && playerArray[0].getBallsAssigned() == 2) {
						EventLog.logEvent("//takeAnotherShot = true;");
					} else if (playerTurn == 2 && playerArray[1].getBallsAssigned() == 2) {
						EventLog.logEvent("//takeAnotherShot = true;");
					}
				}
			}
		
		}
		
		
	}
	
	/*
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
	
	*/
	
	
}
