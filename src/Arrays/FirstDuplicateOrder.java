package Arrays;

import java.util.HashSet;

public class FirstDuplicateOrder {
    public static int firstDuplicate(int[] orders) {
        HashSet<Integer> seen = new HashSet<>();

        for (int order : orders) {
            if (seen.contains(order)) {
                return order;
            }
            seen.add(order);
        }

        return -1; // No duplicate found
    }

    public static void main(String[] args) {
        int[] orders = {101, 205, 310, 205, 450, 101};

        System.out.println(firstDuplicate(orders));
    }
}