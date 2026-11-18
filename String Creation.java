
public class StringCreation {

    public static void main(String[] args) {

        // String Literal
        String s1 = "Java";

        // Using new keyword
        String s2 = new String("Java");

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
