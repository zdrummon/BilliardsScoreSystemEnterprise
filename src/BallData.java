public class BallData {
	public BallData() {
		for (int i = 0; i < ballsOnTableArray.length; i++) {
			ballsOnTableArray[i] = 0;
		}
		
		for (int i = 0; i < toggledButtonArray.length; i++) {
			toggledButtonArray[i] = false;
		}
	}
	
	int[] ballsOnTableArray = new int[16];
	boolean[] toggledButtonArray = new boolean[16];
	boolean breakShot = true;
	boolean takeAnotherShot = false;
	boolean playerOneFinalShot = false;
	boolean playerTwoFinalShot = false;

	//SETTERS
	public void setBallsOnTable(int index, int ballPocketedLocation) {
		EventLog.logEvent("ball " + index + " set to pocket " + ballPocketedLocation);
		ballsOnTableArray[index] = ballPocketedLocation;
	}
	
	public void setToggledButtonArray(int index, boolean isBallSelected) {
		EventLog.logEvent("ball " + index + " set to toggled " + isBallSelected);
		toggledButtonArray[index] = isBallSelected;
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
	
	//GETTERS
	public int getBallsOnTable(int index) {
		int resultingPocket = ballsOnTableArray[index];
		EventLog.logEvent("ball " + index + " is in pocket " + resultingPocket);
		return resultingPocket;
	}
	
	public boolean getToggledButtonArray(int index) {
		boolean resultingSelection = toggledButtonArray[index];
		EventLog.logEvent("ball " + index + " is toggled " + resultingSelection);
		return resultingSelection;
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