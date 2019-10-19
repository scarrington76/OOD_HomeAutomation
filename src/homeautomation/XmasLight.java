package homeautomation;

public class XmasLight {
	String location = "";

	public XmasLight(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " light is on");
	}

	public void off() {
		System.out.println(location + " light is off");
	}

}
