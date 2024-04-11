package udemymasterclass;

public class PositiveNegativeZero {
    public static void checkNumber(int number) {
        String value = number == 0 ? "zero" : number > 0 ? "positive" : "negative";
        System.out.println(value);
    }
}
