package homeautomation;

import java.util.*;
import java.time.LocalTime;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private LocalTime sunrise;
	private LocalTime sunset;
	private LocalTime timenow = LocalTime.now();
	
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
			observer.update(sunrise, sunset);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(LocalTime sunrise, LocalTime sunset) {
		this.sunrise = sunrise;
		this.sunset = sunset;
		measurementsChanged();
	}

	public LocalTime getSunrise() {
		return sunrise;
	}
	
	public LocalTime getSunset() {
		return sunset;
	}
	
	public LocalTime getTime() {
		return timenow;
	}

}
