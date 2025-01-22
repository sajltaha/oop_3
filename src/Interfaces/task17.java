package Interfaces;
import java.awt.Color;
public class task17 {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox.";
        }
    }

    public static class BigFox extends Fox {
        public Color getColor() {
            return Color.RED;
        }
    }
}
