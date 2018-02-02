public class CoreLogic {
	public CoreLogic() {}
	public Game[] game = new Game[10];
	public Player[] player = new Player[2];
	public Ball[] ball = new Ball[16];
	public int turn = 1;	
	
	//create an object for each game
	public void createGames() {
		for(int i = 0; i < 10 ; i++) {
			Game bufferGame = new Game(i);
			game[i] = bufferGame;		
		}
	}
	
	//create an object for each player
	public void createPlayers() {
		for(int i = 0; i < 2 ; i++) {
			Player bufferPlayer = new Player(i);
			player[i] = bufferPlayer;
			//TODO load players data from long term memoruuuuu		
		}
	}
			
	//create an object for each ball
	public void createBalls() {
		for(int i = 0; i < 16; i++) {
			Ball bufferBall = new Ball(i, 0, false, false); 
			ball[i] = bufferBall;
		}
	}
	
	
	
	
	
	
	
	
	public void switchTurn() {			

		if (turn == 0) {
			turn++;
			EventLog.logEvent("switch turn to player " + (turn + 1));
		} else {
			turn--;
			EventLog.logEvent("switch turn to player " + (turn + 1));
		}
	}
	
	public void takeAnotherShot( ) {
		EventLog.logEvent("player " + (turn + 1) + " take another shot");
	}
	
	public void scratchShot() {
		EventLog.logEvent("player " + (turn + 1) + " scratched the shot");
		switchTurn();
	}
	
	public void confirmShot() {
		
	}
	
	public void resetGame() {
		
	}
	
	public void resetSet() {
		
	}
	

}
