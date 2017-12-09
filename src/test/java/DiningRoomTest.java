import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningroom;

    @Before
    public void before(){
        diningroom = new DiningRoom(30, 2, "Dining room");
    }
    
}