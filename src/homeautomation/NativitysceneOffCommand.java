package homeautomation;

public class NativitysceneOffCommand implements Command {
	Nativityscene nativityscene;
	 
	public NativitysceneOffCommand(Nativityscene nativityscene) {
		this.nativityscene = nativityscene;
	}
 
	public void execute() {
		nativityscene.off();
	}

}
