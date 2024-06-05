package udemymasterclass;

public class SharedDigit {
    // write code here
    public static boolean hasSharedDigit(int first, int second) {
        if ((first >= 10 && first <= 99) && (second >= 10 && second <= 99)) {
            while (first > 0) {
                int fLastDigit = first % 10;
                int tSecond = second;
                while (second > 0) {
                    int sLastDigit = second % 10;
                    if (fLastDigit == sLastDigit) {
                        return true;
                    }
                    second /= 10;
                }
                second = tSecond;
                first /= 10;
            }
        }
        return false;
    }
}
