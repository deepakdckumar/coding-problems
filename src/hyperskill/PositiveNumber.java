package hyperskill;

import java.util.Scanner;

/**
 * Write a program that reads three integer numbers and prints true if exactly ONE number is positive (i.e. > 0). Otherwise, it should print false.
 */
public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        boolean isExactlyOnePositive = checkExactlyOnePositive(num1, num2, num3);
        System.out.println(isExactlyOnePositive);
    }

    public static boolean checkExactlyOnePositive(int num1, int num2, int num3) {
        int positiveCount = 0;

        if (num1 > 0) {
            positiveCount++;
        }

        if (num2 > 0) {
            positiveCount++;
        }
        if (positiveCount == 2) {
            return false;
        }

        if (num3 > 0) {
            positiveCount++;
        }

        return positiveCount == 1;
    }
}
