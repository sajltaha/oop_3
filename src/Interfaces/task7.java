package Interfaces;

public class task7 {
    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());
    }
    interface Desire {
    }
    interface Dream extends Desire {
        public static Hobby HOBBY = new Hobby();
    }
    static class Hobby implements Dream {
        static int INDEX = 1;
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
