public class ConferenceRoom extends Room {

    private String name;
    private double rate;

    public ConferenceRoom(int capacity, int number, String name, double rate) {
        super(capacity, number);
        this.name = name;
        this.rate = rate;
    }
}
