package Java.Review;
public class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint(String id, String location,
                          double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    public double calculatePenalty() {
        return getDelay() > 0 ? 5.0 : 0;
    }

    
    public String getType() {
        return "FuelCheckpoint";
    }
}
