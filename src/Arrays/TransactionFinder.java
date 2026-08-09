package Arrays;

import java.util.HashMap;

public class TransactionFinder {

    public int[] findTransactions(int[] transactions, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < transactions.length; i++) {

            int current = transactions[i];
            int required = target - current;

            if (map.containsKey(required)) {
                return new int[]{map.get(required), i};
            }

            map.put(current, i);
        }

        return new int[]{-1, -1};
    }

    static void main(String[] args) {
        int[] transactions = {120, 80, 200, 150, 90, 130};
        int target = 230;

        TransactionFinder solution = new TransactionFinder();

        int[] result = solution.findTransactions(transactions, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
