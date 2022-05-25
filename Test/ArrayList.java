import List.ArrayL;
import List.ArrayListItem;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;


public class ArrayList {
    public static int[][] listOfArray = {{20,30,50},
            {20}};
    @Test
    public void Test_Array_Can_Be_Create(){
        ArrayL arrayList = new ArrayL();
        assertNotNull(arrayList);

    }
    @Test
    public void Check_If_Array_List_Is_Not_Empty_Test(){
        ArrayL arrayList = new ArrayL();
        assertTrue( arrayList.CheckArray());

    }


    @Test
    public void Array_List_Can_Add(){
        ArrayL arrayList = new ArrayL();
        assertEquals(100, arrayList.getArrayListAddition(0));

    }
    @Test
    public void Test_Object_Can_Be_Put_In(){
        ArrayL arrayList = new ArrayL();
        assertArrayEquals(new Object[][]{{"q", "q", "q", "q"},
                                         {" ", " ", " ", " "} }, arrayList.CreateObject());

    }
    @Test
    public void Test_One_Object_Can_Added(){
        ArrayListItem arrayList = new ArrayListItem("rice", "Spaghetti", "Beans");
        arrayList.addItem("bread", "egg");
        assertArrayEquals(new Object[][]{{"rice", "Spaghetti", "Beans", "bread", null}}, arrayList.getOneItem());




    }
    @Test
    public void Test_One_Object_Can_Be_Removed(){
        ArrayListItem arrayList = new ArrayListItem("rice", "Spaghetti", "Beans");
        arrayList.addItem("bread","egg");
        arrayList.removeItem(0, 0);
        assertArrayEquals(new Object[][]{{null, "Spaghetti", "Beans", "bread",null}}, arrayList.getRemoveItem());

    }
@Test
    public void Test_Two_Object_Can_Be_Added(){
    ArrayListItem arrayList = new ArrayListItem("rice", "Spaghetti", "Beans");
    arrayList.addItem("bread", "Egg");
    assertArrayEquals(new Object[][]{{"rice", "Spaghetti", "Beans", "bread", "Egg"}}, arrayList.getOneMoreItem());
    }


}
