import java.text.SimpleDateFormat;
import java.util.Date;

public class EventLog {

	public static Date logDate;
	private static SimpleDateFormat dateFormatter = new SimpleDateFormat("yy-MM-dd '/' hh:mm:ss a");

	private static String programVersion = "Billiard Score System - Enterprise v6";
	private static int logCounter = 0;
	
	public EventLog() {}
	
	//formats initial log output and header
	public static void startLog() {
		
		System.out.println(programVersion + "\n                 TIME  |  EVENT  |  LOG ITEM");
		EventLog.logEvent("start program");	
	}
	
	//enters an item into the console log
	public static void logEvent(String logItem) {
		
		String logCounterString = String.format(" | % 7d | ", ++logCounter);
		System.out.println(dateFormatter.format(EventLog.logDate = new Date()) + logCounterString + logItem);
	}
	
	//formats final log output and footer
	public static void endLog() {
		
		EventLog.logEvent("end program");	
		System.out.println("                 TIME  |  EVENT  |  LOG ITEM");
	}
}