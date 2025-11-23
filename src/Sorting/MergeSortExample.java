package Sorting;

public class MergeSortExample {


    public static void mergeSort(int[] arr, int l, int r) {

        if (l < r) {

            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            // After we divide we have to merge them all
            merge(arr, l, mid, r);
        }
    }


    // This method for merging them all
    public static void merge(int[] arr, int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            lArr[i] = arr[l + i];
        }

        for (int i = 0; i < n2; i++) {
            rArr[i] = arr[mid + 1 + i]; //
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {

            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        // these while loop for remaning the element from the arrayy
        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }

        // These while loop for remainig element in the right array
        while (i < n2) {
            arr[k] = rArr[j];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 4, 6, 2};

        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Calling the merge sort
        mergeSort(arr, 0, arr.length - 1);


        System.out.println("After Sorting");

        for (int n : arr) {
            System.out.print(n + " ");
        }


    }


}
