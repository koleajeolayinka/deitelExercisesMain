package AssignmentDen;

import java.util.Arrays;
import java.util.Scanner;

public class MyersBriggs {
    public static Scanner scanner = new Scanner(System.in);
    public static String userInput;

    public static String[][] extroversionVsIntroversion = {
            {"A. EXPAND ENERGY, ENJOY GROUPS \n\tB. CONSERVE ENERGY, ENJOY ONE-ON-ONE"},
            {"A. INTERPRET LITERALLY \n\tB. LOOK FOR MEANING AND POSSIBILITIES"},
            {"A. LOGICAL, THINKING, QUESTIONING \n\tB. EMPATHETIC, FEELING, ACCOMMODATING"},
            {"A. ORGANIZED, ORDERLY \n\tB. FLEXIBLE, ADAPTABLE"},
            {"A. MORE OUTGOING, THINK OUT LOUD \n\tB. MORE RESERVE, THINK TO YOURSELF"},
            {"A. PRACTICAL, REALISTIC, EXPERIENTIAL \n\tB. IMAGINATIVE, INNOVATING, THEORETICAL"},
            {"A. CANDID, STRAIGHT FORWARD, FRANK \n\tB. TACTFUL, KIND, ENCOURAGING"},
            {"A. PLAN, SCHEDULE \n\tB. UNPLANNED, SPONTANEOUS"},
            {"A. SEEK MANY TASKS PUBLIC ACTIVITIES"},
            {"A. INTERACTION WITH OTHERS \n\t B. SEEK PRIVATE, SOLITARY ACTIVITIES WITH QUIET TO CONCENTRATE"},
            {"A. STANDARD, USUAL, CONVENTIONAL \n\tB. DIFFERENT, NOVEL, UNIQUE"},
            {"A. FIRM, TEND TO CRITICIZE, HOLD THE LINE \n\tB. EASYGOING, \"LIVE\" AND \"LET LIVE\" "},
            {"A. EXTERNAL, COMMUNICATIVE, EXPRESS YOURSELF \n\tB. INTERNAL, RETICENT, KEP TO YOURSELF"},
            {"A. FOCUS ON HERE-AND-NOW \n\tB. LOOK TO THE FUTURE, GLOBAL PERSPECTIVE, \"BIG PICTURE\""},
            {"A. TOUGH-MINDED, JUST \n\tB. TENDER-HEARTED, MERCIFUL"},
            {"A. PREPARATION, PLAN AHEAD \n\tB. GO WITH THE FLOW, ADAPT AS YOU GO"},
            {"A. ACTIVE, INITIATE \n\tB. REFLECTIVE, DELIBERATE"},
            {"A. FACTS, THINGS, \"WHAT IS\" \n\tB. IDEAS, DREAMS, \"WHAT COULD BE,\" PHILOSOPHICAL"},
            {"A. MATTER OF FACT, ISSUE-ORIENTED \n\tB. SENSITIVE, PEOPLE-ORIENTED, COMPASSIONATE"},
            {"A. CONTROL, GOVERN \n\tB. LATITUDE, FREEDOM"}};

    public static void main(String[] args) {
        runMyersBriggs();
    }

    private static void runMyersBriggs() {
        for (int i = 0; i < extroversionVsIntroversion.length; i++) {
            for (int j = 0; j <20; j++) {
int sum = i + 1;

                try {


                    System.out.println("(" + sum + ")" + " " + (extroversionVsIntroversion)[i][j]);
//                userInput = scanner.nextLine().toLowerCase();
                } catch (ArrayIndexOutOfBoundsException ignored) {

                }

            }
        }
        System.out.println(userInput);
    }

}


