package udemymasterclass;

public class IntEqualityPrinter {
    public static void printEqual(int first, int second, int third) {
        String message;
        if (first < 0 || second < 0 || third < 0) {
            message ="Invalid Value";
        } else if(first == second && second == third) {
            message ="All numbers are equal";
        } else if(first != second && second != third && third != first) {
            message ="All numbers are different";
        } else {
            message ="Neither all are equal or different";
        }
        System.out.println(message);
    }
}
