package com.problems.easy.Arrays;

/**
 * Below the Sum for find the
 * number of Tested Device in the
 * Batterypercentage array and return the
 * array tested count
 *
 * @author meganathan
 * Input: batteryPercentages = [1,1,2,1,3]
 * Output: 3
 */
public class CountTestedDevices {
    // Create a sepreate method
    public int countTestedDevices(int[] b) {

        int count = 0;
        int dec = 0;
        int n = b.length;

        for (int i = 0; i < n; i++) {

            if (b[i] - dec > 0) {
                count++;
                dec++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // Create a new array
        int[] arr = {1, 1, 2, 1, 3};

        // Create a new obj
        CountTestedDevices testedDevices = new CountTestedDevices();
        System.out.println(testedDevices.countTestedDevices(arr));
    }
}


