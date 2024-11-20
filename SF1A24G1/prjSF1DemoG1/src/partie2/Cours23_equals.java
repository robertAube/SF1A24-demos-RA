package partie2;

public class Cours23_equals {
    public Cours23_equals() {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "aaa";

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //false
    }

    public static void main(String[] args) {
        new Cours23_equals();
    }
}
