package homeautomation;


public class LogReader {
	GarageDoor garagelog;
	Light lightlog;
	
	public LogReader (GarageDoor garagelog, Light lightlog) {
		this.garagelog = garagelog;
		this.lightlog = lightlog;
	}
	
	public void printLog() {
		Iterator garageIterator = garagelog.createIterator();
		Iterator lightIterator = lightlog.createIterator();
		System.out.println("Garage Log:");
		printLog (garageIterator);
		System.out.println("Light Log:");
		printLog (lightIterator);
	}
	
	private void printLog (Iterator iterator) {
		while (iterator.hasNext()) {
			LogItem logitem = (LogItem)iterator.next();
			System.out.println(logitem.getItem());
		}

	}

}
