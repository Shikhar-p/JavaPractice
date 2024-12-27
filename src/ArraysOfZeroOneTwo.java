/* You have an arrays of zeros (0) and ones(1) and twos (2) keep all zeros at
the left hand side and all 1 to middle  and 2 on right hand side
* */

/**
 * Approach:
 * The Dutch National Flag algorithm uses three pointers to maintain three partitions:
 * One pointer for the 0s (left side),
 * One pointer for the 1s (middle),
 * One pointer for the 2s (right side).
 * We will iterate over the array, swapping values as needed based on the current value and the pointers.
 *
 *
 * **/

public class ArraysOfZeroOneTwo {

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};

        // Call the method to sort the array
        sortArray(arr);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sortArray(int[] arr) {
        int low = 0;  // Pointer for 0's
        int mid = 0;  // Pointer for 1's
        int high = arr.length - 1;  // Pointer for 2's

        // Traverse the array and sort using the three pointers
        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid], move both pointers forward
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                // If it's 1, just move the mid pointer forward
                mid++;
            } else {
                // If it's 2, swap arr[mid] and arr[high], move high pointer backward
                swap(arr, mid, high);
                high--;
            }
        }
    }

    // Method to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
