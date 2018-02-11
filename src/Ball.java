public class Ball {
	public Ball(int oBallIndex, int oPocketLocation, boolean oBallCalled, boolean oBallToggled) {
		ballIndex = oBallIndex;
		pocketLocation = oPocketLocation;
		ballCalled = oBallCalled;
		ballToggled = oBallToggled;
	}

	private int ballIndex;
	private int pocketLocation;
	private boolean ballCalled;
	private boolean ballToggled;

	//SETTERS	
	public void setBallIndex(int sBallIndex) {
		EventLog.logEvent("ballIndex set to " + sBallIndex);
		ballIndex = sBallIndex;
	}
	
	public void setPocketLocation(int sPocketLocation) {
		EventLog.logEvent("ball " + ballIndex + "'s pocketLocation set to " + sPocketLocation);
		pocketLocation = sPocketLocation;
	}
	
	public void setBallCalled(boolean sBallCalled) {
		EventLog.logEvent("ball " + ballIndex + "'s ballCalled set to " + sBallCalled);
		ballCalled = sBallCalled;
	}

	public void setBallToggled(boolean sBallToggled) {
//		EventLog.logEvent("ball " + ballIndex + "'s ballToggled set to " + sBallToggled); 
		ballToggled = sBallToggled;
	}
	
	//GETTERS
	public int getBallIndex() { return ballIndex; }
	public int getPocketLocation() { return pocketLocation; }
	public boolean getBallCalled() { return ballCalled; }
	public boolean getBallToggled() { return ballToggled; }
}