package AssignmentDen;

import java.util.Scanner;

public class MyersBriggs {
    public static Scanner scanner = new Scanner(System.in);

    public static String[][] extroversionVsIntroversion = {
            {"A. EXPAND ENERGY, ENJOY GROUPS", "B. CONSERVE ENERGY, ENJOY ONE-ON-ONE"},
            {"A. INTERPRET LITERALLY", "B. LOOK FOR MEANING AND POSSIBILITIES"},
            {"A. LOGICAL, THINKING, QUESTIONING", "B. EMPATHETIC, FEELING, ACCOMMODATING"},
            {"A. ORGANIZED, ORDERLY", "B. FLEXIBLE, ADAPTABLE"},
            {"A. MORE OUTGOING, THINK OUT LOUD", "B. MORE RESERVE, THINK TO YOURSELF"},
            {"A. PRACTICAL, REALISTIC, EXPERIENTIAL", "B. IMAGINATIVE, INNOVATING, THEORETICAL"},
            {"A. CANDID, STRAIGHT FORWARD, FRANK", "B. TACTFUL, KIND, ENCOURAGING"},
            {"A. PLAN, SCHEDULE", "B. UNPLANNED, SPONTANEOUS"},
            {"A. SEEK MANY TASKS", "PUBLIC ACTIVITIES"},
            {"A. INTERACTION WITH OTHERS", " B. SEEK PRIVATE, SOLITARY ACTIVITIES WITH QUIET TO CONCENTRATE"},
            {"A. STANDARD, USUAL, CONVENTIONAL", " B. DIFFERENT, NOVEL, UNIQUE"},
            {"A. FIRM, TEND TO CRITICIZE, HOLD THE LINE", "B. EASYGOING, \"LIVE\" AND \"LET LIVE\" "},
            {"A. EXTERNAL, COMMUNICATIVE, EXPRESS YOURSELF", "B. INTERNAL, RETICENT, KEP TO YOURSELF"},
            {"A. FOCUS ON HERE-AND-NOW", "B. LOOK TO THE FUTURE, GLOBAL PERSPECTIVE, \"BIG PICTURE\""},
            {"A. TOUGH-MINDED, JUST", "B. TENDER-HEARTED, MERCIFUL"},
            {"A. PREPARATION, PLAN AHEAD", "B. GO WITH THE FLOW, ADAPT AS YOU GO"},
            {"A. ACTIVE, INITIATE", "B. REFLECTIVE, DELIBERATE"},
            {"A. FACTS, THINGS, \"WHAT IS\" ", "B. IDEAS, DREAMS, \"WHAT COULD BE,\" PHILOSOPHICAL"},
            {"A. MATTER OF FACT, ISSUE-ORIENTED ", "B. SENSITIVE, PEOPLE-ORIENTED, COMPASSIONATE"},
            {"A. CONTROL, GOVERN ", "B. LATITUDE, FREEDOM"}};

    public static void main(String[] args) {
        runMyersBriggs();
    }

    private static void runMyersBriggs() {
        for (int i = 1; i <= extroversionVsIntroversion.length; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.println("(" + i + ")" + " " + extroversionVsIntroversion[j][j] + extroversionVsIntroversion[i][i]);
                String userInput = scanner.nextLine();


            }

        }

    }

}
