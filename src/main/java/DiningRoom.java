public class DiningRoom extends Room  {

    private String name;

    public DiningRoom(int capacity, int number, String name) {
        super(capacity, number);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}