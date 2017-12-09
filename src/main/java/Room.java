import java.util.ArrayList;

public class Room {

    private Integer capacity;
    private Integer number;
    private ArrayList<Guest> guests;

    public Room(Integer capacity, Integer number){
        this.capacity = capacity;
        this.number = number;
        this.guests = new ArrayList<>();
    }


}
