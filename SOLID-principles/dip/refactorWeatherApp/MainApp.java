package dip.refactorWeatherApp;

public class MainApp {

	public static void main(String[] args) {

		System.out.println("--- OpenWeatherMap ---");
		WeatherApp app1 = new WeatherApp(new OpenWeatherMapProvider());
		app1.displayWeather("London");

		System.out.println();
		System.out.println("--- WeatherStack ---");
		WeatherApp app2 = new WeatherApp(new WeatherStackProvider());
		app2.displayWeather("London");

	}

}
