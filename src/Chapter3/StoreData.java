package Chapter3;

public class StoreData {

    public static String FirstName;
    public static String SecondName;
    private String Gender;
    private int DateOfBirth;
    private int Age;
    private double HeightInInches;
    private int WeightInPound;

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.SecondName = secondName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public String getGender() {

        return Gender;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.DateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        int first = (DateOfBirth) / 10_000_000;
        int second = (DateOfBirth % 10_000_000) / 1_000_000;
        int third = (DateOfBirth % 1_000_000) / 100_000;
        int forth = (DateOfBirth % 100_000) / 10_000;
        int fifth = (DateOfBirth % 10_000) / 1000;
        int sixth = (DateOfBirth % 1_000) / 100;
        int seventh = (DateOfBirth % 100) / 10;
        int eighth = (DateOfBirth % 10);

        String line = (first + "" + second + "|" + third + "" + forth + "|" + fifth + "" + sixth + "" + seventh + "" + eighth);
        return line;
    }

    public void setAge(int DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public int getAge() {
        int first = (DateOfBirth % 10_000) / 1000;
        int second = (DateOfBirth % 1_000) / 100;
        int third = (DateOfBirth % 100) / 10;
        int forth = (DateOfBirth % 10);
        int year = Integer.parseInt(first + "" + second + "" + third + "" + forth);
        return 2022 - year;
    }

    public void setHeightInInches(double heightInInches) {
        this.HeightInInches = heightInInches;
    }

    public void setWeightInPound(int weightInPound) {
        this.WeightInPound = weightInPound;
    }

    public int getBodyMassIndex() {
        int BMI = (int) ((WeightInPound * 703) / (HeightInInches * HeightInInches));
        return BMI;
    }
}