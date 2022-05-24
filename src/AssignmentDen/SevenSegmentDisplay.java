package AssignmentDen;

public class SevenSegmentDisplay {
   SevenSegment Display = new SevenSegment();

    public static String[][] sevenSegment = {{" ", " ", " ", " "},
                                            {" ", " ", " ", " "},
                                            {" ", " ", " ", " "},
                                            {" ", " ", " ", " "},
                                            {" ", " ", " ", " "}};
    public void setScreen(String pin) {
        if(pin.charAt(7) == '1'){
            if(pin.charAt(0) == '1')
            {Display.getA();}
            if(pin.charAt(1) == '1')
            {Display .getB();}
            if(pin.charAt(2) == '1')
            {Display.getC();}
            if(pin.charAt(3) == '1')
            { Display.getD();}
            if(pin.charAt(4) == '1')
            {Display.getE();}
            if(pin.charAt(5) == '1')
            {Display.getF();}
            if(pin.charAt(6) == '1')
            {Display.getG();}
        }

    }


    public void display() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {

                    System.out.print(sevenSegment[i][j]);
                    System.out.print(' ');
                System.out.println();

            }
            System.out.println();
        }
    }
}
