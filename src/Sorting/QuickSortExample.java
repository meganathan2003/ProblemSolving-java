package Sorting;

public class QuickSortExample {

    public static void main(String[] args) {

        int[] arr = {5, 6, 2, 3, 1, 8, 4};

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    // Create a method for quickSort
    public static void quickSort(int[] arr, int low, int high) {

        // check the condition
        if (low < high) {

            int pivot = partition(arr, low, high);

            // We call it two time because we divide into two array
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; // assume the last value is pivot first
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                // if arr[j] is smaller than pivot then swap the two element
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                for(int num : arr){
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
        // If inside the loop is not swap outer loop will find the crt position and place it
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        return i + 1;
    }
}
