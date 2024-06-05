package udemymasterclass;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number. The method should return the sum of the even digits within the number. If the number is negative, the method should return -1 to indicate an invalid value.
 * <p>
 * Edit
 */
public class GetEvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1; // Invalid value
        }

        return String.valueOf(Math.abs(number))
                .chars()
                .map(Character::getNumericValue)
                .filter(digit -> digit % 2 == 0)
                .sum();
    }
}
