package OOP;

public class task9 {
    private String model;
    private String color;
    private int price;

    public task9(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        task9 iphone = (task9) obj;
        return price == iphone.price &&
                model.equals(iphone.model) &&
                color.equals(iphone.color);
    }

    public static void main(String[] args) {
        task9 iphone1 = new task9("X", "Black", 999);
        task9 iphone2 = new task9("X", "Black", 999);
        System.out.println(iphone1.equals(iphone2));
    }
}
