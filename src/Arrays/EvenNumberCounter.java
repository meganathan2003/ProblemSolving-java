package Arrays;

public class EvenNumberCounter {

    static int countEvenNumbers(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 7, 8, 10, 13};

        int result = countEvenNumbers(arr);
        System.out.println(result);
    }
}