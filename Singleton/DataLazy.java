package Singleton;

public class DataLazy {

    private static DataLazy dataLazy;

    private DataLazy() {
    }

    public static DataLazy getDataLazy(){

        if(dataLazy == null){
            dataLazy = new DataLazy();
        }
        return dataLazy;
    }
}
