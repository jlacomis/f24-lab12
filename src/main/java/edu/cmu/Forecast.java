package edu.cmu;

/**
 * The Forecast interface provides methods to retrieve weather forecasts for various time periods.
 * Implementations of this interface should provide the actual logic to fetch and return weather data.
 */
public interface Forecast {
    /**
     * Retrieves the weather forecast for the next hour.
     *
     * @return a Weather object representing the forecasted weather conditions for the next hour.
     */
    public Weather getForecastNextHour();

    /**
     * Retrieves the weather forecast for the next day.
     *
     * @return a Weather object representing the forecast for the next day.
     */
    public Weather getForecastNextDay();

    /**
     * Retrieves the weather forecast for the next week.
     *
     * @return an array of Weather objects representing the forecast for each day of the next week.
     */
    public Weather[] getForecastNextWeek();
}