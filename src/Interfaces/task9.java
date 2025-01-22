package Interfaces;

public class task9 {
    public static void main(String[] args) throws Exception {}

    interface CanMove {
        Double speed();
    }
    interface CanFly extends CanMove {
        Double speed(CanFly obj);
    }
}
