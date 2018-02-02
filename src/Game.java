public class Game {
	public Game(int oGameIndex) {
		gameIndex = oGameIndex;
	}
	
	private int gameIndex;
	
	//SETTERS
	public void setGameIndex(int sGameIndex) {
		EventLog.logEvent("gameIndex set to " + sGameIndex);
		gameIndex = sGameIndex;
	}
	
	//GETTERS
	public int getGameIndex() { return gameIndex; }
	
	/*---TODO data
	int gamesWon;
	int shotsTakenThisGame;
	int shotsTakenThisSet;
	int foulsThisGame;
	int foulsThisSet;
	
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
}