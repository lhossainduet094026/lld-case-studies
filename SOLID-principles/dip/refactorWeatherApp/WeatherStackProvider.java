package dip.refactorWeatherApp;

public class WeatherStackProvider implements WeatherProvider {

	@Override
	public String getWeather(String city) {
		System.out.println("Calling OpenWeatherStack API for: " + city);
		// Simulated API response
		return "Sunny, 25C";
	}

}
