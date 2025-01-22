package Interfaces;

public class task12 {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }
    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type;
        }

        public String getWeatherType() {
            return type;
        }

        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }
    }

    interface Weather {
        String getWeatherType();
    }

    interface WeatherType {
        String CLOUDY = "Cloudy";
        String FOGGY = "Foggy";
        String FREEZING = "Freezing";
    }
}
