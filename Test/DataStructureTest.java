import ClassWork.ArrayL;
import ClassWork.ArrayListItem;
import ClassWork.ArrayListSet;
import ClassWork.MyStack;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;


public class DataStructureTest {
    public static int[][] listOfArray = {{20, 30, 50},
            {20}};

    @Test
    public void Test_Array_Can_Be_Create() {
        ArrayL arrayList = new ArrayL();
        assertNotNull(arrayList);

    }

    @Test
    public void Check_If_Array_List_Is_Not_Empty_Test() {
        ArrayL arrayList = new ArrayL();
        assertTrue(arrayList.CheckArray());

    }


    @Test
    public void Array_List_Can_Add() {
        ArrayL arrayList = new ArrayL();
        assertEquals(100, arrayList.getArrayListAddition(0));

    }

    @Test
    public void Test_Object_Can_Be_Put_In() {
        ArrayL arrayList = new ArrayL();
        assertArrayEquals(new Object[][]{{"q", "q", "q", "q"},
                                {" ", " ", " ", " "}}, arrayList.CreateObject());

    }

    @Test
    public void Test_One_Object_Can_Added() {
        ArrayListItem arrayList = new ArrayListItem("rice", "Spaghetti", "Beans");
        arrayList.addItem("bread", "egg");
        assertArrayEquals(new Object[][]{{"rice", "Spaghetti", "Beans", "bread", null}}, arrayList.getOneItem());


    }

    @Test
    public void Test_One_Object_Can_Be_Removed() {
        ArrayListItem arrayList = new ArrayListItem("rice", "Spaghetti", "Beans");
        arrayList.addItem("bread", "egg");
        arrayList.removeItem(0, 0);
        assertArrayEquals(new Object[][]{{null, "Spaghetti", "Beans", "bread", null}}, arrayList.getRemoveItem());

    }

    @Test
    public void Test_Two_Object_Can_Be_Added() {
        ArrayListItem arrayList = new ArrayListItem("rice", "Spaghetti", "Beans");
        arrayList.addItem("bread", "Egg");
        assertArrayEquals(new Object[][]{{"rice", "Spaghetti", "Beans", "bread", "Egg"}}, arrayList.getOneMoreItem());
    }


    @Test
    public void Test_Set_Can_Be_Created() {
        ArrayListSet set = new ArrayListSet();
        assertNotNull(set);

    }

    @Test
    public void Test_Two_Set_Can_Be_Created() {
        ArrayListSet arraySet = new ArrayListSet();
        arraySet.SetFirstSet(2, 4, 3, 2, 5);
        arraySet.SetSecondSet(2, 2, 1, 5, 5);
        assertArrayEquals(new Object[]{2, 4, 3, 2, 5}, arraySet.getFirstSet());
        assertArrayEquals(new Object[]{2, 2, 1, 5, 5}, arraySet.getSecondSet());


    }

    @Test
    public void Test_The_Different_Is_Correct() {
        ArrayListSet arraySet = new ArrayListSet();
        arraySet.SetFirstSet(2, 4, 3, 2, 5);
        arraySet.SetSecondSet(2, 2, 1, 5, 5);
        arraySet.SetDifferent(1, 4, 3);
        assertArrayEquals(new Object[]{1, 4, 3}, arraySet.getDifferent());
    }
    @Test
    public void Add_The_Set_Different(){
        ArrayListSet arraySet = new ArrayListSet();
        arraySet.SetFirstSet(9, 4, 3, 2, 5);
        arraySet.SetSecondSet(2, 2, 1, 5, 5);
        arraySet.SetDifferent(1, 4, 3);
        arraySet.SetDifferentAddition(8);
        assertArrayEquals(new Object[]{1, 4, 3}, arraySet.getDifferent());
        assertEquals(8, arraySet.getDifferentAddition());



    }
    @Test
    public void Test_If_Stack_Can_Be_Created(){
        MyStack stack = new MyStack();
        assertNotNull(stack);

    }

    @Test
    public void Test_If_Stack_Can_Pop(){
        MyStack stack = new MyStack();
//        stack.Pop();

    }



}





