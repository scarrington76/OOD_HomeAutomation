package HomeAuto;

import java.sql.Time;
import java.time.LocalTime;

public interface Observer {
	public void update(Time sunrise, Time sunset, LocalTime time);
}
