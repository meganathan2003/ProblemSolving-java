package com.problems.easy.Arrays;

public class CountGoodRectangles {

    public static int countGoodRectangles(int[][] rectangles) {

        if (rectangles[0].length == 0) {
            return 0;
        }


        int maxLen = 0; // for rectangle side
        int count = 0;

        for (int[] rectangle : rectangles) {
            int side = Math.min(rectangle[0], rectangle[1]);

            if (side > maxLen) {
                maxLen = side;
                count = 1; // Reset count for the new maximum length

            }
            // This is for same maximum length
            else if (side == maxLen) {
                count++;
            }
        }

        return count;


    }

    public static void main(String[] args) {

        int[][] rectangles = {{5, 8}, {3, 9}, {5, 12}, {16, 5}};

        System.out.println(countGoodRectangles(rectangles));

    }

}
