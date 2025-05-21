public class CurrentWeather extends WeatherData {
    private double temperature;
    private double feelsLike;
    private double windKph;
    private int humidity;
    private boolean inCelsius;

    public CurrentWeather(String country, String city, String localTime, String condition,
                          double temperature, double feelsLike, double windKph,
                          int humidity, boolean inCelsius) {
        super(country, city, localTime, condition);
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.windKph = windKph;
        this.humidity = humidity;
        this.inCelsius = inCelsius;
    }

    public void displayCurrent() {
        displayBasicInfo();
        String unit = inCelsius ? "°C" : "°F";
        System.out.println("Temperature : " + temperature + unit);
        System.out.println("Feels Like  : " + feelsLike + unit);
        System.out.println("Wind (kph)  : " + windKph);
        System.out.println("Humidity    : " + humidity + "%");
    }
}







