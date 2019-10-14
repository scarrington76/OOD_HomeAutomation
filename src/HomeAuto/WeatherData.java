package HomeAuto;

import java.util.*;
import java.sql.Time;
import java.time.LocalTime;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private Time sunrise;
	private Time sunset;
	private LocalTime time = LocalTime.now();
	
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
			observer.update(sunrise, sunset, time);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(Time sunrise, Time sunset, LocalTime time) {
		this.sunrise = sunrise;
		this.sunset = sunset;
		this.time = time;
		measurementsChanged();
	}

	public Time getSunrise() {
		return sunrise;
	}
	
	public Time getSunset() {
		return sunset;
	}
	
	public LocalTime getTime() {
		return time;
	}

}
