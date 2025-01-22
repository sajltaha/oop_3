package OOP;

public class task13 {
    public void eat(Apple apple) {
        System.out.println("The apple has been eaten!");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();

        task13 hedgehog = new task13();

        hedgehog.eat(apple);
    }

    public static class Apple {
    }
}
