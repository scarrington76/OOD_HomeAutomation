package homeautomation;

public class Trainset {
	String location;
	
	public Trainset(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println(location + " is on....Choo Choo!");
	}

	public void off() {
		System.out.println(location + " is off for the night");
	}

}
