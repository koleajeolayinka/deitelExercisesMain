package AssignmentDen;

public class SevenSegment {
    String[][] Display = {{" ", " ", " ", " "},
                                        {" ", " ", " ", " "},
                                        {" ", " ", " ", " "},
                                        {" ", " ", " ", " "},
                                        {" ", " ", " ", " "}};

    public String[][] getDisplay() {
        return Display;
    }


    public String[][] getA() {
        for (int i = 0; i < Display.length; i++) {
            for (int j = 0; j < 4; j++) {
                if(Display[i][j] == Display[0][0]) Display[0][0] = "#";
                if(Display[i][j] == Display[0][1]) Display[0][1] = "#";
                if(Display[i][j] == Display[0][2]) Display[0][2] = "#";
                if(Display[i][j] == Display[0][3]) Display[0][3] = "#";


            }
            System.out.println();

        }

       return Display;

    }

    public String[][] getB() {
        for (int i = 0; i < Display.length; i++) {
            for (int j = 0; j < 4; j++) {
                if(Display[i][j] == Display[0][3]) Display[0][3] = "#";
                if(Display[i][j] == Display[1][3]) Display[1][3] = "#";
                if(Display[i][j] == Display[2][3]) Display[2][3] = "#";

            }
            System.out.println();

        }

        return Display;
    }

    public String[][] getC() {
        for (int i = 0; i < Display.length; i++) {
            for (int j = 0; j < 4; j++) {
                if(Display[i][j] == Display[2][3]) Display[2][3] = "#";
                if(Display[i][j] == Display[3][3]) Display[3][3] = "#";
                if(Display[i][j] == Display[4][3]) Display[4][3] = "#";

            }
            System.out.println();

        }
        return Display;
    }

    public String[][] getD() {
        for (int i = 0; i < Display.length; i++) {
            for (int j = 0; j < 4; j++) {
                if(Display[i][j] == Display[4][0]) Display[4][0] = "#";
                if(Display[i][j] == Display[4][1]) Display[4][1] = "#";
                if(Display[i][j] == Display[4][2]) Display[4][2] = "#";
                if(Display[i][j] == Display[4][3]) Display[4][3] = "#";

            }
            System.out.println();

        }
        return Display;
    }

    public String[][] getE() {
        for (int i = 0; i < Display.length; i++) {
            for (int j = 0; j < 4; j++) {
                if(Display[i][j] == Display[2][0]) Display[2][0] = "#";
                if(Display[i][j] == Display[3][0]) Display[3][0] = "#";
                if(Display[i][j] == Display[4][0]) Display[4][0] = "#";

            }
            System.out.println();

        }

        return Display;
    }

    public String[][] getF() {
        for (int i = 0; i < Display.length; i++) {
            for (int j = 0; j < 4; j++) {
                if(Display[i][j] == Display[0][0]) Display[0][0] = "#";
                if(Display[i][j] == Display[1][0]) Display[1][0] = "#";
                if(Display[i][j] == Display[2][0]) Display[2][0] = "#";

            }
            System.out.println();

        }
        return Display;
    }
    public String[][] getG() {
        for (int i = 0; i < Display.length; i++) {
            for (int j = 0; j < 4; j++) {
                if(Display[i][j] == Display[2][0]) Display[2][0] = "#";
                if(Display[i][j] == Display[2][1]) Display[2][1] = "#";
                if(Display[i][j] == Display[2][2]) Display[2][2] = "#";
                if(Display[i][j] == Display[2][3]) Display[2][3] = "#";

            }
            System.out.println();
        }

        return Display;
    }

    }


