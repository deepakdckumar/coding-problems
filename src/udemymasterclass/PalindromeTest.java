package udemymasterclass;

public class PalindromeTest {
    public static boolean isPalindrome(int number) {
        int finalNumber = number < 0 ? -number : number;
        int reverse = 0;
        while(finalNumber > 0) {
            int lastDigit = finalNumber % 10;
            reverse = (reverse * 10) +lastDigit;
            finalNumber  = finalNumber / 10;
        }
        return (number < 0 ? -number : number) ==  reverse;
    }
}
