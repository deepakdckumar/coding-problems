package udemymasterclass;

/**
 * Write a method named getLargestPrime with one parameter of type int named number.
 *
 * If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
 *
 *
 *
 * The method should calculate the largest prime factor of a given number and return it.
 */

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number <= 1) {
            return -1;
        }
        int prime = 1;
        for (int i = number; i > 0 ; i-- ) {
            if(number % i == 0) {
                for(int j = 2; j <= i; j++){
                    if(i == j) {
                        prime = j;
                        break;
                    }
                    if(i % j == 0) {
                        break;
                    }
                }
            }
            if(i == prime) {
                break;
            }
        }
        return prime;
    }
}
