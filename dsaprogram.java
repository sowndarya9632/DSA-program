package binarysearch;
public class RotatedSortedArraySearch {

    // Method to check if the target exists in a rotated sorted array
    public static boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the mid element is the target
            if (nums[mid] == target) {
                return true; // Target found
            }

            // Check which half is sorted
            if (nums[left] <= nums[mid]) { // Left half is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Target is in the left sorted half
                } else {
                    left = mid + 1; // Target is in the right half
                }
            } else { // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Target is in the right sorted half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }
        }

        return false; // Target not found
    }

    public static void main(String[] args) {
        int[] rotatedArray = {4, 5, 6, 7, 0, 1, 2};
        int target = 2;

        boolean exists = search(rotatedArray, target);
        System.out.println("Target " + target + " exists: " + exists); // Output: true
    }
}

