package Turtle;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static java.awt.BorderLayout.NORTH;
import static org.testng.AssertJUnit.*;

public class TestTurtle {
    @Test public void TestTurtleExist(){
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }
    @Test public void TestPenIsUp(){
        Turtle turtle = new Turtle();
        boolean pen = turtle.isPenDown();
        assertFalse(pen);
    }
    @Test public void TestPenIsDown(){
        Turtle turtle = new Turtle();
        boolean pen = turtle.isPenDown();
        assertFalse(pen);
    }
    @Test
    public void TestTurtleCanMove(){
        Turtle turtle = new Turtle();

    }

    @Test
    public void turtleFaceEastByDefault() {
        Turtle turtle = new Turtle();
        assertEquals(Direction.EAST, turtle.getCurrentLocation());
}
@Test public void turtleCanTurnRightFromEastTest(){
    Turtle turtle = new Turtle();
    turtle.turnRight();
    assertEquals(Direction.SOUTH, turtle.getCurrentLocation());

}
@Test public void turtleCanTurnRightFromSouthTest(){
        Turtle turtle =new Turtle();
        turtle.turnRight();
        turtle.turnRight();
    assertEquals(Direction.WEST, turtle.getCurrentLocation());

}
@DisplayName("WHEN THE TURTLE IS FACING EAST, TURNING LEFT CHANGE DIRECTION TO NORTH")
// TODO AND TURN RIGHT FACING WEST and NORTH

    @Test public void turtleCanTurnLeftFacingEast(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
    assertSame(NORTH, turtle.getCurrentDirection());


}
@Test public void turtleCanMoveForwardFacingEastTest(){
    Turtle turtle = new Turtle();
    turtle.move(5);
    assertEquals(new Position(0,2), turtle.getCurrentPosition());
}
}
