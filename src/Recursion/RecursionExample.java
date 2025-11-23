package Recursion;

public class RecursionExample {

    public static void main(String[] args) {

        f1(10);
    }

    public static void f1(int i) {
        System.out.println(i);

        if (i > 1) f1(i - 1);
    }

}
