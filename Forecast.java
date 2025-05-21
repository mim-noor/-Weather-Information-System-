public class Forecast {
    private String date;
    private double maxTemp;
    private double minTemp;
    private String condition;

    public Forecast(String date, double maxTemp, double minTemp, String condition) {
        this.date = date;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.condition = condition;
    }

    public void displayForecast(boolean inCelsius) {
        String unit = inCelsius ? "°C" : "°F";
        System.out.println(date + " → " + condition +
                           " | Max: " + maxTemp + unit +
                           ", Min: " + minTemp + unit);
    }
}



