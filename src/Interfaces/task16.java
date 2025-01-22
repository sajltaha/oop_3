package Interfaces;

public class task16 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        task16 getColor();

        Integer getAge();
    }

    public static class Fox implements Animal {
        public String getName() {
            return "Fox.";
        }

        public task16 getColor() {
            return null;
        }

        public Integer getAge() {
            return null;
        }
    }
}
