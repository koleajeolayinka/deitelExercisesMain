package KataClass.ChapterEight;

import ChapterEight.HugeIntegerClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.testng.AssertJUnit.assertEquals;


public class HugeIntegerTest {
    private HugeIntegerClass hugeInt;
    @BeforeEach
    public void setup() {
        hugeInt = new HugeIntegerClass();
    }

    @Test
    public void Test_Huge_Integer_Can_Be_Created(){
        Assertions.assertNotNull(hugeInt);
    }

    @Test
    public void Create_Huge_Integer_Of_40_Element(){
        hugeInt.set40Element();
        assertArrayEquals(new int[][]
                { { }, { }, { }, { }, { }, { }, { }, { }, { }, { },
                { }, { }, { }, { }, { }, { }, { }, { }, { }, { },
                { }, { }, { }, { }, { }, { }, { }, { }, { }, { },
                { }, { }, { }, { }, { }, { }, { }, { }, { }, { } }, hugeInt.getElement());
    }
//
//    @Test
//    public void Test_Each_Element_Can_Store_Integer_As_Large_As_40(){
//        hugeInt.setInteger("1111111111111111111111111111111111111111");
//        Assertions.assertEquals(Integer.parseInt("1111111111111111", hugeInt.getIntegerN());
//
//    }
}
