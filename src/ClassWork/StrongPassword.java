package ClassWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {
    public static void main(String[] args) {
        String s = "2bbb";
        int n =  5 ;
        int result = returnMinimumCharactersToMakePassword(s, n);
        System.out.println(result);
    }

    private static int returnMinimumCharactersToMakePassword(String s, int n) {
//        Pattern digitPattern = Pattern.compile()

        int result = 0;
        if (!s.matches("[A-Z]")){
            result++;

        }
        if (!s.matches("[a-z]")){
            result++;

        }
        if (!s.matches("[A-Z]")){
            result++;

        }
        if (!s.matches(("\\W"))){
            result++;
        }

        if (!s.matches(("\\d"))){
            result++;
        }
        if(n+result < 6){
            result += 6 -(n + result);
        }
        return result;
    }
}
