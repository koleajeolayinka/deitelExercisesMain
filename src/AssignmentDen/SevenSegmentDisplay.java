package AssignmentDen;

public class SevenSegmentDisplay {
    public static String[][] sevenSegment = {{"#", "#", "#", "#"},
                                             {"#", "#", "#", "#"},
                                             {"#", "#", "#", "#"},
                                             {"#", "#", "#", "#"},
                                             {"#", "#", "#", "#"}};
    public void setScreen(String pin) {
        if(pin.charAt(7) == '1'){
            if(pin.charAt(0) == '1')
                PrintA();
            if(pin.charAt(1) == '1')
                PrintB();
            if(pin.charAt(2) == '1')
                PrintC();
            if(pin.charAt(3) == '1')
                PrintD();
            if(pin.charAt(4) == '1')
                PrintE();
            if(pin.charAt(5) == '1')
                PrintF();
            if(pin.charAt(6) == '1')
                PrintG();
        }

    }

    private void PrintG() {
        System.out.println(sevenSegment[2][0] + " " + sevenSegment[2][1] + " " + sevenSegment[2][2] + " " + sevenSegment[2][3]);

    }

    private void PrintF() {
        System.out.println(sevenSegment[0][0] + " " + sevenSegment[1][0] + " " + sevenSegment[2][0] );

    }

    private void PrintE() {
        System.out.println(sevenSegment[2][0] + " " + sevenSegment[3][0] + " " + sevenSegment[4][0]);

    }

    private void PrintD() {
        System.out.println(sevenSegment[4][0] + " " + sevenSegment[4][1] + " " + sevenSegment[4][2] + " " + sevenSegment[4][3]);

    }

    private void PrintC() {
        System.out.println(sevenSegment[2][3] + " " + sevenSegment[3][3] + " " + sevenSegment[4][3]);

    }

    private void PrintB() {
        System.out.println(sevenSegment[0][3] + " " + sevenSegment[1][3] + " " + sevenSegment[2][3]);

    }

    private void PrintA() {
        System.out.println(sevenSegment[0][0] + " " + sevenSegment[0][1] + " " + sevenSegment[0][2] + " " + sevenSegment[0][3]);
    }

    public void display() {
        for (int i = 0; i < sevenSegment.length; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    System.out.print(sevenSegment[i][j]);
                    System.out.print(' ');
                }
                catch (ArrayIndexOutOfBoundsException ignored){

                }
            }
            System.out.println();
        }
    }
}
