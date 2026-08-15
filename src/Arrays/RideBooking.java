import java.util.Arrays;

public class RideBooking {

    public static int minimumCars(int[] start, int[] end) {

        Arrays.sort(start);
        Arrays.sort(end);

        int cars = 0;
        int maxCars = 0;

        int i = 0;
        int j = 0;

        while (i < start.length) {

            if (start[i] < end[j]) {

                cars++;
                maxCars = Math.max(maxCars, cars);
                i++;

            } else {

                cars--;
                j++;
            }
        }

        return maxCars;
    }

    public static void main(String[] args) {

        int[] start = {1, 2, 3, 5};
        int[] end = {4, 3, 6, 7};

        System.out.println(minimumCars(start, end));
    }
}