import java.util.*;

public class WeatherSystem {
    private static boolean useCelsius = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Weather Information System");
        System.out.print("Enter city name: ");
        String city = scanner.nextLine();

        System.out.print("Show temperature in Celsius or Fahrenheit (C/F)? ");
        String unit = scanner.nextLine();
        useCelsius = unit.equalsIgnoreCase("C");

        List<WeatherInfo> forecast = WeatherDatabase.getForecast(city);

        if (forecast.isEmpty()) {
            System.out.println("No weather data found for " + city);
        } else {
            System.out.println("\n5-Day Weather Forecast for " + city);
            for (WeatherInfo info : forecast) {
                double temp = info.getTemperature(useCelsius);
                String tempUnit = useCelsius ? "C" : "F";
                System.out.printf("Date: %s | Temp: %.2f%s | Condition: %s%n",
                        info.getDate(), temp, tempUnit, info.getWeatherCondition());
            }
        }

        // Show current time and date
        System.out.println("\nCurrent Time and Date: " + java.time.LocalDateTime.now());
    }
}