package Interfaces;

public class task4 {
    public static void main(String[] args) {
    }
    interface CanRun{
        public void run();
    }
    interface CanSwim{
        public void swim();
    }

    public abstract class Human implements CanRun, CanSwim{
    }
}
