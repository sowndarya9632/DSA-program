package linearsearch;

public class MaxElementFinder {

    // Method to find the maximum element in an array of integers
    public static int findMax(int[] array) {
        
        int max = array[0]; // Initialize max with the first element

        // Iterate through the array to find the maximum
        for (int i = 0 ; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if a larger element is found
            }
        }
        return max; // Return the maximum element
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7}; // Example array
            int maxElement = findMax(numbers);
            System.out.println("The maximum element in the array is: " + maxElement);
    }
}

