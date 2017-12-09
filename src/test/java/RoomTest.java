import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoomTest {

    Room room;

    @Before
    public void before(){
        room = new Room(2, 3);
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, room.getCapacity());
    }

    @Test
    public void hasNumber(){
        assertEquals(3, room.getNumber());
    }

    @Test
    public void hasnoGuests(){
        assertEquals(0, room.getGuestsNumber());
    }
}
