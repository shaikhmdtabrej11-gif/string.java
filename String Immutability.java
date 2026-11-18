
public class StringImmutable {

    public static void main(String[] args) {

        String str = "Hello";

        str.concat(" Java");

        System.out.println(str);

        str = str.concat(" Java");

        System.out.println(str);
    }
}
