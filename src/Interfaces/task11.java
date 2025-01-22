package Interfaces;

public class task11 {
    public static void main(String[] args) {
    }
    public interface Movable {
        void move();
    }
    public interface Edible {
        void beEaten();
    }
    public interface Eat {
        void eat();
    }

    class Cat implements Movable, Edible, Eat {
        public void move() {}
        public void beEaten() {}
        public void eat() {}
    }

    class Mouse implements Movable, Edible {
        public void move() {}
        public void beEaten() {}
    }

    class Dog implements Movable, Eat {
        public void move() {}
        public void eat() {}
    }
}
