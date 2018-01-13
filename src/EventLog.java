import java.util.Date;

public class EventLog {
	
	public static String programVersion = "Billiard Score System - Enterprise v6";
	static int logCounter = 0;
	static Date logDate = new Date();
	
	public EventLog() {
		System.out.println(programVersion);
		System.out.println("          EVENT TIME        |EVENT COUNT|LOG ITEM");
	}
	
	public void logEvent(String logThisEvent) {
		logDate = new Date();
		String logCounterString = String.format("| % 10d|", ++logCounter);
		System.out.println(logDate.toString() + logCounterString + logThisEvent + " ");
	}
}