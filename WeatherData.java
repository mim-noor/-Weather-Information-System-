import java.util.*;

class WeatherData {
    private String city;
    private double temperatureCelsius;
    private String condition;

    public WeatherData(String city, double temperatureCelsius, String condition) {
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

class WeatherData {
    private Map<String, WeatherData> weatherMap;

    public WeatherDatabase() {
        weatherMap = new HashMap<>();
        loadDummyData();
    }

    private void loadDummyData() {
        weatherMap.put("Dhaka", new WeatherData("Dhaka", 32.5, "Sunny"));
        weatherMap.put("Chittagong", new WeatherData("Chittagong", 30.0, "Cloudy"));
        weatherMap.put("London", new WeatherData("London", 15.2, "Rainy"));
        weatherMap.put("New York", new WeatherData("New York", 18.4, "Clear"));
    }

    public WeatherData getWeatherByCity(String city) {
        return weatherMap.getOrDefault(city, null);
    }
}

class TimeUtil {
    public static String getCurrentTimeAndDate() {
        Date now = new Date();
        return now.toString();
    }
}

public class WeatherData {
    private static boolean showCelsius = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherDatabase db = new WeatherDatabase();

        while (true) {
            System.out.println("\n=== Weather Information System ===");
            System.out.println("1. Search Weather by City");
            System.out.println("2. Toggle Temperature Unit (" + (showCelsius ? "Celsius" : "Fahrenheit") + ")");
            System.out.println("3. Show Current Time and Date");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter city name: ");
                    String city = scanner.nextLine();
                    WeatherData data = db.getWeatherByCity(city);
                    if (data != null) {
                        System.out.println("Weather for: " + data.getCity());
                        if (showCelsius) {
                            System.out.println("Temperature: " + data.getTemperatureCelsius() + " °C");
                        } else {
                            System.out.println("Temperature: " + data.getTemperatureFahrenheit() + " °F");
                        }
                        System.out.println("Condition: " + data.getCondition());
                    } else {
                        System.out.println("City not found.");
                    }
                    break;
                case 2:
                    showCelsius = !showCelsius;
                    System.out.println("Temperature unit toggled.");
                    break;
                case 3:
                    System.out.println("Current Time and Date: " + TimeUtil.getCurrentTimeAndDate());
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}