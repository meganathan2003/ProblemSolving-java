package Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

    // create a new method or function
    public static int firstDuplicate(int[] products) {

        Set<Integer> seen = new HashSet<>();

        for (int product : products) {

            if (seen.contains(product)) {
                return product;
            }

            seen.add(product);
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] products = {101, 205, 309, 205, 101};

        System.out.println(firstDuplicate(products));
    }
}