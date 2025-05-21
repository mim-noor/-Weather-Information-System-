public class WeatherData {
    protected String country;
    protected String city;
    protected String localTime;
    protected String condition;

    public WeatherData(String country, String city, String localTime, String condition) {
        this.country = country;
        this.city = city;
        this.localTime = localTime;
        this.condition = condition;
    }

    public void displayBasicInfo() {
        System.out.println("Country     : " + country);
        System.out.println("City        : " + city);
        System.out.println("Local Time  : " + localTime);
        System.out.println("Condition   : " + condition);
    }
}

