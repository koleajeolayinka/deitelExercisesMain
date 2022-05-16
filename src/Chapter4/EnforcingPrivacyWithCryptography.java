package Chapter4;

import java.util.Scanner;

//4.39 (Enforcing Privacy with Cryptography) The explosive growth of Internet communications
//        and data storage on Internet-connected computers has greatly increased privacy concerns. The field
//        of cryptography is concerned with coding data to make it difficult (and hopefully—with the most
//        advanced schemes—impossible) for unauthorized users to read. In this exercise you’ll investigate a
//        simple scheme for encrypting and decrypting data. A company that wants to send data over the In-
//        ternet has asked you to write a program that will encrypt it so that it may be transmitted more se-
//        curely. All the data is transmitted as four-digit integers. Your application should read a four-digit
//        integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7
//        to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
//        with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
//        a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
//        encryption scheme) to form the original number. [Optional reading project: Research “public key
//        cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may
//        also want to investigate the RSA scheme, which is widely used in industrial-strength applications.]
public class EnforcingPrivacyWithCryptography {
    public static Scanner scanner = new Scanner(System.in);
    public static int userInput;
    public static int firstDigit;
    public static int secondDigit;
    public static int thirdDigit;
    public static int forthDigit;
    public static void main(String[] args) {
        System.out.println("WELCOME TO ENFORCING PRIVACY WITH CRYPTOGRAPHY ");
        runEnforcingPrivacyWithCryptography();

    }

    private static void runEnforcingPrivacyWithCryptography() {
        System.out.println("KINDLY ENTER FOUR DIGIT TO SAFELY ENCRYPT IT ");
        userInput = scanner.nextInt();
        if(userInput <= 9999){
            encryptData();
        }else {
            runEnforcingPrivacyWithCryptography();
        }
    }

    private static void encryptData() {
        firstDigit = userInput / 1000;
        secondDigit = (userInput % 1000) / 100;
        thirdDigit = (userInput % 100) / 10;
        forthDigit = (userInput % 10);

        int encrytFirst = (firstDigit + 7) /10;
        int encrytSecond = thirdDigit;
        int encrytThird = firstDigit;
        int encrytForth = forthDigit % 2;

        System.out.println("SUCCESSFULLY ENCODED");
        System.out.println(encrytFirst + "" + encrytSecond + "" +encrytThird + "" +encrytForth);
        RunDecode();
    }

    private static void RunDecode() {
        System.out.println("ENTER ASCII CODE TO DECODE IT ");
        int code = scanner.nextInt();
        if (code == firstDigit) {
            System.out.println(firstDigit +""+ secondDigit +""+ thirdDigit +""+ forthDigit);
        }
        else {
            RunDecode();
        }
    }
}
