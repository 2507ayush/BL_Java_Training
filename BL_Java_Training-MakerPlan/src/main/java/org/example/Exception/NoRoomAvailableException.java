package Java.BL_Java_Training_MakerPlan.src.main.java.org.example.Exception;

public class NoRoomAvailableException extends RuntimeException {

    public NoRoomAvailableException(){
        super("No room Avilable");
    }
    public NoRoomAvailableException(String message) {
        super(message);
    }
}
