package linearsearch;

import java.util.HashMap;

public class FirstNonDuplicateCharacter {

    // Method to find the first non-duplicate character in a string
    public static Character findFirstNonDuplicate(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>(); // Map to store character counts

        // First pass: Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Second pass: Find the first character with a count of 1
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c; // Return the first non-duplicate character
            }
        }

        return null; // Return null if no non-duplicate character is found
    }

    public static void main(String[] args) {
        String input = "swiss"; // Example input string
        
        Character result = findFirstNonDuplicate(input);
        
        if (result != null) {
            System.out.println("The first non-duplicate character is: " + result);
        } else {
            System.out.println("There are no non-duplicate characters in the string.");
        }
    }
}

