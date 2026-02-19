package Singleton;

public class Singleton {
    public static void main(String[] args) {
        DataLazy lazy = DataLazy.getDataLazy();
        System.out.println(lazy.hashCode());
        DataLazy lazy2 = DataLazy.getDataLazy();
        System.out.println(lazy2.hashCode());

        DataSafe safe = DataSafe.getData();
        System.out.println(safe.hashCode());
        DataSafe safe2 = DataSafe.getData();
        System.out.println(safe2.hashCode());

        DataAppropriate appropriate = DataAppropriate.getDataAppropriate();
        System.out.println(appropriate.hashCode());
        DataAppropriate appropriate2 = DataAppropriate.getDataAppropriate();
        System.out.println(appropriate2.hashCode());

    }
}
