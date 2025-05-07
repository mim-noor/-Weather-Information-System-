import java.util.*;

public class WeatherDatabase {
    private static final Map<String, List<WeatherInfo>> weatherData = new HashMap<>();

    static {
        String[] cities = {"Dhaka", "Chittagong", "Sylhet"};
        for (String city : cities) {
            List<WeatherInfo> forecast = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                String date = java.time.LocalDate.now().plusDays(i).toString();
                double temp = 25 + Math.random() * 10;
                String condition = i % 2 == 0 ? "Sunny" : "Rainy";
                forecast.add(new WeatherInfo(date, city, temp, condition));
            }
            weatherData.put(city.toLowerCase(), forecast);
        }
    }

    public static List<WeatherInfo> getForecast(String city) {
        return weatherData.getOrDefault(city.toLowerCase(), new ArrayList<>());
    }
}
