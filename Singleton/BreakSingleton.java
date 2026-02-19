package Singleton;

import java.lang.reflect.Constructor;

public class BreakSingleton {
    public static void main(String[] args) throws Exception {
        DataSafe safe = DataSafe.getData();
        System.out.println(safe.hashCode());

        //here our Singleton Pattern is broken
        Constructor<DataSafe> constructor = DataSafe.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        DataSafe safe1 = constructor.newInstance();
        System.out.println(safe1.hashCode());

        // For resolving this issue we will change the private constructor in DataSafe class.
    }
}
