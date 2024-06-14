import java.util.*;

class SelectionSort {
    
    // Method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Method to perform selection sort
    public static void selectionSort(int[] array) {
        int length = array.length;
        
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            
            // Find the minimum element in the remaining unsorted array
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element of the unsorted part
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
            
            // Print the array after each swap
            printArray(array);
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 2, 6};
        
        System.out.println("Original array:");
        printArray(nums);
        
        System.out.println("\nSorting process:");
        selectionSort(nums);
        
        System.out.println("\nSorted array:");
        printArray(nums);
    }
}
