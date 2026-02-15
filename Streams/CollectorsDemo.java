package Java.Streams;
import java.util.*;
// import java.util.stream.Collector
import java.util.stream.Collectors;
public class CollectorsDemo{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,22,2,2,3,4,3,1,1);
        System.out.println(numbers.stream().collect(Collectors.toSet()));

        System.out.println(numbers.stream().collect(Collectors.toCollection(() -> new ArrayList<>())));

        List<String> names = Arrays.asList("Ayush","Maan");
        System.out.println(names.stream().map(String :: toUpperCase).collect(Collectors.joining()));
    }
}