package Turtle;

import static Turtle.Direction.*;

public class Turtle {

private Pen biro = new Pen();
private  Direction currentDirection = EAST;

public boolean isPenDown(){
    return false;
}
    public boolean isPenUp() {
        return true;
    }

    public void penDown() {
         biro.penDown();
    }
    public void penUp() {
        biro.penUp();
    }

    public Direction getCurrentLocation() {

        return currentDirection;
    }

    public boolean turnRight() {

        if(currentDirection == EAST) currentDirection = SOUTH;
        if(currentDirection == SOUTH) currentDirection = WEST;
        return true;


    }

    public Direction getCurrentDirection(){
        return currentDirection;
    }

    public void turnLeft() {
        if(currentDirection == EAST) face(NORTH);


    }
    public void face(Direction newDirection){
        currentDirection = newDirection;
    }

    public Object getCurrentPosition() {
        return null;
    }

    public void move(int NoOfStep) {
    }

    public void Up() {

        }


    public Object getTurtleMoveUp() {
    return NORTH;
    }
}

