package HomeAuto;

import java.sql.Time;
import java.time.LocalTime;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private Time sunrise;
	private Time sunset;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(Time sunrise, Time sunset, LocalTime time) {
		this.sunrise = sunrise;
		this.sunset = sunset;
		display();
	}
	
	public void display() {
		System.out.println("Today's sunrise is : " + sunrise + "\nToday's sunset is : " + sunset);
	}
}
