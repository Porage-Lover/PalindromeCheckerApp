/**
 * =================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =================================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
 */
public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        
        // Define the input string
        String input = "level";

        // Instantiate the strategy implementation
        PalindromeStrategy strategy = new OptimizedStrategy();

        // Capture execution start time
        long startTime = System.nanoTime();

        // Execute the algorithm
        boolean isPalindrome = strategy.check(input);

        // Capture execution end time
        long endTime = System.nanoTime();

        // Calculate total execution duration
        long duration = endTime - startTime;

        // Display benchmarking results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }
}

/**
 * =================================================================
 * INTERFACE & IMPLEMENTATION
 * =================================================================
 * Provided here to ensure the strategy pattern referenced in 
 * the documentation is functional.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

class OptimizedStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}