Refactor WeatherApp

Problem: A WeatherApp directly calls OpenWeatherMapAPI to fetch weather data. 
If you want to switch to a different weather API (like WeatherStack or a local mock for testing), 
you would have to modify WeatherApp. Refactor by introducing a WeatherProvider interface 
so the app can work with any weather data source.

Requirements:

Create a WeatherProvider interface with a getWeather(city) method
Create OpenWeatherMapProvider that implements the interface (wrapping the API call)
Create WeatherStackProvider as a second implementation that returns different simulated data
Refactor WeatherApp to accept a WeatherProvider through its constructor
Show the app working with both providers without changing WeatherApp

// Before: WeatherApp is tightly coupled to OpenWeatherMapAPI
class OpenWeatherMapAPI {
    public String fetchWeather(String city) {
        System.out.println("Calling OpenWeatherMap API for: " + city);
        // Simulated API response
        return "Sunny, 25C";
    }
}

class WeatherApp {
    private OpenWeatherMapAPI api;

    public WeatherApp() {
        this.api = new OpenWeatherMapAPI(); // Direct dependency!
    }

    public void displayWeather(String city) {
        String weather = api.fetchWeather(city);
        System.out.println("Weather in " + city + ": " + weather);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        WeatherApp app = new WeatherApp();
        app.displayWeather("London");
    }
}

// TODO: Create a WeatherProvider interface with a getWeather(city) method.
// TODO: Make OpenWeatherMapProvider implement the interface.
// TODO: Refactor WeatherApp to accept a WeatherProvider via its constructor.