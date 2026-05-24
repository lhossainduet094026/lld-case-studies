package composition.computerSystem;

public class ComputerSystemApp {

	public static void main(String[] args) {

		Computer pc = new Computer("Dev Workstation", "Intel i7-13700K", 16, 32, 1000);

		pc.describeSpecs();
	}

}
