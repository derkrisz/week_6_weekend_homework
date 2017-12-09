import java.util.ArrayList;

public class Room {

    private int capacity;
    private int number;
    private ArrayList<Guest> guests;

    public Room(int capacity, int number){
        this.capacity = capacity;
        this.number = number;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumber() {
        return number;
    }

    public int getGuestsNumber() {
        return this.guests.size();
    }
}
