package DiaryApplication;

import Chapter3.StoreData;

import java.io.BufferedReader;
import java.util.Objects;
import java.util.Scanner;


public class DiarySite {
    public static DiaryAccount logIn = new DiaryAccount("tobi", "1234");
    public static DiaryEntity diary = new DiaryEntity("IT'S SO SAD REAL MADRID DEFEAT MAN-CITY TODAY", "MONDAY SAUCE ", "GOING TO PSG");
    public static Lock lock = new Lock();
    public static NotePad notePad = new NotePad();
    public static DiaryTime time = new DiaryTime();
    public static CreateDairy account = new CreateDairy();
    public static DiaryDate date = new DiaryDate(5072010, 6012022, 2022020);
    public static StoreData store = new StoreData();
    public static Scanner scanner = new Scanner(System.in);
    public static String[] array = new String[10];

    public static void main(String[] args) {
        RunSite();
    }

    private static void RunSite() {
        System.out.println("""
                WELCOME TO MyDIARY SITE
                \tWHERE ALL DIARY ARE SAVE🔐 AND ENCRYPTED🗽
                PRESS 1 ->> LOGIN
                PRESS 2 ->> CREATE ACCOUNT
                PRESS 3 ->> IF YOU FORGET YOUR LOG IN DETAILED
                """);
        String UserInput1 = scanner.next();

        switch (UserInput1) {
            case "1" -> LogInToAccount();
            case "2" -> CreateAccount();
            case "3" -> forGetPassWordToLogIn();
            default -> others();
        }

    }

    private static void others() {
        System.out.println("INCORRECT INPUT ");
        RunSite();
    }

    private static void forGetPassWordToLogIn() {
        System.out.println("""
                PRESS 1 >->> IF YOU REMEMBER YOUR USER NAME TO LOGIN
                PRESS 2 >->> IF YOU REMEMBER YOUR YOUR PASSWORD TO LOGIN
                """);
        int userInput = scanner.nextInt();

        switch (userInput){
            case '1': LogInWithoutUserName();
            case '2': LogInWithoutPassWord();
        }
    }

    private static void LogInWithoutPassWord() {
        System.out.println("ENTER YOUR ACCOUNT USER NAME ");
        String userName = scanner.next();
        System.out.println("ENTER YOUR ACCOUNT PHONE NUMBER ");
        if (Objects.equals(userName, logIn.getUserName())) {


        }
    }

    private static void LogInWithoutUserName() {
    }

    private static void CreateAccount() {
        String firstName1 = scanner.nextLine();
        System.out.println("ENTER FIRST NAME");
        String firstName = scanner.nextLine();
        System.out.println("ENTER FULL NAME");
        String surName = scanner.nextLine();
        System.out.println(firstName + " " + surName + " KINDLY ENTER DATE OF BIRTH\nPLEASE YOUR DATE OF BIRTH MUST BE WRITTEN IN DMMYYYY ELSE DDMMYYYY FORMAT");
        int DateOfBirth = scanner.nextInt();
        store.setDateOfBirth(DateOfBirth);
        store.setAge(DateOfBirth);
        System.out.println("ENTER EMAIL ACCOUNT TO VERIFY YOU'RE ACTUALLY " + store.getAge());
        String email = scanner.next();
        System.out.println("YOUR EMAIL ACCOUNT " + email + " IS VERIFY✅✅✅");

        Id();

    }

    private static void Id() {
        System.out.println("ENTER ACCOUNT USERNAME ");
        String UserName = scanner.next();
        account.setUserName(UserName);
        System.out.println("ENTER ACCOUNT PASSWORD ");
        String password = scanner.next();
        account.setPassword(password);
        ConfirmPassword();

    }

    private static void ConfirmPassword() {
        System.out.println("CONFIRM PASSWORD");
        String PasswordCheck = scanner.next();
        if (Objects.equals(PasswordCheck, account.getPassword())) {
            OpenCreateSite();
        } else if (!Objects.equals(account.getPassword(), PasswordCheck)) {
            System.out.println("INCORRECT PASSWORD ");
            Id();
        }

    }


    private static void OpenCreateSite() {
        System.out.println(account.getUserName() + " WELCOME TO MyDiary SITE ");
        System.out.println("""
                PRESS 1 ->> WRITE DIARY
                PRESS 2 ->> LOG OUT
                               
                """);
        int UserInput = scanner.nextInt();
        switch (UserInput) {
            case 1 -> WriteCreatedDiary();
            case 2 -> LogOut();
        }
    }


    private static void WriteCreatedDiary() {
        System.out.println("YOUR DIARY IS SAVE AND ENCRYPTED FREE FREE TO WRITE YOUR DIARY BELOW ↓↓\uD83D\uDE47 ");
        System.out.println("CREATE A PASSWORD TO LOCK ");
        String Lock = scanner.next();
        lock.setLockPassword(Lock);
        System.out.println("CONFIRM YOUR LOCK KEY AGAIN");
        String ConfirmLock = scanner.next();
        if (Objects.equals(ConfirmLock, lock.getLockPassword())) {
            NotePad();
        } else if (!Objects.equals(ConfirmLock, lock.getLockPassword())) {
            WriteCreatedDiary();
        }


    }

    private static void NotePad() {
        String note = scanner.nextLine();
        System.out.println("ENTER DIARY");
        String noteK = scanner.nextLine();

        System.out.println(noteK);
notePad.setNote(noteK);
        System.out.printf("%nYOUR DIARY: %s%nSUCCESSFULLY SAVE TODAY IN %s ", notePad.getNote(), time.getCurrentTime());

        System.out.println("KINDLY LOCK YOUR DIARY");
        String LockDiary = scanner.next();
        if (Objects.equals(LockDiary, lock.getLockPassword())) {
            System.out.println("SUCCESSFULLY SAVE ");
        } else if (!Objects.equals(LockDiary, lock.getLockPassword())) {
            System.out.println("INCORRECT DIGIT");
            NotePad();
        }
    }

    private static void LogInToAccount() {
        System.out.println("USERNAME: ");
        String UserName = scanner.next();
        System.out.println("PASSWORD: ");
        String password = scanner.next();
        if (!Objects.equals(UserName, logIn.getUserName()) && !Objects.equals(password, logIn.getPassword())) {
            IncorrectLogInDetailed();
        } else if (Objects.equals(UserName, logIn.getUserName()) && Objects.equals(password, logIn.getPassword())) {
            System.out.println("YOU SUCCESSFULLY✅ LOGIN TO YOUR ACCOUNT");
            OpenDiarySite();
        } else {
            IncorrectLogInDetailed();
        }

    }

    private static void OpenDiarySite() {
        System.out.println(logIn.getUserName() + "," + "WELCOME TO DIARY SITE");
        System.out.println("""
                PRESS 1 ->> CHECK DIARIES
                PRESS 2 ->> WRITE DIARY
                """);
        int UserInput2 = scanner.nextInt();
        switch (UserInput2) {
            case 1 -> CheckDiaries();
            case 2 -> WriteDiary();
        }
    }

    private static void WriteDiary() {
        WriteCreatedDiary();
    }

    private static void CheckDiaries() {
        System.out.println(diary.getFirstDairy());
        System.out.printf("%30s:%s%n", "DATE", date.getArrangeFirstDate());
        System.out.println(diary.getSecondDiary());
        System.out.printf("%30s:%s%n", "DATE", date.getArrangeSecondDate());
        System.out.println(diary.getThirdDiary());
        System.out.printf("%30s:%s%n", "DATE", date.getArrangeThirdDate());
        System.out.println("""
                PRESS 1->>   DELETE
                PRESS 2 ->>   LOG OUT
                PRESS 3 ->>  EXIT MyDiary SITE
                """);
        int userInput3 = scanner.nextInt();

        switch (userInput3) {
            case 1 -> DeleteDiary();
            case 2 -> LogOut();
            case 3 -> Exit();
        }
    }

    private static void Exit() {
        System.out.println("Bye," + logIn.getUserName() + "\uD83C\uDFC3");
    }


    private static void DeleteDiary() {
        System.out.println("""
                PRESS 1 ->> DELETE ALL
                PRESS 2 ->> DELETE SELECTED DIARY
                """);
        int userInput4 = scanner.nextInt();

        switch (userInput4) {
            case 1 -> DeleteAll();
            case 2 -> DeleteSelectedDiary();
        }

    }

    private static void DeleteSelectedDiary() {
        System.out.println("""
                PRESS 1 ->> DELETE FIRST DIARY
                """ + diary.getFirstDairy() + """
                                
                PRESS 2 ->> DELETE SECOND DIARY
                """ + diary.getSecondDiary() + """
                                
                PRESS 3 ->> DELETE THIRD DIARY
                """ + diary.getThirdDiary() + """ 
                """);
        int UserInput = scanner.nextInt();

        switch (UserInput) {
            case 1 -> DeletedFirstDiary();
            case 2 -> DeleteSecondDiary();
            case 3 -> DeleteThirdDiary();
        }
    }

    private static void DeleteThirdDiary() {
        System.out.println(diary.getFirstDairy());
        System.out.printf("%30s:%s%n", "DATE", date.getArrangeFirstDate());
        System.out.println(diary.getSecondDiary());
        System.out.printf("%30s:%s%n", "DATE", date.getArrangeSecondDate());

    }

    private static void DeleteSecondDiary() {
        System.out.println(diary.getFirstDairy());
        System.out.printf("%30s:%s%n", "DATE", date.getArrangeFirstDate());
        System.out.println(diary.getThirdDiary());
        System.out.printf("%30s:%s%n", "DATE", date.getArrangeThirdDate());
    }

    private static void DeletedFirstDiary() {
        System.out.println(diary.getSecondDiary());
        System.out.printf("%30s:%s%n", "DATE", date.getArrangeSecondDate());
        System.out.println(diary.getThirdDiary());
        System.out.printf("%30s:%s%n", "DATE", date.getArrangeThirdDate());
    }

    private static void DeleteAll() {
        System.out.println(" ALL YOUR DIARY IS SUCCESSFULLY DELETED,\n\tPLEASE NOTE ALL YOUR DIARY IS CURRENTLY EMPTY  ");
        System.out.println("""
                PRESS 1 ->> WRITE DIARY
                PRESS 2 ->> EXIT MyDiary Ste
                """);
        int userInput5 = scanner.nextInt();
        switch (userInput5) {
            case 1 -> WriteDiary();
            case 2 -> Exit();
        }
    }

    private static void LogOut() {
        System.out.println("SUCCESSFULLY LOG OUT");
        RunSite();


    }

    private static void IncorrectLogInDetailed() {
        System.out.println("INCORRECT PASSWORD OR USERNAME\uD83D\uDE25");
        System.out.println("USERNAME:      ");
        String UserName = scanner.next();
        System.out.println("PASSWORD: ");
        String password = scanner.next();
        if (!Objects.equals(UserName, logIn.getUserName()) && !Objects.equals(password, logIn.getPassword())) {
            IncorrectLogInDetailed();
        } else if (Objects.equals(UserName, logIn.getUserName()) && Objects.equals(password, logIn.getPassword())) {
            System.out.println("YOU SUCCESSFULLY LOGIN TO YOUR ACCOUNT");
            OpenDiarySite();
        }

    }


}

