package Chapter7;

public class barChart {
    public static int[] arrays = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
    public static void main(String[] args) {
        BarChart();
    }

    private static void BarChart() {
        System.out.println("Grade distribution");
        for (int i = 0; i < arrays.length; i++) {
            if(i == 10){
                System.out.printf("%5d:", 100);
            }
            else {
                System.out.printf("%02d-%02d:", i * 10, i * 10 + 9);
            }
            for (int j = 0; j < arrays[i]; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
