package com.problems.easy.Arrays;

public class XPattern {

    public static void main(String[] args) {

        String str = "12345";
        int len = str.length();  // 5

        for (int i = 0; i < len; i++) {
            int j = len - 1 - i; // 5 - 1 - 2; = {4,3,2,1,0 }
            for (int k =  0; k < len; k++) {
                if (k == i || k == j)
                    System.out.print(str.charAt(k));
                else
                    System.out.print(".");
            }
            System.out.println(" ");
        }
    }
}
