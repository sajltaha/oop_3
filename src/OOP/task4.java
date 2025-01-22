package OOP;

public class task4 {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public task4(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public task4(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Orange";
    }

    public task4(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "Orange";
    }

    public static void main(String[] args) {
        task4 car1 = new task4("Aventador", 2022, "Red");
        task4 car2 = new task4("Huracan", 2021);
        task4 car3 = new task4("Gallardo");

        System.out.println(car1.manufacturer + " " + car1.model + " " + car1.year + " " + car1.color);
        System.out.println(car2.manufacturer + " " + car2.model + " " + car2.year + " " + car2.color);
        System.out.println(car3.manufacturer + " " + car3.model + " " + car3.year + " " + car3.color);
    }
}
