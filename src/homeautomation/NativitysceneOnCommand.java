package homeautomation;

public class NativitysceneOnCommand implements Command {
	Nativityscene nativityscene;

	public NativitysceneOnCommand(Nativityscene nativityscene) {
		this.nativityscene = nativityscene;
	}

	public void execute() {
		nativityscene.on();
	}

}
