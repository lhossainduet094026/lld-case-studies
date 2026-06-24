package facade.SmartHomeController;

public class SmartHomeFacade {

	private final SmartLightsSystem smartLightsSystem;
	private final Thermostat thermostat;
	private final SecuritySystem securitySystem;

	public SmartHomeFacade(SmartLightsSystem smartLightsSystem, Thermostat thermostat, SecuritySystem securitySystem) {
		this.smartLightsSystem = smartLightsSystem;
		this.thermostat = thermostat;
		this.securitySystem = securitySystem;
	}

	public void leaveHome() {
		System.out.println("--- Leaving Home ---");
		smartLightsSystem.off();
		thermostat.setMode("eco");
		thermostat.setTemperature(18);
		securitySystem.arm();
		System.out.println("--- Home secured ---");
	}

	public void arriveHome() {
		System.out.println("--- Come back Home ---");
		smartLightsSystem.on();
		thermostat.setMode("comfort");
		thermostat.setTemperature(20);
		securitySystem.disarm();
		System.out.println("--- Home secured ---");
	}
}
