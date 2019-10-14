package HomeAuto;

import java.util.ArrayList;

public class LightLogIterator implements Iterator {
	ArrayList list;
	int position = 0;
 
	public LightLogIterator(ArrayList list) {
		this.list = list;
	}

	public Object next() {
		Object logItem = list.get(position);
		position = position + 1;
		return logItem;
	}
 
	public boolean hasNext() {
		if (position >= list.size() || list.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}

}
