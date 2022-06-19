package Chapter3;

import java.util.Scanner;
//3.17 (Computerization of Health Records) A health-care issue that has been in the news lately is
//        the computerization of health records. This possibility is being approached cautiously because of
//        sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
//        Computerizing health records could make it easier for patients to share their health profiles and his-
//        tories among their various health-care professionals. This could improve the quality of health care,
//        help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
//        save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attri-
//        butes should include the person’s first name, last name, gender, date of birth (consisting of separate
//        attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
//should have a constructor that receives this data. For each attribute, provide set and get methods.
//        The class also should include methods that calculate and return the user’s age in years, maximum
//        heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
//        Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of
//class HealthProfile for that person and prints the information from that object—including the per-
//        son’s first name, last name, gender, date of birth, height and weight—then calculates and prints the
//        person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
//        the BMI values chart from Exercise 2.33.
public class HealthProfileClass {
    public static Scanner scanner = new Scanner(System.in);
    public static HealthProfile data = new HealthProfile("MAX", "WELL", "male", 6062005, 6.2, 200);
    public static StoreData store = new StoreData();
    public static void main(String [] args){
        runApp();
    }


    private static void runApp() {
        System.out.println("WELCOME TO HEALTH RECORD ");
        System.out.println("""
                PRESS 1 -> CHECK DATA
                PRESS 2 -> STORE DATA
                """);
        int MainMenu = scanner.nextInt();

        switch (MainMenu) {
            case 1 -> checkHealthData();
            case 2 -> storeHealthData();
        }
    }

    private static void storeHealthData() {
        System.out.print("ENTER PATIENT FIRST NAME: ");
        String FirstName = scanner.next();
        store.setFirstName(FirstName);

        System.out.println("ENTER PATIENT SECOND NAME: ");
        String SecondName = scanner.next();
        store.setSecondName(SecondName);

        System.out.println("ENTER PATIENT GENDER M|F: ");
         String gender = scanner.next();
         store.setGender(gender);

        System.out.println("""
                PLEASE NOTE THAT THE DATE OF BIRTH MUST BE IN 6052022(dd|mm|yy)format
                AND SINGLE DIGIT FOR DAY MUST NOT BEGIN WITH 06 FOR EX while DIGIT FOR MONTH MUST BEGIN WITH 06 FOR EX,💗
                KINDLY ENTER PATIENT DATE OF BIRTH DOWN BELOW ↓ ↓ ↓ ↓
                """);
        int DateOfBirth = scanner.nextInt();
        store.setDateOfBirth(DateOfBirth);
        store.setAge(DateOfBirth);

        System.out.println("ENTER PATIENT HEIGHT IN INCHES");
        int HeightInInches = scanner.nextInt();
        System.out.println("ENTER PATIENT WEIGHT IN POUND");
        int Weight = scanner.nextInt();
        store.setHeightInInches(HeightInInches);
        store.setWeightInPound(Weight);

        System.out.printf("%s%s%15s%6s%18s%n", "NAME", "\t   GENDER", "DateOfBirth", "AGE","BodyMassIndex");
        System.out.printf("%s%7s%16s%6d%10d", store.getFirstName() + " " + store.getSecondName(),store.getGender(), store.getDateOfBirth(),store.getAge(), store.getBodyMassIndex());

    }

    private static void checkHealthData() {

        System.out.printf("%s%s%15s%6s%18s%n", "NAME", "\t   GENDER", "DateOfBirth", "AGE","BodyMassIndex");

        System.out.printf("%s%7s%16s%6d%10d", data.getFirstName() + " " + data.getSecondName(),data.getGender(), data.getLineBetweenDate(),data.getAge(), data.getBodyMassIndex());
    }
}
