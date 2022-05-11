package Chapter4;

import java.util.Scanner;

//4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
//        kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//        a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//        The program should calculate and display the miles per gallon obtained for each trip and print the
//        combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//        produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
//        from the user.
public class GasMileage {
    public static Scanner scanner = new Scanner(System.in);
    public static int totalGallons = 0;
    public static int totalMiles = 0;
    public static int userInput;
    public static int Gallons;
    public static int Miles;
    public static void main(String[] args) {
        System.out.println("WELCOME TO GAS MILEAGE APPLICATION");
        RunGasMileage();
    }

    private static void RunGasMileage() {
        System.out.println("KINDLY ENTER NUMBER OF MILES YOU WANT TO INPUT");
        userInput = scanner.nextInt();
        for (int row = 1; row <= userInput ; row++) {
            System.out.println("KINDLY ENTER NUMBER " + row + " MILES ");
            Miles = scanner.nextInt();
            System.out.println("HOW MANY GALLONS USED FOR " + Miles + " MILES" );
             Gallons = scanner.nextInt();
             totalGallons = totalGallons + Gallons;
             totalMiles = totalMiles + Miles;
        }


        RunMilesPerGallon();

    }

    private static void RunMilesPerGallon() {
        System.out.println(totalMiles + " MILES PER " + totalGallons + " IS USED FOR ALL THE TRIP UP TO THIS POINT");
        RunAverageMiles();
    }

    private static void RunAverageMiles() {
        float averageMiles =(float) totalMiles / userInput;
        System.out.printf("%nAVERAGE MILES IS: %.2f", averageMiles);
        RunAverageGallons();
    }

    private static void RunAverageGallons() {
        float averageGallons = (float) totalGallons / userInput;
        System.out.printf("%nAVERAGE MILES IS: %.2f", averageGallons);

    }

}
