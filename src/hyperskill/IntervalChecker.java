package hyperskill;

/** Given an integer as an input, print True if its value falls within the interval (−15,12]∪(14,17)∪[19,+∞).
 * Otherwise, print False (case sensitive).
 * */

import java.util.Scanner;

public class IntervalChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean isInInterval = (number > -15 && number <= 12) ||
                (number > 14 && number < 17) ||
                (number >= 19);

        System.out.println(isInInterval ? "True" : "False");
    }
}
