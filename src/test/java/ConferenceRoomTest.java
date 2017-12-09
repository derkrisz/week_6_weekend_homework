import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceroom;

    @Before
    public void before(){
        conferenceroom = new ConferenceRoom(40, 2, "Conference room", 60 );

    }

    @Test
    public void hasCapacity(){
        assertEquals(40, conferenceroom.getCapacity());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(2, conferenceroom.getNumber());
    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("Conference room", conferenceroom.getName());
    }

    @Test
    public void hasNoGuests(){
        assertEquals(0, conferenceroom.getGuestsNumber());
    }

    @Test
    public void hasRate(){
        assertEquals(60, conferenceroom.getRate(), 0.1);
}

}
