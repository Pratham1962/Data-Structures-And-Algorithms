import java.util.*;

class InsertionSort {

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {

            int j = i;

            while (j > 0 && array[j] < array[j - 1]) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }

            printArray(array);
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 4};

        System.out.println("Original array:");
        printArray(nums);

        System.out.println("\nSorting process:");
        insertionSort(nums);

        System.out.println("\nSorted array:");
        printArray(nums);
    }
}
