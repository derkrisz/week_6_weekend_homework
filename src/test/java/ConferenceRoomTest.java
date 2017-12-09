import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceroom;

    @Before
    public void before(){
        conferenceroom = new ConferenceRoom(40, 2, "Conference room", 60 );

    }
    
}
