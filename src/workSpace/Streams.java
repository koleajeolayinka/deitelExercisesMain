package workSpace;

import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
//        IntStream oS = IntStream.range(1, 10);
//        int add = oS.map(x -> x * 2).sum();
//        System.out.println(add);
        IntStream Os = IntStream.rangeClosed(1, 20);
        int SumOfOddNumber = Os.filter(x -> x % 2 == 1).map(x -> x * x * x).sum();
        System.out.println(SumOfOddNumber);
    }
}
