Design Temperature Converter Adapter

Problem: You have a Thermometer interface that returns temperature in Celsius. 
A third-party weather sensor library provides readings in Fahrenheit through a different interface. 
Write an adapter so your application can use the Fahrenheit sensor as if it were a Celsius thermometer.

Requirements:

Target interface: Thermometer with getTemperature() returning Celsius (double)
Adaptee: FahrenheitSensor with readFahrenheit() returning Fahrenheit (double)
Adapter: converts Fahrenheit to Celsius using (F - 32) * 5/9

interface Thermometer {
    double getTemperature();  // Returns Celsius
}

class CelsiusSensor implements Thermometer {
    @Override
    public double getTemperature() {
        return 25.0;  // Simulated reading
    }
}

class FahrenheitSensor {
    public double readFahrenheit() {
        return 98.6;  // Simulated reading
    }
}

class FahrenheitSensorAdapter implements Thermometer {
    // TODO: Declare a private FahrenheitSensor field

    public FahrenheitSensorAdapter(FahrenheitSensor sensor) {
        // TODO: Store the sensor reference
    }

    @Override
    public double getTemperature() {
        // TODO: Read the Fahrenheit value from the sensor
        // TODO: Convert Fahrenheit to Celsius using (F - 32) * 5.0 / 9.0
        return 0; // TODO: Return the converted Celsius value
    }
}

public class Main {
    public static void main(String[] args) {
        Thermometer celsius = new CelsiusSensor();
        System.out.printf("Celsius sensor: %.1f C%n", celsius.getTemperature());

        // TODO: Uncomment the lines below after implementing the adapter
        // FahrenheitSensor sensor = new FahrenheitSensor();
        // Thermometer adapted = new FahrenheitSensorAdapter(sensor);
        // System.out.printf("Fahrenheit sensor (adapted): %.1f C%n", adapted.getTemperature());
    }
}