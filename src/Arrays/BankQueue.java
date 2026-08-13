package Arrays;

import java.util.*;

public class BankQueue {

    public static int minimumTime(int[] customers, int k) {

        PriorityQueue<Integer> counters = new PriorityQueue<>();

        // Initially every counter has 0 workload
        for (int i = 0; i < k; i++) {
            counters.offer(0);
        }

        for (int time : customers) {

            // Counter having minimum workload
            int currentLoad = counters.poll();

            // Add this customer to that counter
            currentLoad += time;

            counters.offer(currentLoad);
        }

        // Maximum workload determines total completion time
        int answer = 0;

        while (!counters.isEmpty()) {
            answer = Math.max(answer, counters.poll());
        }

        return answer;
    }

    public class Main {

        public static void main(String[] args) {

            int[] customers = {5, 2, 3, 7, 4};

            int k = 2;

            System.out.println(
                    BankQueue.minimumTime(customers, k)
            );
        }
    }
}