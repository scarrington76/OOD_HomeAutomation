package homeautomation;

public class TrainsetOffCommand implements Command {
	Trainset trainset;
	 
	public TrainsetOffCommand(Trainset trainset) {
		this.trainset = trainset;
	}
 
	public void execute() {
		trainset.off();
	}

}
