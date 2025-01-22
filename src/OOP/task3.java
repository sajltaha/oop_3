package OOP;

public class task3 {
    private int floorsCount;
    private String developer;

    public task3() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
        System.out.println("Skyscraper is built with " + floorsCount + " floors by " + developer + ".");
    }

    public task3(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
        System.out.println("Skyscraper is built with " + floorsCount + " floors by " + developer + ".");
    }

    public static void main(String[] args) {
        task3 skyscraper = new task3();
        task3 skyscraperUnknown = new task3(50, "Unknown");
    }
}
