package hyperskill;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Write solution using Java Stream
 * Print the sum of all integers from a to b including both.
 * It is guaranteed that a < b in all test cases.
 */

public class AddLimitBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int total = IntStream.rangeClosed(firstNumber, secondNumber).sum();
        System.out.println(total);
    }
}
