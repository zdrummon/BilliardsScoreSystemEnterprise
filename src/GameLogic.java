
public class GameLogic {
	public GameLogic() {}
	public BallTracker ballTracker = new BallTracker();
	public Player[] playerArray = new Player[2];
	
	
	
	public void trackBalls() {
		BallTracker ballTrackerBufferObj = new BallTracker();
		ballTrackerBufferObj.createBalls();
		ballTracker = ballTrackerBufferObj;
	}
	
	public void createPlayers() {
		for(int i = 0; i < 2 ; i++) {
			Player bufferPlayer = new Player(i);
			playerArray[i] = bufferPlayer;
			}
	}
	
	
}
