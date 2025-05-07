public class DetailedWeatherInfo extends WeatherInfo {

    public DetailedWeatherInfo(String date, String city, double temperatureCelsius, String weatherCondition) {
        super(date, city, temperatureCelsius, weatherCondition);
    }

    public void displayWeather(boolean inCelsius) {
        double temp = getTemperature(inCelsius);
        String tempUnit = inCelsius ? "C" : "F";
        System.out.printf("Date: %s | Temp: %.2f%s | Condition: %s%n",
                getDate(), temp, tempUnit, getWeatherCondition());
    }
}

