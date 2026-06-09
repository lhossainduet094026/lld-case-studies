package dip.refactorWeatherApp;

public class OpenWeatherMapProvider implements WeatherProvider {

	@Override
	public String getWeather(String city) {

		System.out.println("Calling OpenWeatherMap API for: " + city);
		// Simulated API response
		return "Sunny, 25C";
	}

}
