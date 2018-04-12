package javaexercise1;

import java.util.Scanner;

public class JavaExercise1 {

    public static void main(String[] args) {
        // instantiating a scanner object to get inputs.
        Scanner scan = new Scanner(System.in);

        // simple for loop exercise.
        System.out.println("Please enter a number: ");
        int maxNum = Integer.parseInt(scan.nextLine()); // parsing string to int.
        SimpleForLoop forLoop = new SimpleForLoop(maxNum);
        forLoop.ExecuteForLoop();   // start for loop.

        // simple if exercise.
        System.out.println("\n" + "Please enter true or false: ");
        boolean condition = scan.nextBoolean();
        scan.nextLine();
        SimpleIf simpleIf = new SimpleIf(condition);
        simpleIf.ReverseCondition();

        // concatenation vs addition exercise.
        System.out.println("\n" + "Please enter a number: ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Please enter another number: ");
        int b = Integer.parseInt(scan.nextLine());
        ConcateVsAdd cvsa = new ConcateVsAdd(a, b);
        cvsa.ShowComparison();
    }
}

class SimpleForLoop {

    private final int MAX_NUM;

    public SimpleForLoop(int maxNum) {
        this.MAX_NUM = maxNum;
    }

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

    public void ReverseCondition() {
        System.out.println("Current condition: " + condition);
        if (condition) {
            condition = false;
        } else {
            condition = true;
        }
        System.out.println("Reversed condition: " + condition);
    }
}

class ConcateVsAdd {

    private final int a;
    private final int b;

    public ConcateVsAdd(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void ShowComparison() {
        System.out.println("Number " + a + " and number " + b + " concatenated: " + a + b);
        System.out.println("Number " + a + " and number " + b + " added: " + (a + b));
    }
}
