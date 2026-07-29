package Arrays;

public class SecondLargest {

    public static int secondLargest(int[] arr) {
        if (arr.length < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

     static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};

        System.out.println(secondLargest(arr)); // 34
    }
}