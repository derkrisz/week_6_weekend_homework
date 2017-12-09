import java.util.ArrayList;

public class Hotel<T> {

    private String name;
    private ArrayList<T> rooms;

    public Hotel(String name){
        this.name = name;
        this.rooms = new ArrayList<T>();
    }

}
