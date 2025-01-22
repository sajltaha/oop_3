package OOP;

public class task5 {
    private String type;

    public void initialize(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        task5 building = new task5();

        building.initialize("Restaurant");

        building.initialize("Barbershop");

        System.out.println("Building type: " + building.type);
    }
}
