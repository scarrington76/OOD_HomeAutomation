package HomeAuto;

public interface Command {
	public void execute();
	public void undo();
	public void log();
}

