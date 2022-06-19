package Chapter5;

import DesignPattern.UlControl;

import java.util.Objects;
import java.util.Scanner;

//31 (Global Warming Facts Quiz) The controversial issue of global warming has been widely
//        publicized by the film “An Inconvenient Truth,” featuring former Vice President Al Gore. Mr. Gore
//        and a U.N. network of scientists, the Intergovernmental Panel on Climate Change, shared the 2007
//        Nobel Peace Prize in recognition of “their efforts to build up and disseminate greater knowledge
//        about man-made climate change.” Research both sides of the issue online. Create a five-question
//        multiple-choice quiz on global warming, each question having four possible answers (numbered 1–
//        4). Be objective and try to fairly represent both sides of the issue. Next, write an application that
//        administers the quiz, calculates the number of correct answers (zero through five) and returns a mes-
//        sage to the user. If the user correctly answers five questions, print “Excellent”; if four, print “Very
//        good”; if three or fewer, print “Time to brush up on your knowledge of global warming,” and -
//        include a list of some websites where you found your facts.
public class GlobalWarmingFactsQuiz {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runGlobalWarmingFactQuiz();
    }

    private static void runGlobalWarmingFactQuiz() {
        System.out.print("WELCOME TO GLOBAL WARMING FACTS QUIZ\n\tWHERE YOU HAVE FIVE QUIZ RESERVE FOR YOU TO ANSWER\n");
//        1) ARRANGE THIS EORD CORRECT CORRECTLY?
//                2)
//        3)
//        4)
//        5) ARRANGE THIS WORD CORRECTLY LOBALG
//        """);
        System.out.println("ARRANGE THIS EORD CORRECT CORRECTLY?");
        String UserInputWord = scanner.nextLine();

        System.out.println("WHAT WAS C++ FORMERLY CALL?");
        String UserInputJava = scanner.nextLine();

        System.out.println(" WHAT IS THE FULL MEANING OF ATM");
        String userInputAtm = scanner.nextLine();

        System.out.println("HOW MANY MONTH ARE IN A YEAR");
        String UserInputYear = scanner.nextLine();

        System.out.println("ARRANGE THIS WORD CORRECTLY LOBALG");
        String userInputLo = scanner.nextLine();

        if (Objects.equals(UserInputWord, "word") && Objects.equals(UserInputJava, "java++") && Objects.equals(userInputAtm, "automated teller machine") && Objects.equals(UserInputYear, "12") && Objects.equals(userInputLo, "global")) {
            System.out.println("Excellent");
        } else if (!Objects.equals(UserInputWord, "word") && Objects.equals(UserInputJava, "java++") && Objects.equals(userInputAtm, "automated teller machine") && Objects.equals(UserInputYear, "12") && Objects.equals(userInputLo, "global")) {
            System.out.println("very good");
        } else if (Objects.equals(UserInputWord, "word") && !Objects.equals(UserInputJava, "java++") && Objects.equals(userInputAtm, "automated teller machine") && Objects.equals(UserInputYear, "12") && Objects.equals(userInputLo, "global")) {
            System.out.println("very good");

        } else if (Objects.equals(UserInputWord, "word") && Objects.equals(UserInputJava, "java++") && !Objects.equals(userInputAtm, "automated teller machine") && Objects.equals(UserInputYear, "12") && Objects.equals(userInputLo, "global")) {
            System.out.println("very good");

        } else if (Objects.equals(UserInputWord, "word") && Objects.equals(UserInputJava, "java++") && Objects.equals(userInputAtm, "automated teller machine") && !Objects.equals(UserInputYear, "12") && Objects.equals(userInputLo, "global")) {
            System.out.println("very good");
        }else if (Objects.equals(UserInputWord, "word") && Objects.equals(UserInputJava, "java++") && Objects.equals(userInputAtm, "automated teller machine") && Objects.equals(UserInputYear, "12") && !Objects.equals(userInputLo, "global")) {
            System.out.println("very good");
        }else {
            System.out.println("Time to brush up on your knowledge of global warming");

        }
    }
}