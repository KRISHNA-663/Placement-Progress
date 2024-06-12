import java.util.*;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {1, 29, 4, 2, 8, 7};
        int n = arr.length;

        int maxIndex, minIndex;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // Even index: place the maximum element
                maxIndex = findMaxIndex(arr, i, n);
                swap(arr, i, maxIndex);
            } else { // Odd index: place the minimum element
                minIndex = findMinIndex(arr, i, n);
                swap(arr, i, minIndex);
            }
        }

        // Print the result array
        System.out.println(Arrays.toString(arr));
    }

    // Function to find the index of the maximum element in the array from start to end
    private static int findMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start + 1; i < end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Function to find the index of the minimum element in the array from start to end
    private static int findMinIndex(int[] arr, int start, int end) {
        int minIndex = start;
        for (int i = start + 1; i < end; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Function to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
