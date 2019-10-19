package homeautomation;

public class XmasOffCommand implements Command {
	XmasLight xmaslight;
	 
	public XmasOffCommand(XmasLight xmaslight) {
		this.xmaslight = xmaslight;
	}
 
	public void execute() {
		xmaslight.off();
	}
}
