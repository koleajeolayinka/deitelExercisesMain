package KataClass.Chapter6;

import ChapterSix.DivisibleBy5.DivisibleBy5;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class Divisible {
    private DivisibleBy5 divisibleBy5;
    @BeforeEach
    public void setUp(){
         divisibleBy5 = new DivisibleBy5();

    }

    @Test
    public void testDivisibleBy5CanBeCreated(){
        assertNotNull(divisibleBy5);

    }
    @Test
    public void TestSpecificNumberIsDivisibleBy5(){
        divisibleBy5.setNumber(50);
        assertEquals(true, divisibleBy5.checkNumberSetDivisibleBy5());

    }

}
