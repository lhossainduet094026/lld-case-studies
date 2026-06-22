package adapter.temperatureConverterAdapter;

public class FahrenheitSensorAdapter implements Thermometer {

	private final FahrenheitSensor fahrenheitSensorAdapter;

	public FahrenheitSensorAdapter(FahrenheitSensor fahrenheitSensorAdapter) {
		this.fahrenheitSensorAdapter = fahrenheitSensorAdapter;
	}

	@Override
	public double getTemperature() {

		double fahrenheit = fahrenheitSensorAdapter.readFahrenheit();

		return ((fahrenheit - 32) * 5) / 9;
	}
}
