
public class GameLogic {
	public GameLogic() {}

	 
	
	
	public static void delayTimer(int timeDelay) {
		
		try {
			EventLog.logEvent("delay " + timeDelay + "ms");	
			Thread.sleep(timeDelay);
			
		} catch (InterruptedException exception) {
			EventLog.logEvent("delay " + timeDelay + "ms");	
			exception.printStackTrace();
			Thread.currentThread().interrupt();
		}
		
	}
}
