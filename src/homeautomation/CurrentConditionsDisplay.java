package homeautomation;

import java.awt.Label;
import java.sql.Time;
import java.time.LocalTime;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private LocalTime sunrise;
	private LocalTime sunset;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(LocalTime sunrise, LocalTime sunset) {
		this.sunrise = sunrise;
		this.sunset = sunset;
		display();
	}
	
	public void display() {
		System.out.println("Today's sunrise is : " + sunrise + "\nToday's sunset is : " + sunset);
	}

}
