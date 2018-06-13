package ascii;

/**
 * This simple char to int exercise demonstrates how characters can be
 * converted to int. This snippet will help students to get the concept
 * of character to ASCII value conversion (characters are represented
 * by numbers).
 */

public class AsciiExerciseTwo {
    public static void main(String[] args) {
        char letter = 'B';
        System.out.println(letter + " in ASCII value = " + (int) letter); // Cast chat to int.

        letter += 1; // Incrementing the ASCII value by 1 to get the next letter.
        System.out.println(letter + " in ASCII value = " + (int) letter);

        // Running a for loop with char types to show that they can be treated as int types.
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i); // Print each letters from a to z.
        }
    }
}
