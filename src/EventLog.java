import java.util.Date;

public class EventLog {
	
	public static String programVersion = "Billiard Score System - Enterprise v6";
	private static int logCounter = 0;
	private Date logDate = new Date();
	
	public EventLog() {}
	
	public void logEvent(String logThisEvent) {
		logDate = new Date();
		String logCounterString = String.format("| % 10d|", ++logCounter);
		System.out.println(logDate.toString() + logCounterString + logThisEvent + " ");
	}
}