import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1, 5, BedroomType.SINGLE, 30);
        bedroom2 = new Bedroom(2, 6, BedroomType.DOUBLE, 40);
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom1.getCapacity());
        assertEquals(2, bedroom2.getCapacity());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(5, bedroom1.getNumber());
        assertEquals(6, bedroom2.getNumber());
    }

    @Test
    public void hasNoGuests(){
        assertEquals(0, bedroom1.getGuestsNumber());
        assertEquals(0, bedroom2.getGuestsNumber());
    }

    @Test
    public void hasRate(){
        assertEquals(30, bedroom1.getRate(), 0.01);
        assertEquals(40, bedroom2.getRate(), 0.01);
    }

    @Test
    public void roomHasType(){
        assertEquals(BedroomType.SINGLE, bedroom1.getType());
        assertEquals(BedroomType.DOUBLE, bedroom2.getType());
    }

    @Test
    public void roomHasTypeValue(){
        assertEquals(1, bedroom1.getTypeFromEnum());
        assertEquals(2, bedroom2.getTypeFromEnum());
    }



}
