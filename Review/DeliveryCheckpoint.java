package Java.Review;
public class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String location,
                              double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    
    public double calculatePenalty() {
        int delay = getDelay();
        return delay > 0 ? delay * 2.0 : 0;
    }

    
    public String getType() {
        return "DeliveryCheckpoint";
    }
}
