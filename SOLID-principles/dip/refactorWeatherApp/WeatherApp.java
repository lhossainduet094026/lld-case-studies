package dip.refactorWeatherApp;

public class WeatherApp {

	private final WeatherProvider weatherProvider;

	public WeatherApp(WeatherProvider weatherProvider) {
		this.weatherProvider = weatherProvider;
	}

	public void displayWeather(String city) {
		String weather = weatherProvider.getWeather(city);
		System.out.println("Weather in " + city + ": " + weather);
	}
}
