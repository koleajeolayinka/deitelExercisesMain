package KataClass.Chapter3;

import Chapter3.HealthProfile;
import Chapter3.StoreData;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

//3.17 (Computerization of Health Records) A health-care issue that has been in the news lately is
//        the computerization of health records. This possibility is being approached cautiously because of
//        sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
//        Computerizing health records could make it easier for patients to share their health profiles and his-
//        tories among their various health-care professionals. This could improve the quality of health care,
//        help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
//        save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attri-
//        butes should include the person’s first name, last name, gender, date of birth (consisting of separate
//        attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
//should have a constructor that receives this data. For each attribute, provide set and get methods.
//        The class also should include methods that calculate and return the user’s age in years, maximum
//        heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
//        Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of
//class HealthProfile for that person and prints the information from that object—including the per-
//        son’s first name, last name, gender, date of birth, height and weight—then calculates and prints the
//        person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
//        the BMI values chart from Exercise 2.33.
public class HealthRecords {

    @Test
    public void NameData() {
        HealthProfile data = new HealthProfile("tobi", "kole", "male", 662022, 6.2, 200);
        data.setFirstName();
        data.setSecondName();
        data.setGender();
        assertEquals("tobi", data.getFirstName());
        assertEquals("kole", data.getSecondName());

    }

    @Test
    public void CheckGenderIsInputCorrectly() {
        HealthProfile data = new HealthProfile("tobi", "kole", "MALE", 662022, 6.2, 200);
        data.setGender();
        assertEquals("MALE", data.getGender());
    }

    @Test
    public void arrangeDateOfBirth() {
        HealthProfile data = new HealthProfile("tobi", "male", "male", 12122022, 6.2, 200);
        data.setDateOfBirth();
        assertEquals(12122022, data.getDateOfBirth());
        data.setLineBetweenDate();
        assertEquals("12|12|2022", data.getLineBetweenDate());
    }

    @Test
    public void testCurrentAge() {
        HealthProfile data = new HealthProfile("tobi", "kole", "Male", 12122005, 6.2, 200);
        data.setAge();
        assertEquals(17, data.getAge());
    }

    @Test
    public void testHeightInInches() {
        HealthProfile data = new HealthProfile("tobi", "kole", "Male", 12122005, 6.2, 200);
        data.setHeightInInches();
        assertEquals(6.2, data.getHeightInInches());

    }

    @Test
    public void testWeightInPound() {
        HealthProfile data = new HealthProfile("tobi", "kole", "Male", 12122005, 6.2, 200);
        data.setWeightInPound();
        assertEquals(200, data.getWeightInInches());
    }

    @Test
    public void testForBodyMassIndex() {
        HealthProfile data = new HealthProfile("tobi", "kole", "Male", 12122005, 6.2, 200);
        data.setBodyMassIndex();
        assertEquals(3657, data.getBodyMassIndex());


    }

    @Test
    public void TestForSetAndGetName() {
        StoreData store = new StoreData();
        store.setFirstName("TIMI");
        store.setSecondName("TOE");
        assertEquals("TIMI", store.getFirstName());
        assertEquals("TOE", store.getSecondName());
    }

    @Test
    public void TestForGenderIsInputCorrectly() {
        StoreData store = new StoreData();
        store.setGender("male");
        assertEquals("male", store.getGender());
    }

    @Test
    public void testForDateOfBirth() {
        StoreData store = new StoreData();
        store.setDateOfBirth(6062022);
        assertEquals("06|06|2022", store.getDateOfBirth());
    }

    @Test
    public void currentAgeTest(){
        StoreData store = new StoreData();
        store.setAge(6062011);
        assertEquals(11, store.getAge());
    }
    @Test
    public void TestForHeightInInches(){
        StoreData store = new StoreData();
        store.setHeightInInches(6.2);
        store.setWeightInPound(200);
        assertEquals(3657, store.getBodyMassIndex());
    }
}

