package HomeAuto;

import java.time.LocalTime;
import java.util.ArrayList;

public class LightLog {
	ArrayList lightlogitems;
 
	public LightLog() {
		lightlogitems = new ArrayList<LogItem>();
    
		addItem("Light", 
			"Kitchen", 
			LocalTime.of(6, 30));
 
	}

	public void addItem(String device, String location,
	                    LocalTime loggedtime)
	{
		LogItem logitem = new LogItem(device, location, loggedtime);
		lightlogitems.add(logitem);
	}
 
	public ArrayList<LogItem> getMenuItems() {
		return lightlogitems;
	}
	
}
