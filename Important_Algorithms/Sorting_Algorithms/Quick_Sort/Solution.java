import java.util.*;

class QuickSort {

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int pivotIndex = low;

        while (low < high) {
            while (low <= high && arr[low] <= pivot) low++;
            while (high >= low && arr[high] > pivot) high--;

            if (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            } else {
                int temp = arr[pivotIndex];
                arr[pivotIndex] = arr[high];
                arr[high] = temp;
            }
        }

        return high;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1};

        System.out.println("Original array:");
        printArray(nums);

        quickSort(nums, 0, nums.length - 1);

        System.out.println("\nSorted array:");
        printArray(nums);
    }
}
