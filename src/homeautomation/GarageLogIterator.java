package homeautomation;

public class GarageLogIterator implements Iterator {
	String[] list;
	int position = 0;
 
	public GarageLogIterator(String[] logitems) {
		this.list = logitems;
	}
 
	public String next() {
		String logitem = list[position];
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
