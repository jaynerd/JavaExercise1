package javaexercise1;

import java.util.Scanner;

public class JavaExercise1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // instantiating a scanner object for reading inputs.

        // simple for loop exercise.
        System.out.println("Please enter a number: ");
        int maxNum = Integer.parseInt(scan.nextLine()); // parsing string to int.
        SimpleForLoop forLoop = new SimpleForLoop(maxNum);
        forLoop.ExecuteForLoop();   // start for loop.

        // simple if exercise.
        System.out.println("Please enter true of false: ");
        boolean condition = scan.nextBoolean();
        SimpleIf simpleIf = new SimpleIf(condition);
        simpleIf.ReverseCondition();
    }
}

class SimpleForLoop {

    private final int MAX_NUM;

    public SimpleForLoop(int maxNum) {
        this.MAX_NUM = maxNum;
    }

    // for loop body.
    public void ExecuteForLoop() {
        System.out.println("Starting a for loop.");
        for (int i = 0; i < MAX_NUM; i++) {
            System.out.println(i + 1);
        }
    }
}

class SimpleIf {

    private boolean condition;

    public SimpleIf(boolean condition) {
        this.condition = condition;
    }

    // if body.
    public void ReverseCondition() {
        System.out.println("Current condition: " + condition);
        // reversing condition.
        if (condition) {
            condition = false;
        } else {
            condition = true;
        }
        System.out.println("Reversed condition: " + condition);
    }
}
