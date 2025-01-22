package Interfaces;

public class task2 {
    public static void main(String[] args) {
    }
    public interface CanFly {
        public void fly();
    }
    public interface CanMove {
        public void move();
    }
    public interface CanEat {
        public void eat();
    }
    public class Dog implements CanMove, CanEat {
        public void eat() {}
        public void move() {}
    }
    public class Duck implements CanMove, CanEat {
        public void eat() {}
        public void move() {}
    }
    public class Car implements CanMove {
        public void move() {}
    }
    public class Airplane implements CanFly {
        public void fly() {}
    }
}
