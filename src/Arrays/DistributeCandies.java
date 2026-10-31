package Arrays;


import java.util.Arrays;
import java.util.HashSet;

public class DistributeCandies {

    // Create the sep method to return the value
    public int distributeCandies(int[] candyType) {

        if (candyType == null || candyType.length == 0) return 0;

        int maxCandiesToEat = candyType.length / 2;

        System.out.println("maxCandiesToEat: " + maxCandiesToEat);

        HashSet<Integer> set = new HashSet<>();

        // transfer into set
        for (int j : candyType) {
            set.add(j);
        }

        return Math.min(maxCandiesToEat, set.size()); // 2 , 3
    }


    static void main(String[] args) {

        int[] inpt = {1, 1, 2, 3};
        DistributeCandies dc = new DistributeCandies();
        System.out.println(dc.distributeCandies(inpt));

    }
}
