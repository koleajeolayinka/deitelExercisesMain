package ClassWork;

public class MyStack {
    int[] elements = new int[5];
    private int numberOfElement;


    public boolean ElementEmpty() {
        if(numberOfElement == 0)return true;
        else
            return false;
    }

    public void Push(int element) {
        elements[numberOfElement] = element;
        numberOfElement++;

    }


    public int pop() {
        numberOfElement --;
        return elements[numberOfElement];
    }
}
