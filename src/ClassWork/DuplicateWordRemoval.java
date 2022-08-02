package ClassWork;

import workSpace.Streams;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateWordRemoval {
    public static Scanner scanner = new Scanner(System.in);
    public  static String userInput;
    public static void main(String[] args) {
        runDWR();
    }

    private static void runDWR() {
//        System.out.println("Enter a appropriate sentence");
        userInput = scanner.nextLine().toLowerCase();
        String[] element = userInput.split(" ");
        List<String> StringList = Stream.of(element).sorted().distinct().toList();
        System.out.println(StringList);


    }
}
