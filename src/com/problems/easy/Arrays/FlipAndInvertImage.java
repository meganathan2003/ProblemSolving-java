package com.problems.easy.Arrays;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

/**
 * Below the problem are flip the image
 * and invert the numbers and return the
 * 2d array
 *
 * @author meganathan
 * Input: image = [[1,1,0],[1,0,1],[0,0,0]]
 * Reverse [[0,1,1],[1,0,1],[0,0,0]].
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 */
public class FlipAndInvertImage {

    public int[][] flipAndInvertImage(int[][] image) {
        if (image.length != 0 && image[0].length != 0) {
            int[][] flipImage = new int[image.length][image[0].length]; // 3 X 3
            // create a loops for get the array value
            for (int i = 0; i < image.length; i++) {
                int index = 0;
                for (int j = image[i].length - 1; j >= 0; j--) {
                    flipImage[i][index] = image[i][j];
                    index++;
                }
            }

            // another loops for invert the number
            for (int i = 0; i < flipImage.length; i++) {
                for (int j = 0; j < flipImage[i].length; j++) {
                    if (flipImage[i][j] == 0) {
                        flipImage[i][j] = 1;
                    } else {
                        flipImage[i][j] = 0;
                    }
                }
            }
            return flipImage;
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        // Create a obj
        FlipAndInvertImage andInvertImage = new FlipAndInvertImage();
        System.out.println(Arrays.deepToString(andInvertImage.flipAndInvertImage(image)));
    }
}