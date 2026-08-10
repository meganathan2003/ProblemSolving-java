package Arrays;

import java.util.*;

public class DeliveryRoute {

    public static int minRefuels(int[] locations, int k) {

        int refuels = 0;
        int current = 0;

        for (int location : locations) {

            if (location - current > k) {
                return -1; // impossible
            }

            if (location - current == k) {
                refuels++;
                current = location;
            }
        }

        return refuels;
    }

    public static void main(String[] args) {

        int[] locations = {2, 5, 6, 9, 12};
        int k = 5;

        System.out.println(minRefuels(locations, k));
    }
}