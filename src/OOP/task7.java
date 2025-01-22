package OOP;

public class task7 {
    private int salary = 1000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > this.salary) {
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        task7 programmer = new task7();
        System.out.println("Current salary: " + programmer.getSalary());

        programmer.setSalary(1200);
        System.out.println("Updated salary: " + programmer.getSalary());

        programmer.setSalary(1100);
        System.out.println("After attempting to lower salary: " + programmer.getSalary());
    }
}
