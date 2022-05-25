package List;

import java.util.Objects;

public class ArrayListItem {
    public final String FoodItem0;
    public final String FoodItem1;
    public final String FoodItem2;
    public String[][] array = {{null, null, null, null, null}};
    String Object;
    public int RemoveObjectRow;
    public int RemoveObjectColum;
     String Object2;

    public ArrayListItem(String foodItem0, String foodItem1, String foodItem2) {
        this.FoodItem0 = foodItem0;
        this.FoodItem1 = foodItem1;
        this.FoodItem2 = foodItem2;

    }

    public void addItem(String Object, String Object2) {
        this.Object = Object;
        this.Object2 = Object2;


    }

    public java.lang.Object[] getOneItem() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (array[i][j] == array[0][0]) array[0][0] = FoodItem0;
                if (array[i][j] == array[0][1]) array[0][1] = FoodItem1;
                if (array[i][j] == array[0][2]) array[0][2] = FoodItem2;
                if (array[i][j] == array[0][3]) array[0][3] = Object;


            }

        }


        return array;
    }

    public void removeItem(int row, int column) {
        this.RemoveObjectRow = row;
        this.RemoveObjectColum = column;


    }

    public Object[][] getRemoveItem() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (RemoveObjectRow == 0 && RemoveObjectColum == 0) {
                    if (Objects.equals(array[i][j], array[0][0])) array[0][0] = array[0][0];
                    if (Objects.equals(array[i][j], array[0][1])) array[0][1] = FoodItem1;
                    if (Objects.equals(array[i][j], array[0][2])) array[0][2] = FoodItem2;
                    if (Objects.equals(array[i][j], array[0][3])) array[0][3] = Object;
                } else if (RemoveObjectRow == 0 && RemoveObjectColum == 1) {
                    if (Objects.equals(array[i][j], array[0][0])) array[0][0] = FoodItem0;
                    if (Objects.equals(array[i][j], array[0][1])) array[0][1] = array[0][1];
                    if (Objects.equals(array[i][j], array[0][2])) array[0][2] = FoodItem2;
                    if (Objects.equals(array[i][j], array[0][3])) array[0][3] = Object;

                } else if (RemoveObjectRow == 0 && RemoveObjectColum == 2) {
                    if (Objects.equals(array[i][j], array[0][0])) array[0][0] = FoodItem0;
                    if (Objects.equals(array[i][j], array[0][1])) array[0][1] = FoodItem1;
                    if (Objects.equals(array[i][j], array[0][2])) array[0][2] = array[0][2];
                    if (Objects.equals(array[i][j], array[0][3])) array[0][3] = Object;

                } else if (RemoveObjectRow == 0 && RemoveObjectColum == 3) {
                    if (Objects.equals(array[i][j], array[0][0])) array[0][0] = FoodItem0;
                    if (Objects.equals(array[i][j], array[0][1])) array[0][1] = FoodItem1;
                    if (Objects.equals(array[i][j], array[0][2])) array[0][2] = FoodItem2;
                    if (Objects.equals(array[i][j], array[0][3])) array[0][3] = null;

                }

            }

        }
        return array;
    }

    public Object[] getOneMoreItem() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (array[i][j] == array[0][0]) array[0][0] = FoodItem0;
                if (array[i][j] == array[0][1]) array[0][1] = FoodItem1;
                if (array[i][j] == array[0][2]) array[0][2] = FoodItem2;
                if (array[i][j] == array[0][3]) array[0][3] = Object;
                if (array[i][j] == array[0][4]) array[0][4] = Object2;


            }
        }
        return array;

    }
}