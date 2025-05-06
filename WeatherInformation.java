import java.util.*;

public class WeatherInformation {

    private static boolean showCelsius = true;
    private static Map<String, WeatherInfo> weatherDatabase = new HashMap<>();

    public static void main(String[] args) {
        preloadWeatherData();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Weather Information System =====");
            System.out.println("1. Search Weather by City");
            System.out.println("2. Toggle Temperature Unit (" + (showCelsius ? "Celsius" : "Fahrenheit") + ")");
            System.out.println("3. Show Current Time and Date");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter city name: ");
                    String city = scanner.nextLine().trim().toLowerCase();
                    WeatherInfo info = weatherDatabase.get(city);
                    if (info != null) {
                        System.out.println("\nWeather Info for " + info.getCity() + ":");
                        double temp = showCelsius ? info.getTemperatureCelsius() : info.getTemperatureFahrenheit();
                        String unit = showCelsius ? "°C" : "°F";
                        System.out.println("Temperature: " + temp + " " + unit);
                        System.out.println("Condition: " + info.getCondition());
                    } else {
                        System.out.println("City not found in database.");
                    }
                    break;

                case 2:
                    showCelsius = !showCelsius;
                    System.out.println("Temperature unit toggled.");
                    break;

                case 3:
                    System.out.println("Current Time and Date: " + new Date());
                    break;

                case 4:
                    System.out.println("Exiting. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void preloadWeatherData() {
        weatherDatabase.put("dhaka", new WeatherInfo("Dhaka", 32.5, "Sunny"));
        weatherDatabase.put("chittagong", new WeatherInfo("Chittagong", 30.0, "Cloudy"));
        weatherDatabase.put("sylhet", new WeatherInfo("Sylhet", 29.0, "Rainy"));
        weatherDatabase.put("rajshahi", new WeatherInfo("Rajshahi", 35.2, "Hot"));
        weatherDatabase.put("london", new WeatherInfo("London", 15.2, "Rainy"));
    }
}
