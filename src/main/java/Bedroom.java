public class Bedroom extends Room {

    private BedroomType type;
    private double rate;

    public Bedroom(int capacity, int number, BedroomType type, double rate) {
        super(capacity, number);
        this.type = type;
        this.rate = rate;

    }
}
