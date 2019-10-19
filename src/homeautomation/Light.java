package homeautomation;

import java.time.LocalTime;
import java.util.ArrayList;

public class Light {
	String location;
	ArrayList<String> lightloglist = new ArrayList<String>();
	String state = "Off";

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " light is on");
		state = "On";
		log(state);
	}

	public void off() {
		System.out.println(location + " light is off");
		state = "Off";
		log(state);
	}
	
	public void log(String state) {
		lightloglist.add(location + " change to " + state + " at " + LocalTime.now());
	}
	public void printlog() {
		System.out.println(lightloglist.toString());
	}
	
	public Iterator createIterator() {
		return new LightLogIterator(lightloglist);
	}
}
