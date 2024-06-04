package hyperskill;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Write a program that inputs a sequence of integer numbers in a loop and calculates their sum under the following conditions:
 * 1) if a new number is 0, the program must stop the loop and output the accumulated sum;
 * 2) if the sum is equal to or exceeds the limit of 1000, the program must also stop reading the numbers and output the value equal to the sum minus 1000.
 * Note: the input can contain extra numbers. Just ignore them.
 */

public class SumWithLimitStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int finalResult = result;
        result = Stream.generate(scanner::nextInt)
                .takeWhile(num -> num != 0)
                .mapToInt(Integer::intValue)
                .filter(num -> {
                    int currentSum = Integer.sum(num, finalResult);
                    if (currentSum >= 1000) {
                        System.out.println("The sum minus 1000 is: " + (currentSum - 1000));
                        return false;
                    }
                    return true;
                })
                .sum();

        System.out.println("The sum is: " + result);
        scanner.close();
    }
}