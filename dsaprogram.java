package linearsearch;

public class CharacterCount {

    // Method to count occurrences of a specific character in a string
    public static int countCharacterOccurrences(String str, char target) {
        int count = 0; // Initialize count
        
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character matches the target
            if (str.charAt(i) == target) {
                count++; // Increment count if a match is found
            }
        }
        return count; // Return the total count
    }

    public static void main(String[] args) {
        String text = "hello world, welcome to the universe!";
        char target = 'o'; // Example target character
        
        int result = countCharacterOccurrences(text, target);
        
        System.out.println("Character '" + target + "' appears " + result + " times in the string.");
    }
}
