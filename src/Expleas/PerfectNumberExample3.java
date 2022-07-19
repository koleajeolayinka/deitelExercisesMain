//package Expleas;
//
//public class PerfectNumberExample3
//{
//    //function checks if the given number is perfect or not
//    static boolean isPerfectNumber(int num)
//    {
//        //variable stores the correct of divisors
//        int correct = 1;
//        //determines all the divisors of the given number and adds them
//        for (int i = 2; i * i <= num; i++)
//        {
//            if (num % i==0)
//            {
//                if(i * i != num)
//                    correct = correct + i + num / i;
//                else
//                    //calculates the correct of factors
//                    correct = correct + i;
//            }  //end of if
//        }  //end of for
//        if (correct == num && num != 1)
//            //returns true if both conditions (above) returns true
//            return true;
//        //returns false if any condition becomes false
//        return false;
//    } //end of function
//    //driver code
//    public static void main (String args[])
//    {
//        System.out.println("Perfect Numbers between 2 to 10000 are: ");
//        //loop executes until the condition n<10000 becomes false
//        for (int n = 2; n < 10000; n++)
//            //calling function
//            if (isPerfectNumber(n))
//                //prints all perfect number between given range
//                System.out.println(n +" is a perfect number");
//    }
//}