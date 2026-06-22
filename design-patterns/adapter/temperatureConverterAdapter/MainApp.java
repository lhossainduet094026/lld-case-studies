package adapter.temperatureConverterAdapter;

public class MainApp {

	public static void main(String[] args) {
		Thermometer celsius = new CelsiusSensor();
		System.out.printf("Celsius sensor: %.1f C%n", celsius.getTemperature());

//         TODO: Uncomment the lines below after implementing the adapter
		FahrenheitSensor sensor = new FahrenheitSensor();
		Thermometer adapted = new FahrenheitSensorAdapter(sensor);
		System.out.printf("Fahrenheit sensor (adapted): %.1f C%n", adapted.getTemperature());
	}
}
