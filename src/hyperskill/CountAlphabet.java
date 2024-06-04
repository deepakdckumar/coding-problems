package hyperskill;

import java.util.Scanner;

public class CountAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        for (int i = 0; i < number; i++) {
            char c = scanner.next().charAt(0);
            if (c == 'A') {
                aCount++;
            } else if (c == 'B') {
                bCount++;
            } else if (c == 'C') {
                cCount++;
            } else if (c == 'D') {
                dCount++;
            }
        }
        System.out.println(dCount + " " + cCount + " " + bCount + " " + aCount);
        scanner.close();
    }
}
