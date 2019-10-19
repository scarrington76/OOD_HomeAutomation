package homeautomation;

public class XmasOnCommand implements Command {
	XmasLight xmaslight;

	public XmasOnCommand(XmasLight xmaslight) {
		this.xmaslight = xmaslight;
	}

	public void execute() {
		xmaslight.on();
	}

}
