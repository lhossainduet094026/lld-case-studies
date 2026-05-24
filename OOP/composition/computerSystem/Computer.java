package composition.computerSystem;

public class Computer {

	private CPU cpu;
	private RAM ram;
	private HardDrive hardDrive;
	private String computerName;

	public Computer(String name, String cpuModel, int cpuCoreCount, int ramSize, int hardDriveCapacity) {
		this.computerName = name;
		this.cpu = new CPU(cpuModel, cpuCoreCount);
		this.ram = new RAM(ramSize);
		this.hardDrive = new HardDrive(hardDriveCapacity);
	}

	public void describeSpecs() {
		ram.describe();
		cpu.describe();
		hardDrive.describe();
	}
}
