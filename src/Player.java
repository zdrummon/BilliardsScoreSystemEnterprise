
public class Player {
	public Player(int pPlayerID) {
		playerID = pPlayerID;
		
		breakShot = false;
		finalShot = false;
		ballInHand = false;
		
		ballsAssigned = 0;
		
		gamesWon = 0;
		shotsTakenThisGame = 0;
		shotsTakenThisSet = 0;
		foulsThisGame = 0;
		foulsThisSet = 0;
	}

	int playerID;
	boolean breakShot;
	boolean finalShot;
	boolean ballInHand;
	int ballsAssigned;
	
	
	int gamesWon;
	int shotsTakenThisGame;
	int shotsTakenThisSet;
	int foulsThisGame;
	int foulsThisSet;
	
	/*---TODO single set data
	defense shots this game
	defense shots this set
	miss shots this game
	miss shots this set

	---long term data
	sets won
	shots taken ever
	defense shots ever
	miss shots ever
	fouls ever
	times colors were stripes ever
	times colors were solids ever
	break shots taken ever
	balls made on all break shots ever
	balls pocketed ever
	pocket preference
		1 %
		2 %
		3 %
		4 %
		5 %
		6 %
	*/

	//SETTERS
	private void setBreakShot (boolean sBreakShot) {
		EventLog.logEvent("player " + playerID + "'s breakShot set to " + breakShot);
		breakShot = sBreakShot;
	}
	
	private void setFinalShot (boolean sFinalShot) {
		EventLog.logEvent("player " + playerID + "'s finalShot set to " + finalShot);
		finalShot = sFinalShot;
	}
	
	private void setBallInHand (boolean sBallInHand) {
		EventLog.logEvent("player " + playerID + "'s ballInHand set to " + ballInHand);
		ballInHand = sBallInHand;
	}
	
	private void setbBllsAssigned (int sBallsAssigned) {
		EventLog.logEvent("player " + playerID + "'s ballsAssigned set to " + ballsAssigned);
		ballsAssigned = sBallsAssigned;
	}
	
	private void setPlayerID (int sPlayerID) {
		EventLog.logEvent("playerID set to " + playerID);
		playerID = sPlayerID;
	}
	
	private void setGamesWon(int sGamesWon) {
		EventLog.logEvent("player " + playerID + "'s wins have been set to " + gamesWon);
		gamesWon = sGamesWon;
	}
	
	private void setShotsTakenThisGame(int sShotsTakenThisGame) {
		EventLog.logEvent("player " + playerID + "'s shotsTakenThisGame have been set to " + shotsTakenThisGame);		
		shotsTakenThisGame = sShotsTakenThisGame;
	}
	
	private void setShotsTakenThisSet(int sShotsTakenThisSet) {
		EventLog.logEvent("player " + playerID + "'s shotsTakenThisSet have been set to " + shotsTakenThisSet);
		shotsTakenThisSet = sShotsTakenThisSet;
	}
	
	private void setFoulsThisGame(int sFoulsThisGame) {
		EventLog.logEvent("player " + playerID + "'s foulsThisGame have been set to " + foulsThisGame);
		foulsThisGame = sFoulsThisGame;
	}
	
	private void setFoulsThisSet(int sFoulsThisSet) {
		EventLog.logEvent("player " + playerID + "'s foulsThisSet have been set to  " + foulsThisSet);
		foulsThisSet = sFoulsThisSet;
	}

	
	//GETTERS
	private boolean getBreakShot () {
		EventLog.logEvent("player " + playerID + "'s breakShot " + breakShot);
		return breakShot;
	}
	
	private boolean getFinalShot () {
		EventLog.logEvent("player " + playerID + "'s finalShot " + finalShot);
		return finalShot;
	}
	
	private boolean getBallInHand () {
		EventLog.logEvent("player " + playerID + "'s ballInHand " + ballInHand);
		return ballInHand;
	}
	
	private int getbBllsAssigned () {
		EventLog.logEvent("player " + playerID + "'s ballsAssigned " + ballsAssigned);
		return ballsAssigned;
	}
	
	private int getPlayerID () {
		EventLog.logEvent("player has playerID " + playerID);
		return playerID;
	}
	
	private int getGamesWon() {
		EventLog.logEvent("player " + playerID + "has won " + gamesWon + " games");
		return gamesWon;
	}
	
	private int getShotsTakenThisGame() {
		EventLog.logEvent("player " + playerID + "has taken " + shotsTakenThisGame + " shots this game");		
		return shotsTakenThisGame;
	}
	
	private int getShotsTakenThisSet() {
		EventLog.logEvent("player " + playerID + "has taken " + shotsTakenThisSet + " shots this set");
		return shotsTakenThisSet;
	}
	
	private int getFoulsThisGame() {
		EventLog.logEvent("player " + playerID + "has fouled " + foulsThisGame + " times this game");
		return foulsThisGame;
	}
	
	private int getFoulsThisSet() {
		EventLog.logEvent("player " + playerID + "has fouled " + foulsThisSet + " times this set");
		return foulsThisSet;
	}

	
	
	
	
	
	
	
	
}
