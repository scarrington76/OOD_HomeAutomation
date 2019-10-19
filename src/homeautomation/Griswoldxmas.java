package homeautomation;

public class Griswoldxmas {
	Nativityscene nativityscene;
	Trainset trainset;
	XmasLight xmaslight;
	Snowman snowman;
	Xmasmusic xmasmusic;
	
	public Griswoldxmas (Nativityscene nativityscene, Trainset trainset, XmasLight xmaslight, Snowman snowman, Xmasmusic xmasmusic) {
		this.nativityscene = nativityscene;
		this.trainset = trainset;
		this.xmaslight = xmaslight;
		this.snowman = snowman;
		this.xmasmusic = xmasmusic;
	}
	
	public void start() {
		nativityscene.on();
		trainset.on();
		xmaslight.on();
		snowman.on();
		xmasmusic.playmusic();
	}
	public void end() {
		nativityscene.off();
		trainset.off();
		xmaslight.off();
		snowman.off();
	}
}
