import java.util.*;
class Solution {
    void countingSort(int[] arr, int exp) {
        int n = arr.length;
        // Output array
        int[] output = new int[n];
        // Count array for digits
        int[] count = new int[10];
        // Count occurrences of each digit at the current place
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }
        // Convert count array to cumulative count array
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        // Place elements in output array in reverse order for stability
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }
        // Copy sorted output back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    // Function to perform Radix Sort
    void radixSort(int[] arr) {
        int maxNum = Arrays.stream(arr).max().getAsInt();

        // Apply counting sort for each digit place
        for (int exp = 1; maxNum / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }
        public static void main(String[] args) {
            int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

            Solution obj = new Solution();
            obj.radixSort(arr);

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

