package binarysearch;

public class BinarySearchOccurrences {

    // Method to find the first occurrence of a target element
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; // Update result and continue searching left
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result; // Will return -1 if not found
    }

    // Method to find the last occurrence of a target element
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; // Update result and continue searching right
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result; // Will return -1 if not found
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 2, 3, 4, 5, 5, 5, 6};
        int targetValue = 5;

        int firstIndex = findFirstOccurrence(sortedArray, targetValue);
        int lastIndex = findLastOccurrence(sortedArray, targetValue);

        System.out.println("First occurrence of " + targetValue + ": " + firstIndex); // Output: 6
        System.out.println("Last occurrence of " + targetValue + ": " + lastIndex);   // Output: 8
    }
}
