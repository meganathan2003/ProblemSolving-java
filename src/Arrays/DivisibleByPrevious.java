package Arrays;

public class DivisibleByPrevious {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6, 7};
        StringBuilder res = new StringBuilder();

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] % arr[j - 1] == 0) {
                if (res.length() > 0) {
                    res.append(" ");
                }
                res.append(arr[j]);
            }
        }
        System.out.print(res.toString());

    }
}
