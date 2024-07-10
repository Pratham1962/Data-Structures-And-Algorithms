import java.util.*;

public class Main {

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high && nums[i] <= pivot) i++;
            while (j >= low && nums[j] > pivot) j--;

            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } else {
                int temp = nums[low];
                nums[low] = nums[j];
                nums[j] = temp;
            }
        }

        return j;
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(nums, low, high);
            quickSort(nums, low, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5, 2, 7, -1, 0};

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
