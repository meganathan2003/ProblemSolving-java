package Sorting;

public class BubbleSort {

    // Create a new method for bubble sort for reusable
    public int[] bubbleSort(int[] numbersArr){

        int n = numbersArr.length;

        for(int i = 0; i < n  - 1; i++){

            boolean swapped = false;

            for (int j = 0; j < n - i -1; j++){
                if(numbersArr[j] > numbersArr[j + 1]){

                    // swap the elements
                    int temp = numbersArr[j];
                    numbersArr[j] = numbersArr[j + 1];
                    numbersArr[j + 1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) break;
        }

        return numbersArr;
    }

    public void printArray(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();

        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        sort.printArray(arr);

// -----------------------------------------------------------------------------------------------

        int[] sortedArr = sort.bubbleSort(arr);
        System.out.println("sorted arr");

        sort.printArray(sortedArr);

    }
}
