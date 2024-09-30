package linearsearch;

import java.util.ArrayList;
import java.util.List;

public class FindIndices {

    // Method to find all indices where a specific integer appears in an array
    public static List<Integer> findIndices(int[] array, int target) {
        List<Integer> indices = new ArrayList<>(); // List to store indices
        
        // Iterate through the array to find occurrences of the target
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                indices.add(i); // Add index to the list if a match is found
            }
        }
        return indices; // Return the list of indices
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 3, 7, 3}; // Example array
        int target = 3; // Example target integer
        
        List<Integer> result = findIndices(numbers, target);
        
        if (result.isEmpty()) {
            System.out.println("The integer " + target + " does not appear in the array.");
        } else {
            System.out.println("The integer " + target + " appears at indices: " + result);
        }
    }
}

