package Interfaces;

public class task15 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable {
        public void onSelect() {
            System.out.println("Selected");
        }

        public void refresh() {
            System.out.println("Refreshed");
        }
    }
}
