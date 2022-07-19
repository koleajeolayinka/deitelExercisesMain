package ChapterSix;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Scanner;

//6.29 (Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
//        each time the user chooses the “ Toss Coin ” menu option. Count the number of times each side of
//        the coin appears. Display the results. The program should call a separate method flip that takes no
//        arguments and returns a value from a Coin enum ( HEADS and TAILS ). [Note: If the program realistically
//        simulates coin tossing, each side of the coin should appear approximately half the time.]
public class CoinTossing {
    enum Coin {HEADS, TAILS}
    public static Scanner scanner = new Scanner(System.in);
    public static SecureRandom secureRandom = new SecureRandom();
    public static int randCoinToss, counterForHeads, counterForTails;
    public static String userInput;
    public static Coin heads, tails;
    public static void main(String[] args){



    runCoinTossing();
    }
    private static void runCoinTossing() {
        String displayOption = """
                Press 1 -> Toss Coin
                """;
        System.out.println(displayOption);
        userInput = scanner.nextLine();
        if (Objects.equals(userInput, "1")) {
            tossCoin();
        } else {
            System.out.println("sorry please i don't understand");
        }


    }

    private static void tossCoin() {
        randCoinToss = secureRandom.nextInt(1,3);
        if (randCoinToss == 1) {
            heads = Coin.HEADS;
            System.out.println(heads);
            counterForHeads++;

        }else {
            tails = Coin.TAILS;
            System.out.println(tails);
            counterForTails++;
        }
        System.out.println("Number of heads now is " + counterForHeads );
        System.out.println("Number of tails now is " + counterForTails );
        userToss();


    }
    public static void userToss(){
        String displayOption = """
                Press 1 -> To Flip
                Press anything -> Stop
                """;
        System.out.println(displayOption);
        userInput = scanner.nextLine();
        if (Objects.equals(userInput, "1")) {
            flip();
        } else {
            System.out.println("sorry please i don't understand");
        }
    }

    public static void flip(){
        tossCoin();
    }



}
