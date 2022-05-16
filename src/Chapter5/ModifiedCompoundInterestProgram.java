package Chapter5;
//5.14 (Modified Compound-Interest Program) Modify the compound-interest application of
//        Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
//        vary the interest rate.
public class ModifiedCompoundInterestProgram {
    public static void main(String[] args) {
        runModifiedCompoundInterestProgram();


    }

    private static void runModifiedCompoundInterestProgram() {
        for (int i = 0; i < 6; i++) {

            System.out.println("INTEREST RATE IS " + i + "%");

        }
    }
}
