package ChapterSix.ComputerAssistedInstruction;

import java.security.SecureRandom;
import java.util.Scanner;

public class MonitoringStudentPerformance {
    public static Scanner scanner = new Scanner(System.in);
    public static SecureRandom secureRandom = new SecureRandom();
    public static int randFirstNumber, randSecondNumber, userNumber, answer;
    public static double countCorrect, countIncorrect = 0;
    public static void main(String[] args){
        runMonitoringStudentPerformance();
    }

    private static void runMonitoringStudentPerformance() {
        for (int i = 1; i <= 10; i++) {
            randFirstNumber = secureRandom.nextInt(0,9);
            randSecondNumber = secureRandom.nextInt(0,9);
            System.out.printf("(%d) How much is %d times %d%n", i,randFirstNumber, randSecondNumber);
            userNumber = scanner.nextInt();
            answer = randFirstNumber * randSecondNumber;
            if (userNumber == answer) {
                countCorrect++;
            }
            else
                countIncorrect++;



        }
        remark();
    }
    public static void remark() {
        double percentage = (countCorrect / 10) * (100);
        double incorrectPercentage = (countIncorrect / 10) * 100;

        if (percentage >= 75) {
            System.out.printf("Congratulations, you are ready to go to the next level!\nyour percentage is %.0f%s Correct%n ", percentage, "%");
            System.out.printf("You pass %.0f%n", countCorrect);
            System.out.printf("You failed %.0f%n", countIncorrect);

        }else {
            System.out.printf("Please ask your teacher for extra help\nyour percentage is %.0f%s Incorrect %n", incorrectPercentage,"%");
            System.out.printf("You pass %.0f%n", countCorrect);
            System.out.printf("You failed %.0f%n", countIncorrect);
        }



    }
}
