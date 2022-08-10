package Chapter7;

import java.security.SecureRandom;
import java.time.chrono.IsoEra;
import java.util.Scanner;

public class DiesRolling {

    public static SecureRandom secureRandom = new SecureRandom();
    public static Scanner scanner = new Scanner(System.in);
    public static int[] arrays = new int[7];
    public static int howfr;
    public static void main(String[] args){
        runDiesRolling();

    }
    public static void runDiesRolling(){
        for(int i = 0; i < arrays.length; i++){
             howfr = secureRandom.nextInt(1, 100);
             arrays[i] = howfr;
        }
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + "\n");

        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(howfr + " ");

            }
            System.out.println();
            
        }
    }
}
