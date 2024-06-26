package udemymasterclass;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mb = kiloBytes / 1024;
            int kb = kiloBytes % 1024;
            String message = String.format("%d KB = %d MB and %d KB", kiloBytes, mb, kb);
            System.out.println(message);
        }
    }
}
