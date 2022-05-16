package Chapter5;
//5.12 (Integers Divisible by 3) Write an application that calculates the sum of those integers between
//        1 and 30 that are divisible by 3.
public class IntegersDivisibleBy3 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 3; i <= 30; i+=3) {
            System.out.println(i);
total+= i;
        }
        System.out.println("Total Integer Divisible By 3 is " + total);

    }
}
