package Java.Review;
public class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String location,
                          double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    
    public double calculatePenalty() {
        return getDelay() > 30 ? 10.0 : 0;
    }

    
    public String getType() {
        return "RestCheckpoint";
    }
}
