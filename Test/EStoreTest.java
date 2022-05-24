import AssignmentDen.Estore.EStore;
import AssignmentDen.Estore.User;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class EStoreTest {
    @Test
    public void Test_E_Store_Can_Be_Created() {
        EStore store = new EStore();
        assertNotNull(store);
    }
    @Test
    public void Test_E_Store_Id(){
        User id = new User();
        id.setAge(17);
        assertEquals(17, id.getAge());
        id.Password("tobi123");
        assertEquals("tobi123", id.getPassword());
        id.setEmail("koleajeolayinka@gmail.com");
        assertEquals("koleajeolayinka@gmail.com", id.getEmail());
        id.setHomeAddress("lagos");
        assertEquals("lagos", id.getHomeAddress());



    }
    @Test
    public void Test_E_Store(){

    }



}
