package javaexercise1;

import java.util.Scanner;

public class JavaExercise1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int maxNum = Integer.parseInt(scan.nextLine());
        SimpleForLoop forLoop = new SimpleForLoop(maxNum);
        forLoop.ExecuteForLoop();
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
