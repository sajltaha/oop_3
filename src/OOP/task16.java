package OOP;

public class task16 {
    public static void main(String[] args) {
        Car car = new Car();
        car.initialize("Tesla Model S", 2023, "Red");
    }
}

class Car {
    private String model;
    private int year;
    private String color;

    public void initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
}