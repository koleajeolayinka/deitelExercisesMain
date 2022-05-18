package Turtle;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class TestTurtle {
    @Test public void TestTurtleExist(){
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }
    @Test public void TestPenIsUp(){
        Turtle turtle = new Turtle();
        boolean pen = turtle.getPenIsUp();
        assertTrue(pen);
    }
    @Test public void TestPenIsDown(){
        Turtle turtle = new Turtle();
        boolean pen = turtle.getPenIsDown();
        assertFalse(pen);
    }

}
