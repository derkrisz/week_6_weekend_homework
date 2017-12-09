import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningroom;

    @Before
    public void before(){
        diningroom = new DiningRoom(30, 2, "Dining room");
    }

    @Test
    public void diningRoomHasName(){
        assertEquals("Dining room", diningroom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(30, diningroom.getCapacity());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(2, diningroom.getNumber());
    }

    @Test
    public void hasNoGuests(){
        assertEquals(0, diningroom.getGuestsNumber());
    }
}