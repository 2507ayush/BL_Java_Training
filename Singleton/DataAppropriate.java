package Singleton;

public class DataAppropriate {
    public static DataAppropriate dataAppropriate = new DataAppropriate();

    public static DataAppropriate getDataAppropriate() {
        return dataAppropriate;
    }
}
