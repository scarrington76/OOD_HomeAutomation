package HomeAuto;

import java.util.*;
import java.awt.Label;
import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private Time sunrise;
	private Time sunset;
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
	private Label timenow = new Label(LocalTime.now().format(dtf));
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(sunrise, sunset, timenow);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(Time sunrise, Time sunset) {
		this.sunrise = sunrise;
		this.sunset = sunset;
		measurementsChanged();
	}

	public Time getSunrise() {
		return sunrise;
	}
	
	public Time getSunset() {
		return sunset;
	}
	
	public Label getTime() {
		return timenow;
	}

}
