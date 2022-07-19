package ChapterSix.DivisibleBy5;

public class DivisibleBy5 {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean checkNumberSetDivisibleBy5() {
        if (number % 5 == 0) {
            return true;

        }else
            return false;
    }
}
