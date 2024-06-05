package udemymasterclass;

/**
 * Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
 *
 * If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
 *
 * The method should return the greatest common divisor of the two numbers (int).
 *
 * The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
 */

public class GCD {
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }
        int div = 1;
        first = first - second;
        second = first + second;
        first = second - first;
        for (int i = first; i > 0; i--) {
            if(first % i != 0) {
                continue;
            }
            div = i;
            for(int j = second; j > 0; j--) {
                if(second % j != 0) {
                    continue;
                }
                if(div == j) {
                    return div;
                }
            }
        }
        return div;
    }
}
