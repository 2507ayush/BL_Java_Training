package Java.Review;
public abstract class Checkpoint {
    protected String checkpointId;
    protected String locationName;
    protected double distanceFromLast;   
    protected int expectedDuration;      
    protected int actualDuration;        

    public Checkpoint(String checkpointId, String locationName,
                      double distanceFromLast, int expectedDuration, int actualDuration) {
        this.checkpointId = checkpointId;
        this.locationName = locationName;
        this.distanceFromLast = distanceFromLast;
        this.expectedDuration = expectedDuration;
        this.actualDuration = actualDuration;
    }

    public int getDelay() {
        return actualDuration - expectedDuration;
    }

    public double getDistanceFromLast() {
        return distanceFromLast;
    }

    public String getLocationName() {
        return locationName;
    }

    public abstract double calculatePenalty();
    public abstract String getType();
}
