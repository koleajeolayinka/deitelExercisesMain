package ChapterSix;

import java.util.Scanner;

public class TemperatureConversions {
    public static Scanner scanner = new Scanner(System.in);
    public static String Display;
    public static double celsius;
    public static double kelvin;
    public static void main(String[] args) {
        runTemperatureConversion();

    }

    private static void runTemperatureConversion() {
        Display = """
                Press 1 >> To Calculate kelvin
                Press 2 >> To Calculate celsius
                """;
        print(Display);
        Display = scanner.next();
        switch (Display.charAt(0)) {
            case '1' -> calculateKelvin();
            case '2' -> calculateCelsius();
            default -> reRun();
        }



    }

    private static void reRun() {
        print("INCORRECT INPUT");
        runTemperatureConversion();
    }

    private static void calculateCelsius() {
        System.out.println("Enter a kelvin temperature");
        kelvin = scanner.nextDouble();
        celsius = kelvin - 273.15;
        System.out.printf("%n celsius is %.2f", celsius);

    }



    private static void calculateKelvin() {
        System.out.println("Enter a kelvin temperature");
        celsius = scanner.nextDouble();
        kelvin = celsius - 273.15;
        System.out.printf("%n kelvin is %.2f", kelvin);
    }

    private static void print(String Message) {
        System.out.println(Message);
    }
}
