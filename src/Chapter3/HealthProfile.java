package Chapter3;

public class HealthProfile {
    private final String FirstName;
    private final String SecondName;
    private final String Gender;
    private final double HeightInInches;
    private final int DateOfBirth;
    private final int WeightInPound;




    public HealthProfile(String firstName, String secondName, String gender, int dateOfBirth, double HeightInInches, int WeightInPound) {
        this.FirstName = firstName;
        this.SecondName = secondName;
        this.Gender = gender;
        this.DateOfBirth = dateOfBirth;
        this.HeightInInches = HeightInInches;
        this.WeightInPound = WeightInPound;

    }



    public void setFirstName() {
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setSecondName() {
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setGender() {
    }

    public String getGender() {
        if (Gender != "male" && Gender != "female" && Gender != "Female" && Gender != "Male" && Gender != "MALE" && Gender != "female"  ) {
            System.out.println("NOT SUCCESSFULLY INPUT");
        } else
            return Gender;
        return getGender();

    }

    public void setDateOfBirth() {
    }

    public int getDateOfBirth() {
        int first = DateOfBirth / 10000000;
        int second = (DateOfBirth % 10000000) / 1000000;
        int third = (DateOfBirth % 1000000) / 100000;
        int forth = (DateOfBirth % 100000) / 10000;
        int fifth = (DateOfBirth % 10000) / 1000;
        int sixth = (DateOfBirth % 1000) / 100;
        int seventh = (DateOfBirth % 100) / 10;
        int eighth = (DateOfBirth % 10);


        if (DateOfBirth >= 10000000 && DateOfBirth <= 100000000) {

            System.out.println(first + "" + second + "|" + third + "" + forth + "|" + fifth + "" + sixth + "" + seventh + "" + eighth);
        } else

            System.out.println(third + "|" + forth + "|" + fifth + "" + sixth + "" + seventh + "" + eighth);


        return DateOfBirth;
    }

    public void setAge() {
    }

    public int getAge() {
        int first = (DateOfBirth % 10000) / 1000;
        int second = (DateOfBirth % 1000) / 100;
        int third = (DateOfBirth % 100) / 10;
        int forth = (DateOfBirth % 10);
        int year = Integer.parseInt(first + "" + second + "" + third + "" + forth);
        return 2022 - year;
    }

    public void setHeightInInches() {
    }

    public double getHeightInInches() {
        return HeightInInches;
    }

    public int getWeightInInches() {
        return WeightInPound;
    }

    public void setWeightInPound() {
    }

    public void setBodyMassIndex() {
    }

    public int getBodyMassIndex() {
        int BMI = (int) ((WeightInPound * 703) / (HeightInInches * HeightInInches));
        return BMI;
    }

    public void setLineBetweenDate() {
    }

    public String getLineBetweenDate() {
        int first = DateOfBirth / 10000000;
        int second = (DateOfBirth % 10000000) / 1000000;
        int third = (DateOfBirth % 1000000) / 100000;
        int forth = (DateOfBirth % 100000) / 10000;
        int fifth = (DateOfBirth % 10000) / 1000;
        int sixth = (DateOfBirth % 1000) / 100;
        int seventh = (DateOfBirth % 100) / 10;
        int eighth = (DateOfBirth % 10);

        String line = (first + "" + second + "|" + third + "" + forth + "|" + fifth + "" + sixth + "" + seventh + "" + eighth);
        return  line;
    }
}
