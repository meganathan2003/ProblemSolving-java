package Arrays;
import java.util.HashMap;
import java.util.Map;

public class OrderCounter {

    public static void main(String[] args) {

        String[] orders = {
                "Alice",
                "Bob",
                "Alice",
                "David",
                "Bob",
                "Alice"
        };

        Map<String, Integer> countMap = new HashMap<>();

        for (String customer : orders) {
            countMap.put(customer,
                    countMap.getOrDefault(customer, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}