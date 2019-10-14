package HomeAuto;
  
public class GarageLogIterator implements Iterator {
	LogItem[] list;
	int position = 0;
 
	public GarageLogIterator(LogItem[] list) {
		this.list = list;
	}
 
	public LogItem next() {
		LogItem logitem = list[position];
		position = position + 1;
		return logitem;
	}
 
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}


}
