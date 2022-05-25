import AssignmentDen.SevenSegment;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class SevenSegmentTest {
    public static String[][] sevenSegment = {{" ", " ", " ", " "},
                                            {" ", " ", " ", " "},
                                            {" ", " ", " ", " "},
                                            {" ", " ", " ", " "},
                                            {" ", " ", " ", " "}};
    @Test
    public void Test_Seven_Segment_Can_Be_Created(){
        SevenSegment display = new SevenSegment();
        assertNotNull(display);
    }
    @Test
    public void Test_Seven_Segment_Can_Be_Display(){

        SevenSegment display = new SevenSegment();
        assertArrayEquals(sevenSegment, display.getDisplay());


    }
    @Test
    public void Test_Seven_Segment_Set_A(){
        SevenSegment display = new SevenSegment();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                                        {" ", " ", " ", " "},
                                        {" ", " ", " ", " "},
                                        {" ", " ", " ", " "},
                                        {" ", " ", " ", " "}}, display.getA());
    }
    @Test
    public void Test_Seven_Segment_Set_B(){
        SevenSegment display = new SevenSegment();
        assertArrayEquals(new String[][]{{" ", " ", " ", "#"},
                                        {" ", " ", " ", "#"},
                                        {" ", " ", " ", "#"},
                                        {" ", " ", " ", " "},
                                        {" ", " ", " ", " "}}, display.getB());
    }
    @Test
    public void Test_Seven_Segment_Set_C(){
        SevenSegment display = new SevenSegment();
        assertArrayEquals(new String[][]{{" ", " ", " ", " "},
                                        {" ", " ", " ", " "},
                                        {" ", " ", " ", "#"},
                                        {" ", " ", " ", "#"},
                                        {" ", " ", " ", "#"}}, display.getC());
    }
    @Test
    public void Test_Seven_Segment_Set_D(){
        SevenSegment display = new SevenSegment();
        assertArrayEquals(new String[][]{{" ", " ", " ", " "},
                                        {" ", " ", " ", " "},
                                        {" ", " ", " ", " "},
                                        {" ", " ", " ", " "},
                                        {"#", "#", "#", "#"}}, display.getD());
    }
    @Test
    public void Test_Seven_Segment_Set_E() {
        SevenSegment display = new SevenSegment();
        assertArrayEquals(new String[][]{{" ", " ", " ", " "},
                                        {" ", " ", " ", " "},
                                        {"#", " ", " ", " "},
                                        {"#", " ", " ", " "},
                                        {"#", " ", " ", " "}}, display.getE());
    }
    @Test
    public void Test_Seven_Segment_Set_F() {
        SevenSegment display = new SevenSegment();
        assertArrayEquals(new String[][]{{"#", " ", " ", " "},
                                        {"#", " ", " ", " "},
                                        {"#", " ", " ", " "},
                                        {" ", " ", " ", " "},
                                        {" ", " ", " ", " "}}, display.getF());
    }
    @Test
    public void Test_Seven_Segment_Set_G() {
        SevenSegment display = new SevenSegment();
        assertArrayEquals(new String[][]{{" ", " ", " ", " "},
                                        {" ", " ", " ", " "},
                                        {"#", "#", "#", "#"},
                                        {" ", " ", " ", " "},
                                        {" ", " ", " ", " "}}, display.getG());
    }
@Test
    public void Test_Seven_Segment_Can_Turn_On(){
        SevenSegment display = new SevenSegment();

}
    }
