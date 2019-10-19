package homeautomation;

import java.time.LocalTime;

public interface Observer {
	public void update(LocalTime sunrise, LocalTime sunset);
}
