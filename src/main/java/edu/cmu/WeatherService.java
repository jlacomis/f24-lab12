package edu.cmu;

/**
 * The WeatherService interface provides methods to interact with a weather server
 * and retrieve various weather-related data such as rainfall, temperature, humidity,
 * and wind speed.
 */
public interface WeatherService {
    /**
     * Sets the server address for the weather service.
     *
     * @param url the URL of the server to set
     */
    public void setServerAddress(String url);

    /**
     * Retrieves the rainfall over the past 24 hours.
     *
     * @return the amount of rainfall in millimeters.
     */
    public double getRainfall();
    
    /**
     * Retrieves the current temperature in Celsius.
     *
     * @return the current temperature as a double.
     */
    public double getTemperature();
    
    /**
     * Retrieves the current wind speed.
     *
     * @return the wind speed in kilometers per hour (km/h)
     */
    public int getWindSpeed();    
}
