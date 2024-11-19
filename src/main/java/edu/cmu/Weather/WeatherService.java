package edu.cmu.Weather;

public interface WeatherService {
    /**
     * Retrieves the rainfall over the past 24 hours.
     *
     * @return the amount of rainfall in millimeters.
     */
    public double getRainfall();
}
