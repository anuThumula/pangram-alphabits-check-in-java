class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create an array to track which letters have been seen
        boolean[] seenLetters = new boolean[26];
        
        // Convert the input to lowercase to handle both cases
        input = input.toLowerCase();
        
        // Iterate through the input characters
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a'; // Calculate the index of the letter
                seenLetters[index] = true; // Mark the letter as seen
            }
        }
        
        // Check if all 26 letters have been seen
        for (boolean seen : seenLetters) {
            if (!seen) {
                return false; // Not a pangram
            }
        }
        
        return true; // It's a pangram
    }
}