package binarysearch;
public class BitonicArrayPeak {

    // Method to find the peak element in a bitonic array
    public static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare mid element with its next element
            if (arr[mid] < arr[mid + 1]) {
                // If mid is less than next, peak is on the right side
                left = mid + 1;
            } else {
                // If mid is greater than or equal to next, peak is on the left side or mid itself
                right = mid-1;
            }
        }

        // Left will point to the peak element
        return right; // Index of the peak element
    }

    public static void main(String[] args) {
        int[] a= {1, 31, 8, 1, 4, 2};
        int peakIndex = findPeak(a);
        System.out.println("Peak element index: " + peakIndex); // Output: 3
        System.out.println("Peak element: " + a[peakIndex]); // Output: 12
    }
}
