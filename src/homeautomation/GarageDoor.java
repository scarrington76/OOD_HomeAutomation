package homeautomation;
import java.time.LocalTime;
import java.util.Scanner;

public class GarageDoor {
	String location;
	LocalTime current_time = LocalTime.now();
	static final int MAX_LINES = 1000;
	int numberOfLines = 0;
	String[] logitems;
	String state = "closed";

	public GarageDoor(String location) {
		this.location = location;
	}

	public void up() {
		System.out.println(location + " is opening up");
		state = "open";
	}

	public void down() {
		System.out.println(location + " is closing");
		state = "down";
		printlog();
	}
	
	public void addItem(String location, String state) {
		String entry = location + " changed to " + state + " at " + LocalTime.now();
		
		if (numberOfLines >= MAX_LINES) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Sorry, the log is full - Do you want to clear the log? Enter Y or N: ");
			String response = sc.nextLine();
			if (response.equalsIgnoreCase("Y")) {
					logitems = null;
					}
				} 
		else {
			logitems[numberOfLines] = entry;
			numberOfLines = numberOfLines + 1;
			}
	}
	
	public void printlog() {
		System.out.println(logitems);
	}
	
	public Iterator createIterator() {
		return new GarageLogIterator(logitems);
	}

}
