package OOP;

public class task8 {
    public static void main(String[] args) {
        String s1 = new String("JavaITU");
        s1 = "JavaENU";
        String s2 = "JavaENU";
        s2 = new String("JavaITU");
        String s3 = "JavaENU";
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}
