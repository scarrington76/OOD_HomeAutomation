package homeautomation;

public class TrainsetOnCommand implements Command {
	Trainset trainset;

	public TrainsetOnCommand(Trainset trainset) {
		this.trainset = trainset;
	}

	public void execute() {
		trainset.on();
	}
}
