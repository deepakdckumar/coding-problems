package udemymasterclass;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double myFirstNumber, double mySecondNumber) {
        return (int) (myFirstNumber * 1000) == (int) (mySecondNumber * 1000);
    }
}
