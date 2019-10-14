package HomeAuto;

import java.time.LocalTime;

public class LogItem {
	String device;
	String location;
	LocalTime loggedtime;
 
	public LogItem(String device, 
	                String location, 
	                LocalTime loggedtime) 
	{
		this.device = device;
		this.location = location;
		this.loggedtime = loggedtime;
	}
  
	public String getDevice() {
		return device;
	}
  
	public String getLocation() {
		return location;
	}
	public LocalTime getLoggedTime() {
		return loggedtime;
	}
  
}
