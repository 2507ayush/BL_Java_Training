package Java.Streams;

import java.util.*;
import java.util.stream.Stream;
public class intermediateOps{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ayush","Ayushi","Maan","Khushi","Tia");
        Stream<String> filtered = list.stream().filter(x -> x.startsWith("A"));
        long res = filtered.count();
        System.out.println(res);

        Stream<String> names = list.stream().map(String :: toUpperCase);
        System.out.println(names.toList());

        System.out.println(list.stream().filter(x -> x.length()<4 ).toList());

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(numbers.stream().map(x -> x*x).sorted().toList());
    }
}