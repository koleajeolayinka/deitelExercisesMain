package Kata;

public class Quotient {
    public static void main(String[] args) {
        int total = 0;
// total even integers from 2 through 20
        for (int number = 1; number <= 30; number += 3) {
            total += number;
            if (number == 15) {
                continue;

            }
            System.out.println(number ) ;
        }
        System.out.printf("Sum is %d%n", total);
        int counter = 1;
        do {
            System.out.printf("%d ", counter);

            counter+= 2;
        }

        while (counter <= 10);

        for (int count = 2; count <= 10; count++) { // loop 10 times
            if (count == 5) {
                continue; // skip remaining code in loop body if count is 5
            }
            System.out.printf("%d ", count);
        }
        System.out.printf("%nUsed continue to skip printing 5%n");
    }
}
