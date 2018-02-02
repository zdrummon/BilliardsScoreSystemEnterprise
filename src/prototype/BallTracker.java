package prototype;
/*
import Ball;
import EventLog;

public class BallTracker {
	public BallTracker() {}
	
	private static int ballID = 0;
	boolean breakShot = true;
	boolean takeAnotherShot = false;
	boolean playerOneFinalShot = false;
	boolean playerTwoFinalShot = false;
	
	public Ball[] ballArray = new Ball[16];
	
	public void createBalls() {
		for(int i = 0; i < 16; i++) {
			Ball ball = new Ball(i, 0, 0, true, false, false); 
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
*/