package OOP;

public class task6 {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    public task6() {
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        task6 myBugatti = new task6();
        System.out.println("Current body type: " + myBugatti.getBody());
        myBugatti.setBody("Convertible");
        System.out.println("Updated body type: " + myBugatti.getBody());
    }
}
