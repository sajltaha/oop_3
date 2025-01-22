package OOP;

public class task10 {
    private String model;
    private int year;

    public task10(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }

    public static void main(String[] args) {
        task10 lamborghini = new task10("Lamborghini", 2020);
        task10 lamborghini1 = new task10("Lamborghini", 2020);
        task10 ferrari = new task10("Ferrari", 2020);
        task10 ferrari1 = new task10("Ferrari", 2020);
        task10 bugatti = new task10("Bugatti", 2020);
        task10 bugatti1 = new task10("Bugatti", 2020);

        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}
