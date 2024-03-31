
package com.IlegalArgumentExample;

public class illegalarArguments {
    public static double convertCelsiusToFahrenheit(double celsiusTemperature) {
        if (celsiusTemperature < -273.15) {
            throw new illegalarArgumentsException("Temperature below absolute zero is not valid.");
        }

        return (celsiusTemperature * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        try {
            double celsiusTemperature = -300;  // Example: Invalid temperature below absolute zero
            double fahrenheitTemperature = convertCelsiusToFahrenheit(celsiusTemperature);
            System.out.println("Converted Temperature: " + fahrenheitTemperature + " °F");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
