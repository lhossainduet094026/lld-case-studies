package facade.SmartHomeController;

public class MainApp {

	public static void main(String[] args) {

		SmartLightsSystem lights = new SmartLightsSystem();
		Thermostat thermostat = new Thermostat();
		SecuritySystem security = new SecuritySystem();

		SmartHomeFacade home = new SmartHomeFacade(lights, thermostat, security);
		home.leaveHome();
		System.out.println();
		home.arriveHome();
	}

}
