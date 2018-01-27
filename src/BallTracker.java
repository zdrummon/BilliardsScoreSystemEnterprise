public class BallTracker {
	public BallTracker() {}
	
	private static int ballID = 0;
	boolean breakShot = true;
	boolean takeAnotherShot = false;
	boolean playerOneFinalShot = false;
	boolean playerTwoFinalShot = false;
	
	public BallData[] ballArray = new BallData[16];
	
	public void createBalls() {
		for(int i = 0; i < 16; i++) {
			BallData ball = new BallData(i, 0, 0, true, false, false); 
			ballArray[i] = ball;
		}
	}

	
	public void assessBalls() {
		for(int i = 0; i < 16; i++) { 
			ballArray[i].getBallIndex();
			ballArray[i].getPocketLocation();
			ballArray[i].getOwner();
			ballArray[i].getOnTable();
			ballArray[i].getBallCalled();
			ballArray[i].getBallToggled();
		}
	}
	
	public void confirmShot() {
		
		//if ((playerOneTargetBalls == 0 || playerTwoTargetBalls == 0 ) && triangleBreak == false) {
		//	assignBallTargets();
		//}
		
		for (int i = 0; i < ballArray.length; i++) {		
			if (ballArray[i].getBallToggled() == true) {
				ballArray[i].setOnTable(false);
				ballArray[i].setBallToggled(false);
				EventLog.logEvent("ball " + i + "'s data has been set to pocketed");
//				gameSceneContent
			}
			
		}	
		/*
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
		
		
		*/
		
	}
	
	
	
	
	
	public void setBreakShot(boolean i) {
		EventLog.logEvent("breakShot set to" + i);
		breakShot = i;
	}
	
	public void setTakeAnotherShot(boolean i) {
		EventLog.logEvent("takeAnotherShot set to" + i);
		takeAnotherShot = i;
	}
	
	public void setPlayerOneFinalShot(boolean i) {
		EventLog.logEvent("playerOneFinalShot set to" + i);
		playerOneFinalShot = i;
	}
	
	public void setPlayerTwoFinalShot(boolean i) {
		EventLog.logEvent("playerTwoFinalShot set to" + i);
		playerTwoFinalShot = i;
	}
	
	public boolean getBreakShot() {
		EventLog.logEvent("breakShot is " + breakShot);
		boolean j = breakShot;
		return j;
	}
	
	public boolean getTakeAnotherShot() {
		EventLog.logEvent("takeAnotherShot is " + takeAnotherShot);
		boolean j = takeAnotherShot;
		return j;
	}
	
	public boolean getPlayerOneFinalShot() {
		EventLog.logEvent("playerOneFinalShot is " + playerOneFinalShot);
		boolean j = playerOneFinalShot;
		return j;
	}
	
	public boolean getPlayerTwoFinalShot() {
		EventLog.logEvent("playerTwoFinalShot is " + playerTwoFinalShot);
		boolean j = playerTwoFinalShot;
		return j;
	}
	
}
