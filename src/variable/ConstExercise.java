package variable;

/**
 * This simple constant assigning exercise demonstrates how constants
 * can be assigned, which precedes should be used to declare, and how
 * it affects the compiling process. Constants should be used for the
 * variables that does that change its value for a fly of an entire
 * program.
 */

public class ConstExercise {
    private static final int CONSTANT_VALUE = 99;

    public static void main(String[] args) {
        System.out.println(CONSTANT_VALUE + " is a constant value." +
                "This value cannot be altered during the runtime.");
    }
}
