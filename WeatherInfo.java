public class WeatherInfo {
    private String date;
    private String city;
    private double temperatureCelsius;
    private String weatherCondition;

    public WeatherInfo(String date, String city, double temperatureCelsius, String weatherCondition) {
        this.date = date;
        this.city = city;
        this.temperatureCelsius = temperatureCelsius;
        this.weatherCondition = weatherCondition;
    }

    public String getDate() {
        return date;
    }

    public String getCity() {
        return city;
    }

    public double getTemperature(boolean inCelsius) {
        if (inCelsius) {
            return temperatureCelsius;
        } else {
            return (temperatureCelsius * 9 / 5) + 32;
        }
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }
}