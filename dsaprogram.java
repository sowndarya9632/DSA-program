package linearsearch;

public class LinearSearchString {
    
    // Method to perform linear search on an array of strings without using equals or ==
    public static int linearSearch(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (isSameString(array[i], target)) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Helper method to compare two strings character by character
    private static boolean isSameString(String str1, String str2) {
       
        if (str1.length() != str2.length()) {
            return false; // Different lengths, cannot be the same
        }
        // Compare characters
        for (int j = 0; j < str1.length(); j++) {
            if (str1.charAt(j) != str2.charAt(j)) {
                return false; // Characters do not match
            }
        }
        return true; // All characters match
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "fig"};
        String target = "cherry"; // Example target string
        
        int result = linearSearch(words, target);
        
        if (result != -1) {
            System.out.println("String \"" + target + "\" found at index: " + result);
        } else {
            System.out.println("String \"" + target + "\" not found in the array.");
        }
    }
}
