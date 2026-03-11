/**
 * =================================================================
 * MAIN CLASS - UseCase9RecursivePalindrome
 * =================================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Developer
 * @version 9.0
 */
public class UseCase9PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string
        String input = "madam";

        // Call the recursive method starting with the outermost indices
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Display the result on the console
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Condition 1: Pointers have crossed or met, meaning all pairs matched
        if (start >= end) {
            return true;
        }

        // Base Condition 2: Characters at the current pointers do not match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call: move the start pointer right and the end pointer left
        return check(s, start + 1, end - 1);
    }
}