package Recursion;

public class FindFactorial {

    public static void main(String[] args) {

        int result = fact(2);
        System.out.println(result);
    }

    public static int fact(int i) {

        if (i == 0) return 1;

        return i * fact(i - 1);
    }
}
