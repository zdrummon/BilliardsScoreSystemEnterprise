
public class GameLogic {
	public GameLogic() {}
	public BallTracker ballTracker = new BallTracker();
	public Player[] playerArray = new Player[2];
	public int playerTurn = 1;
	
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
				
		//assign balls
		if ((playerArray[0].getBallsAssigned() == 0 || playerArray[1].getBallsAssigned() == 0 ) && ballTracker.getBreakShot() == false) {
			ballsAssignment();
		}
		
		//reset and hide buttons
		for (int i = 1; i < ballTracker.ballArray.length; i++) {		
			if (ballTracker.ballArray[i].getBallToggled() == true) {
				ballTracker.ballArray[i].setOnTable(false);
				ballTracker.ballArray[i].setBallToggled(false);
				EventLog.logEvent("ball " + i + "'s data has been set to pocketed");
				GameSceneContent.ToggleButtonArray[i].setVisible(false);
			}
		}	
		
		//reset cue ball button
		if (ballTracker.ballArray[0].getBallToggled() == true) {
			GameSceneContent.ToggleButtonArray[0].isPressed = false;
			GameSceneContent.ToggleButtonArray[0].setStyle("-fx-background-color: #0f770f");	
		}
		
		//shot logic
		for (int i = 0; i < 16; i++) {		
			if (ballTracker.ballArray[i].getOnTable() == true) {
				 if (i == 0 && ballTracker.breakShot == true) {
					 
					//if cue ball goes in on break
					EventLog.logEvent("Cue ball went in on the break");		
//					playerArray[1].winGame();
				
				 } else if (i == 0) {
					
					//if the cue ball went in
					EventLog.logEvent("Scratched the shot");
					scratchShot();
					
				 } else if (i == 8) {

					//the 8 ball goes in
					EventLog.logEvent("The 8 ball went in");
					
					if (playerTurn == 0 && playerArray[0].getFinalShot() == true) {
						//player 1 wins
						EventLog.logEvent("8 ball went in and the game is won for " + playerTurn);
					
					} else if (playerTurn == 1 && playerArray[1].getFinalShot() == true) {
						//player 2 wins
						EventLog.logEvent("8 ball went in and the game is won for " + playerTurn);
					
					} else if (playerTurn == 0 && playerArray[0].getFinalShot() == false) {
						//player 1 loses
						EventLog.logEvent("8 ball went in and the game is lost for for " + playerTurn);
					
					} else if (playerTurn == 1 && playerArray[1].getFinalShot() == false) {
						//player 2 loses
						EventLog.logEvent("8 ball went in and the game is lost for for " + playerTurn);						
					}
					
					
				} else if (i < 8 && i > 0 && !(playerArray[0].getBallsAssigned() == 0 || playerArray[1].getBallsAssigned() == 0)) {
					
					//a solid ball or balls went in and players balls have been assigned
					EventLog.logEvent("solids went in for " + playerTurn);
					
					if (playerTurn == 0 && playerArray[0].getBallsAssigned() == 1) {
						//solids went in for the solids player, and that player is player 1
						EventLog.logEvent("solids player " + playerTurn + " may take another shot");
						takeAnotherShot();
						
					} else if (playerTurn == 1 && playerArray[1].getBallsAssigned() == 1) {
						//solids went in for the solids player, and that player is player 2
						EventLog.logEvent("solids player " + playerTurn + " may take another shot");
						takeAnotherShot();
						
					}  else {
						switchTurn();
					}
					
				} else if (i > 8 && i < 16 && !(playerArray[0].getBallsAssigned() == 0 || playerArray[1].getBallsAssigned() == 0)) {
					//a solid ball or balls went in and players balls have been assigned
					EventLog.logEvent("stripess went in for " + playerTurn);
					
					if (playerTurn == 0 && playerArray[0].getBallsAssigned() == 2) {
						//stripes went in for the stripes player, and that player is player 1
						EventLog.logEvent("stripes player " + playerTurn + " may take another shot");
						takeAnotherShot();
					
					} else if (playerTurn == 1 && playerArray[1].getBallsAssigned() == 2) {
						//stripes went in for the stripes player, and that player is player 2
						EventLog.logEvent("stripes player " + playerTurn + " may take another shot");
						takeAnotherShot();

					} else {
						switchTurn();
					}
					
				} else {
					EventLog.logEvent("no balls went in");
				}
			}		
		}
		
		EventLog.logEvent("breakShot set to false");
		ballTracker.breakShot = false;
	}
	
	public void switchTurn() {	
		
		playerArray[playerTurn].setShotsTakenThisGame(playerArray[playerTurn].getShotsTakenThisGame() + 1);
		
		if (playerTurn == 0) {
			playerTurn++;
			EventLog.logEvent("switch to player " + playerTurn);
		} else {
			playerTurn--;
			EventLog.logEvent("switch to player " + playerTurn);
		}
	}
	
	public void takeAnotherShot( ) {
		EventLog.logEvent("player " + playerTurn + " take another shot");
		playerArray[playerTurn].setShotsTakenThisGame(playerArray[playerTurn].getShotsTakenThisGame() + 1);
	}
	
	public void scratchShot() {
		EventLog.logEvent("player " + playerTurn + " scratched the shot");
		playerArray[playerTurn].setFoulsThisGame(playerArray[playerTurn].getFoulsThisGame() + 1);
		switchTurn();
	}
	
	public void resetGame() {
		
	}
	
	public void resetSet() {
		
	}
	
	public void ballsAssignment() {
		
		for (int i = 0; i < 16; i++) {		
			if (ballTracker.ballArray[i].getBallToggled() == true && i < 8 && ballTracker.getBreakShot() == false) {
				if (playerTurn == 0) {
					playerArray[0].setBallsAssigned(1);
					playerArray[1].setBallsAssigned(2);
				} else if (playerTurn == 1) {
					playerArray[0].setBallsAssigned(2);
					playerArray[1].setBallsAssigned(1);
				}
				
			} else if (ballTracker.ballArray[i].getBallToggled() == true && i > 8 && ballTracker.getBreakShot() == false) {
				if (playerTurn == 1) {
					playerArray[0].setBallsAssigned(2);
					playerArray[1].setBallsAssigned(1);
				} else if (playerTurn == 0) {
					playerArray[0].setBallsAssigned(1);
					playerArray[1].setBallsAssigned(2);
				}			
			}
		}	
		
		EventLog.logEvent("solids and stripes assigned");
	}
}
