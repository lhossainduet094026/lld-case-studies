package facade.SmartHomeController;

public class Thermostat {

	private String mode;

	public void setTemperature(int degrees) {
		System.out.println("Thermostat: Mode set to " + mode + ". Temperature set to " + degrees + "C.");
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
}
