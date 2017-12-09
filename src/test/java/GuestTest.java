import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        guest1 = new Guest("John Doe");
        guest2 = new Guest("Jane Doe");
    }

    @Test
    public void guestHasName(){
        assertEquals("John Doe", guest1.getName());
        assertEquals("Jane Doe", guest2.getName());
    }


}