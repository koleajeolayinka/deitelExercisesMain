package AssignmentDen;

import AssignmentDen.SevenSegmentDisplay;

public class SevenSegmentSession {
    public static void main(String[] args) {
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
        sevenSegmentDisplay.setScreen("11011011");
        sevenSegmentDisplay.display();
    }
}
