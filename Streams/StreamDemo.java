package Java.Streams;

import java.util.*;

public class StreamDemo{
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().filter(x -> x%2==0).count());
    }
}