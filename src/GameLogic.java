
public class GameLogic {
	public GameLogic() {}
	public BallTracker ballTracker = new BallTracker();
	
	public void trackBalls() {
		BallTracker ballTrackerBufferObj = new BallTracker();
		ballTrackerBufferObj.createBalls();
		ballTracker = ballTrackerBufferObj;
	}
	
	
}
