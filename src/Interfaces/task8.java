package Interfaces;

public class task8 {
    public static void main(String[] args) throws Exception {
        Check check = new Check();
        System.out.println(check.isAlive());
    }

    interface Person {
        boolean isAlive();
    }
    interface Presentable extends Person {
        boolean alive = true;
    }

    public static class Check implements Presentable {
        public boolean isAlive() {
            return alive;
        }
    }
}
