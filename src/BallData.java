public class BallData {
	public BallData(int cBallData, int cPocketLocation, int cOwner, boolean cOnTable, boolean cBallCalled , boolean cBallToggled) {
		ballIndex = cBallData;
		pocketLocation = cPocketLocation;
		owner = cOwner;
		onTable = cOnTable;
		ballCalled = cBallCalled;
		ballToggled = cBallToggled;
	}
	
	private int ballIndex;
	private int pocketLocation;
	private int owner;
	private boolean onTable;
	private boolean ballCalled;
	private boolean ballToggled;

	//SETTERS	
	public void setBallIndex (int i) {
		EventLog.logEvent("ballIndex set to " + i);
		ballIndex = i;
	}
	
	public void setPocketLocation (int i) {
		EventLog.logEvent("ball " + ballIndex + "'s pocketLocation set to " + i);
		pocketLocation = i;
	}
	
	public void setOwner (int i) {
		EventLog.logEvent("ball " + ballIndex + "'s owner set to " + i);
		owner = i;
	}
	
	public void setOnTable (boolean i) {
		EventLog.logEvent("ball " + ballIndex + "'s onTable set to " + i);
		onTable = i;
	}
	
	public void setBallCalled (boolean i) {
		EventLog.logEvent("ball " + ballIndex + "'s ballCalled set to " + i);
		ballCalled = i;
	}

	public void setBallToggled (boolean i) {
		EventLog.logEvent("ball " + ballIndex + "'s ballToggled set to " + i);
		ballToggled = i;
	}
	
	//GETTERS
	public int getBallIndex () {
		EventLog.logEvent("ballIndex is " + ballIndex);
		return ballIndex;
	}
	
	public int getPocketLocation () {
		EventLog.logEvent("ball " + ballIndex + "'s pocketLocation is " + pocketLocation);
		return pocketLocation;
	}
	
	public int getOwner () {
		EventLog.logEvent("ball " + ballIndex + "'s owner is " + owner);
		return owner;
	}
	
	public boolean getOnTable () {
		EventLog.logEvent("ball " + ballIndex + "'s onTable is " + onTable);
		return onTable;
	}
	
	public boolean getBallCalled () {
		EventLog.logEvent("ball " + ballIndex + "'s ballCalled is " + ballCalled);
		return ballCalled;
	}
	
	public boolean getBallToggled () {
		EventLog.logEvent("ball " + ballIndex + "'s ballCalled is " + ballToggled);
		return ballToggled;
	}
}