package binarysearch;

public class BinarySearchBoundary {

    // Method to find the smallest element greater than or equal to target
    public static int findSmallestGreaterThanOrEqual(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                result = mid; // Update result and continue searching left
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result; // Returns -1 if not found
    }

    // Method to find the largest element smaller than or equal to target
    public static int findLargestSmallerThanOrEqual(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                result = mid; // Update result and continue searching right
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result; // Returns -1 if not found
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 4, 5, 6, 8, 10};
        int targetValue1 = 5;
        int targetValue2 = 7;

        int index1 = findSmallestGreaterThanOrEqual(sortedArray, targetValue1);
        int index2 = findLargestSmallerThanOrEqual(sortedArray, targetValue2);

        System.out.println("Index of smallest element >= " + targetValue1 + ": " + index1); // Output: 3
        System.out.println("Index of largest element <= " + targetValue2 + ": " + index2); // Output: 4
    }
}

