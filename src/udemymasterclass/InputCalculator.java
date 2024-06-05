package udemymasterclass;

import java.util.Scanner;

public class InputCalculator {
    // write code here

    public static void inputThenPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        long avg = 0;
        while(scan.hasNextInt()) {
            int number = scan.nextInt();
            sum += number;
            count++;
        }
        avg = count > 0 ? Math.round(sum / count) : 0;
        System.out.println("SUM = " + (int) sum + " AVG = " + avg);
        scan.close();
    }
}
