package KataClass.Chapter3;

import Chapter3.Clock;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ClockApp {
    @Test
    public void Clock() {
        Clock clock = new Clock(23, 59, 59);
        assertEquals(23, clock.getHour());
        assertEquals(59, Clock.getMinute());
        assertEquals(59, Clock.getSecond());

    }

    @Test
    public void CheckExceedValueForHour() {
        Clock clock = new Clock(24, 60, 60);
        assertEquals("hh:mm:ss", clock.getHourExceedValue());
        assertEquals("hh:mm:ss", clock.getMinuteExceedValue());
        assertEquals("hh:mm:ss", clock.getMinuteExceedValue());

    }

    @Test
    public void CheckExceedValueForHourGandS() {
        Clock clock = new Clock(25,4,4);
        assertEquals(25, clock.getHourExceedValue());

    }
}
