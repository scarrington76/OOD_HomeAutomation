package HomeAuto;

import java.awt.Label;
import java.sql.Time;
import java.time.LocalTime;

public interface Observer {
	public void update(Time sunrise, Time sunset, Label timenow);
}
