package DiaryApplication;

public class DiaryDate {

    private final int FirstDate;
    private final int SecondDate;
    private final int ThirdDate;

    public DiaryDate(int firstDate, int secondDte, int thirdDate) {
        this.FirstDate = firstDate;
        this.SecondDate = secondDte;
        this.ThirdDate = thirdDate;
    }


    public void setArrangeFirstDate() {
    }

    public String getArrangeFirstDate() {
        int first = FirstDate / 10_000_000;
        int second = (FirstDate % 10_000_000) / 1000000;
        int third = (FirstDate % 10_000_00) / 100000;
        int forth = (FirstDate % 100_000) / 10000;
        int fifth = (FirstDate % 10000) / 1000;
        int sixth = (FirstDate % 1000) / 100;
        int seventh = (FirstDate % 100) / 10;
        int eight = (FirstDate % 10) ;

        return first + "" + second + "|" + third + "" +forth + "|" + fifth + "" + sixth + "" + seventh + "" + eight;
    }

    public void setFirstDate() {
    }

    public void setSecondDate() {
    }

    public void setThirdDate() {
    }

    public int getFirstDate() {
        return FirstDate;
    }

    public int getSecondDate() {
        return SecondDate;
    }

    public int getThirdDate() {
        return ThirdDate;
    }

    public void setArrangeSecondDate() {
    }

    public void setArrangeThirdDate() {
    }

    public String getArrangeSecondDate() {
        int first = FirstDate / 10_000000;
        int second = (FirstDate % 10000_000) / 1000000;
        int third = (FirstDate % 10000_00) / 100000;
        int forth = (FirstDate % 100_000) / 1_0000;
        int fifth = (FirstDate % 10000) / 1_000;
        int sixth = (FirstDate % 1_000) / 1_00;
        int seventh = (FirstDate % 100) / 10;
        int eight = (FirstDate % 10) ;

        return first + "" + second + "|" + third + "" +forth + "|" + fifth + "" + sixth + "" + seventh + "" + eight;
    }

    public String getArrangeThirdDate() {
        int first = FirstDate / 10_000000;
        int second = (FirstDate % 10_000_000) / 1000_000;
        int third = (FirstDate % 10_000_00) / 100_000;
        int forth = (FirstDate % 100_000) / 10000;
        int fifth = (FirstDate % 10_000) / 1000;
        int sixth = (FirstDate % 1_000) / 100;
        int seventh = (FirstDate % 100) / 10;
        int eight = (FirstDate % 10) ;

        return first + "" + second + "|" + third + "" +forth + "|" + fifth + "" + sixth + "" + seventh + "" + eight;
    }
}
