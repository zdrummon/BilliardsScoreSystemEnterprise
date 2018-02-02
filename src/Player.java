public class Player {
	public Player(int oPlayerIndex) {
		playerIndex = oPlayerIndex;
	}

	private int playerIndex;
	private int targetBalls = 0;
	
	//SETTERS
	public void setPlayerIndex(int sPlayerIndex) {
		EventLog.logEvent("playerID set to " + sPlayerIndex);
		playerIndex = sPlayerIndex;
	}
	
	public void setTargetBalls(int sTargetBalls) {
		EventLog.logEvent("player " + playerIndex + "'s targetBalls set to " + sTargetBalls);
		targetBalls = sTargetBalls;
	}	
	
	//GETTERS
	public int getPlayerIndex() { return playerIndex; }
	public int getTargetBalls() { return targetBalls; }
}