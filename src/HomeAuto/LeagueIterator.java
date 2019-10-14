package HomeAuto;

 
import java.util.Iterator;
  
public class LeagueIterator implements Iterator<Team> {
	Team[] list;
	int position = 0;
 
	public LeagueIterator(Team[] list) {
		this.list = list;
	}
 
	public Team next() {
		Team team = list[position];
		position = position + 1;
		return team;
	}
 
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
 
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove an team until you've done at least one next()");
		}
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}

}
