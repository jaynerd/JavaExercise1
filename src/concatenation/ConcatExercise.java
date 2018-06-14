package concatenation;

/**
 * This simple concatenation exercise demonstrates how strings can be
 * concatenated, especially numbers (string), and perform an arithmetic
 * addition (int). This snippet will help students to get the concept
 * of how numeral values can be processes depend on the types.
 */

public class ConcatExercise {
    public static void main(String[] args) {
        // Performs concatenation of 1 and 99. Numeric values will be
        // treated as strings.
        System.out.println("1 and 99 concatenated: " + 1 + 99);

        // Performs arithmetic addition of 1 and 99. Numeric values
        // will be treated as an int type.
        System.out.println("1 and 99 added: " + (1 + 99));
    }
}
