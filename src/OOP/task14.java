package OOP;

public class task14 {
    public static void showWeather(City city) {
        System.out.println("In the city of " + city.getName() + " today, the temperature is " + city.getTemperature());
    }

    public static void main(String[] args) {
        City city = new City("Dubai", 40);
        showWeather(city);
    }
}

class City {
    private String name;
    private int temperature;

    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }
}