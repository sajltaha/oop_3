package Interfaces;

public class task6 {
    public static void main(String[] args) throws Exception {
    }
    public interface Selectable {
        void onSelect();
    }
    public interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable, Updatable {
        public void onSelect() {}
        public void refresh() {}
    }
}
