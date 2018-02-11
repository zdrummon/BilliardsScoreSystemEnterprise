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
		if (turn == 1) {
			EventLog.logEvent("switch turn to player " + ++turn);
		} else {
			EventLog.logEvent("switch turn to player " + --turn);
		}
	}
	
	public void takeAnotherShot( ) {
		EventLog.logEvent("player " + turn + " take another shot");
	}
	
	public void scratchShot() {
		EventLog.logEvent("player " + turn + " scratched the shot");
		switchTurn();
	}
	
	//TODO make a game
	public void confirmShot() {
	
		//TODO breakshot scenarios - 8 ball in - lose
		//TODO breakshot scenarios - balls went in - another shot
		//TODO breakshot scenarios - cue ball in - switch turn
		//TODO breakshot scenarios - no balls went in - switch turn
				
		//TODO 
		//TODO 
		//TODO 
		//TODO 
		//TODO 
		
		
		
		if (GameWindow.coreLogic.ball[0].getBallToggled()) {
			scratchShot();
		}
		
		for(int i = 0; i < 16; i++) {
			GameWindow.coreLogic.ball[i].setBallToggled(false);
			GameSceneGUI.ToggleButtonArray[i].isPressed = false;
			GameSceneGUI.ToggleButtonArray[i].setStyle("-fx-background-color: #0f770f");
		}
	}
	
	public void foul() {
		switchTurn();
	}
	
	public void resetGame() {
		
	}
	
	public void resetSet() {
		
	}
	
	public void forfeit() {
		EventLog.logEvent("close game");
		GameWindow.stage.close();
	}
}
