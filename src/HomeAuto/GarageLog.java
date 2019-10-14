package HomeAuto;

import java.time.LocalTime;
import java.util.Scanner;

public class GarageLog {
	static final int MAX_LINES = 200;
	int numberOfLines = 0;
	LogItem[] logitems;
  
	public GarageLog() {
		logitems = new LogItem[MAX_LINES];
 
		addItem("Lamp",
			"Kitchen", LocalTime.of(1, 30) );
	}
  
	public void addItem(String device, String location, 
	                     LocalTime loggedtime) 
	{
		LogItem logitem = new LogItem(device, location, loggedtime);
		Scanner input = new Scanner(System.in);
		if (numberOfLines >= MAX_LINES) {
			System.err.println("Sorry, the log is full - Do you want to clear the log? Enter Y or N: ");
			String response = input.next();
			if (response.equalsIgnoreCase("Y")) {
					logitems = null;
			}
		} else {
			logitems[numberOfLines] = logitem;
			numberOfLines = numberOfLines + 1;
		}
	}
 
	public LogItem[] getLogItems() {
		return logitems;
	}

}
