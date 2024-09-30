package linearsearch;

import java.util.List;

public class FirstOccurrenceSearch {

    // Method to find the first occurrence of a number in a list of integers
    public static int findFirstOccurrence(List<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 3, 7, 1, 9, 3, 2); // Example list
        int target = 3; // Example target number
        
        int result = findFirstOccurrence(numbers, target);
        
        if (result != -1) {
            System.out.println("Number " + target + " found at index: " + result);
        } else {
            System.out.println("Number " + target + " not found in the list.");
        }
    }
}

