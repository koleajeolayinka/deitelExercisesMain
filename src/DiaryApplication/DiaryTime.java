package DiaryApplication;

public class DiaryTime {
    public void setCurrentTime() {
    }


    public String getCurrentTime() {
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinute = totalSeconds / 60;

        long currentMinute = totalMinute % 60;

        long totalHours = totalMinute / 60;

        long currentHour = totalHours % 24 ;
        long hour = currentHour + 1;

        return hour + ":"
                + currentMinute + ":" + currentSecond + " GMT";
    }
}
