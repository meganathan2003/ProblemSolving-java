package Arrays;

public class DivisibleByPrevious {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6, 7};
        StringBuilder res = new StringBuilder();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % arr[i - 1] == 0) {
                res.append(arr[i]).append(" ");
            }
        }
        System.out.print(res.toString());

    }
}
