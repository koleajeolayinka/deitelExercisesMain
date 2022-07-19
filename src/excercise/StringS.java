package excercise;

import javax.security.sasl.Sasl;
import java.util.Scanner;

public class StringS {
    public static Scanner scanner = new Scanner(System.in);
    public static String words;
    public static String[] array = {"qwwertyuiopqwertyuio"};
    public static void main(String[] args) {
        runStringS();
    }

    private static void runStringS() {
        words = "abcdefghiabjcc";
        System.out.println("The length if the word given is " + words.length());
//        String repeatCharacter = words.repeat();
        String repeat = words.repeat(words.compareTo("abcdefghiabjcc"));
        System.out.println(repeat);
//        System.out.println(repeat);
//        String chatAt0 = words.charAt()
        String subString0 = String.valueOf("".contains(repeat));
//        String subString0 = String.valueOf(words.substring(words.length()).contains(repeat));
//        int StringRepeatWord = Integer.parseInt(subString0);
        System.out.println("The length to the repeat letter " + subString0);
//        System.out.println("The length to the repeat letter " + StringRepeatWord);
//        for (int i = 0; i < words.length(); i++) {
//            System.out.println(words.substring(i));
//
//        }




    }
    public static void StringWord(){


    }
}
