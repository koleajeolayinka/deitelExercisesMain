package List;

public class ArrayL {
    public static int[][] listOfArray = {{20,30,50}};
    public boolean CheckArray;
    Object[][] ArrayList= {{" ", " ", " ", " "},
                          {" ", " ", " ", " "} };
    public int getArrayListAddition(int row) {
        int add = 0;
        for (int i = 0; i < listOfArray.length; i++) {
            for (int j = 0; j < 3 ; j++) {
                add = add + listOfArray[i][j];


            }

        }
return add;
    }

    public boolean CheckArray() {
        return true;
    }

    public Object[][] CreateObject() {
        for (int i = 0; i < listOfArray.length; i++) {
            for (int j = 0; j < 4; j++) {
                if(ArrayList[i][j] == ArrayList[0][0]) ArrayList[0][0] = "q";
                if(ArrayList[i][j] == ArrayList[0][1]) ArrayList[0][1] = "q";
                if(ArrayList[i][j] == ArrayList[0][2]) ArrayList[0][2] = "q";
                if(ArrayList[i][j] == ArrayList[0][3]) ArrayList[0][3] = "q";



            }

        }



        return ArrayList;

    }
}
