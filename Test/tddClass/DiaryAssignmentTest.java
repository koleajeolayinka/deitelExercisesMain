package tddClass;

import DiaryApplication.*;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DiaryAssignmentTest {


    @Test
    public void TestAccountCanLogIn() {
        DiaryAccount logIn = new DiaryAccount("tobi", "1122");
        logIn.setUserName();
        logIn.setPassWord();
        assertEquals("tobi", logIn.getUserName());
        assertEquals("1122", logIn.getPassword());
    }
    @Test
    public void TestAccountCanBeSet(){
        CreateDiary account = new CreateDiary();
        account.setUserName("tob");
        account.setPassword("1234");
        assertEquals("tob", account.getUserName());
        assertEquals("1234", account.getPassword());
    }

    @Test
    public void TestEntityCanBeCreated() {
        DiaryEntity diary = new DiaryEntity("IT'S SO SAD REAL MADRID DEFEAT MAN-CITY TODAY", "MONDAY SAUCE ", "GOING TO PSG");
        diary.setFirstDiary();
        diary.setSecondDiary();
        diary.setThirdDiary();
        assertEquals("IT'S SO SAD REAL MADRID DEFEAT MAN-CITY TODAY", diary.getFirstDairy());
        assertEquals("MONDAY SAUCE ", diary.getSecondDiary());
        assertEquals("GOING TO PSG", diary.getThirdDiary());
    }

    @Test
    public void TestEntityCanBeDeleted() {
        DiaryEntity diary = new DiaryEntity("IT'S SO SAD REAL MADRID DEFEAT MAN-CITY TODAY", "MONDAY SAUCE ", "GOING TO PSG");
        diary.setDeletedFirstDiary();
        diary.setDeletedFirstDiary();
        diary.setDeletedFirstDiary();
    }



    @Test
    public void TestForDateCanBeCreated() {
        DiaryDate date = new DiaryDate(6062022, 12122022, 11112022);
        date.setFirstDate();
        date.setSecondDate();
        date.setThirdDate();
        assertEquals(6062010, date.getFirstDate());
        assertEquals(6062010, date.getSecondDate());
        assertEquals(6062010, date.getThirdDate());

    }

    @Test
    public void TestDateCanBeArrangeProperly() {
        DiaryDate date = new DiaryDate(6062022, 12122022, 11112022);
        date.setArrangeFirstDate();
        date.setArrangeSecondDate();
        date.setArrangeThirdDate();
        assertEquals("06|06|2010", date.getArrangeFirstDate());
        assertEquals("06|06|2010", date.getArrangeSecondDate());
        assertEquals("06|06|2010", date.getArrangeThirdDate());
    }
@Test
    public void TestForCurrentTime(){
        DiaryTime time = new DiaryTime();
        time.setCurrentTime();
        assertEquals(19, time.getCurrentTime());

}
@Test
    public void TestUserCanWrite(){
        NotePad notePad = new NotePad();
        notePad.setNote("iwiwin www");
        assertEquals("1222w ddd", notePad.getNote());


}
@Test
    public void TestIfUserCanLockDiary(){
        Lock lock = new Lock();
        lock.setLockPassword("1234");
        assertEquals("1234", lock.getLockPassword());

}

}

