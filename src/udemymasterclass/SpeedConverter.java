package udemymasterclass;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        double milesPerHour = kilometersPerHour / 1.609D;
        return Math.round(milesPerHour);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            String message = String.format("%f km/h = %d mi/h", kilometersPerHour, milesPerHour);
            System.out.println(message);
        }
    }
}
