public class WeatherInfo {
    private String city;
    private double temperatureCelsius;
    private String condition;

    public WeatherInfo(String city, double temperatureCelsius, String condition) {
        this.city = city;
        this.temperatureCelsius = temperatureCelsius;
        this.condition = condition;
    }

    public String getCity() {
        return city;
    }

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public double getTemperatureFahrenheit() {
        return (temperatureCelsius * 9 / 5) + 32;
    }

    public String getCondition() {
        return condition;
    }
}
