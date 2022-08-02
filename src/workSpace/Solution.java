package workSpace;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;

class HrTest {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger bigInteger = new BigInteger(String.valueOf(n));
//        BigInteger bigInteger1 =


        int factorial = 1;
        for (n = 1; n <= bigInteger.longValueExact(); n++) {
            factorial = factorial * n;
        }
        System.out.println(factorial);

    }
//    public

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        HrTest.extraLongFactorials((n));

        bufferedReader.close();
    }
}
