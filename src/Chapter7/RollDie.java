package Chapter7;

import java.security.SecureRandom;

public class RollDie {
    public static SecureRandom secureRandom = new SecureRandom();
    public static int[] arrays = new int[7];
    public static void main(String[] args) {
        runRollDie();
    }

    private static void runRollDie() {
        for (int i = 1; i <= 60_000_0; i++) {
           arrays[1 + secureRandom.nextInt(6)] = arrays[1 + secureRandom.nextInt(6)]  + 1 ;
//            ++arrays[1 + secureRandom.nextInt(6)];

        }
        System.out.printf("%s%12s%n", "Face", "Frequency");
        for (int i = 1; i < arrays.length; i++) {
            System.out.printf("%4d%10d%n",i, arrays[i]);


        }

    }
}
