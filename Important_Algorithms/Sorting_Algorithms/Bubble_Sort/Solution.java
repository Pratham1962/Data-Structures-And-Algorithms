import java.util.*;

class BubbleSort {

    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

   
    public static void bubbleSort(int[] array) {
        int length = array.length;

       
        for (int j = 0; j < length; j++) {

           
            for (int i = 0; i < length - 1 - j; i++) {

               
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }

         
            printArray(array);
        }
    }

    public static void main(String[] args) {
        int[] nums = {7, 6, 5, 4, 3};

        System.out.println("Original array:");
        printArray(nums);

        System.out.println("\nSorting process:");
        bubbleSort(nums);

        System.out.println("\nSorted array:");
        printArray(nums);
    }
}
