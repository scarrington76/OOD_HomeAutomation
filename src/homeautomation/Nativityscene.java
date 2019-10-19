package homeautomation;

public class Nativityscene {
	String location = "";

	public Nativityscene(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " is shining bright in the yard right now");
	}

	public void off() {
		System.out.println(location + " is now turning off");
	}
}
