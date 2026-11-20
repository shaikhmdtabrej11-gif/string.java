
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String str = "programming";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate Characters:");

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(
                    entry.getKey() + " = " + entry.getValue()
                );
            }
        }
    }
}
