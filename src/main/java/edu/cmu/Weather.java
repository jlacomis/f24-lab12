package edu.cmu;

/**
 * The Weather class provides methods to interact with a weather service and retrieve weather data
 * such as rainfall, temperature, humidity, and wind speed in the preferred scales.
 * 
 * <p>This class allows setting the preferred scales for length (inches or millimeters) and 
 * temperature (Fahrenheit or Celsius). It uses a WeatherService instance to fetch the actual 
 * weather data.</p>
 * 
 * <p>Usage example:</p>
 * <pre>
 * {@code
 * Weather weather = new Weather();
 * weather.setWeatherService(new WeatherService());
 * weather.setScale(true); // Set to inches
 * weather.setTemperatureScale(true); // Set to Fahrenheit
 * double rainfall = weather.getRainfall();
 * double windSpeed = weather.returnWindSpeed();
 * }
 * </pre>
 * 
 * @see WeatherService
 */
public class Weather {
    private WeatherService weatherService;
    private boolean inches;
    public enum Speed {
        MPH,
        KPH
    }
    private Speed speed;
    
    /**
     * Sets the weather service to be used by this instance.
     *
     * @param weatherService the WeatherService instance to set
     */
    public void setWeatherService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    /**
     * Sets the length scale for rainfall.
     *
     * @param inches if true, sets the scale to inches; if false, sets the scale to centimeters.
     */
    public void setScale(boolean inches) {
        this.inches = inches;
    }

    /**
     * Sets the speed scale for windspeed.
     *
     * @param speed the Speed object representing the new speed to be set
     */
    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    /**
     * Retrieves the rainfall measurement over the last 24 hours from the weather service.
     * 
     * @return the rainfall amount. If the measurement is in inches, it returns the value as is.
     *         If the measurement is not in inches, it converts the value to millimeters.
     */
    public double getRainfall() {
        double wsRainfall = weatherService.getRainfall();
        if (inches) {
            return wsRainfall / 25.4;
        } else {
            return wsRainfall;
        }
    }

    /**
     * Retrieves the wind speed from the weather service.
     *
     * @return the wind speed in the appropriate unit (MPH or KPH)
     */
    public double returnWindSpeed() {
        double wsWindSpeed = weatherService.getWindSpeed();
        if (speed == Speed.MPH) {
            return wsWindSpeed * 0.621371;
        } else {
            return wsWindSpeed;
        }
    }
}
