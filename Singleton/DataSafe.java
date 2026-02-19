package Singleton;

public class DataSafe {
private static DataSafe dataSafe;

private DataSafe() {
    if(dataSafe!=null){
        throw new RuntimeException("You are trying to break the Singleton Method.");
    }
    }

    public static DataSafe getData() {

    synchronized (DataSafe.class) {
        if(dataSafe==null) {
            dataSafe = new DataSafe();
        }
    }
    return dataSafe;
    }
}
