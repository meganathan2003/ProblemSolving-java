package com.problems.zoho;


/**
 * Day 14
 *
 * @author Meganathan
 */
public class IsClosedPath {

    public static boolean isClosedPath(String direction) {

        if (direction.isBlank()) {
            return false;
        }

        // This is for track the points like routes
        int x = 0;
        int y = 0;
        for (char c : direction.toCharArray()) {
            if (c == 'U') {
                y++;
            } else if (c == 'D') {
                y--;
            } else if (c == 'L') {
                x--;
            } else {
                x++;
            }
        }

        return x == 0 && y == 0;

    }

    public static void main(String[] args) {

        String dir = "UDLLRRDDRULU";
        System.out.println(isClosedPath(dir));
    }

}
