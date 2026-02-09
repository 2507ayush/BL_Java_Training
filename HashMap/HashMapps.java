package Java.HashMap;
import java.util.*;
public class HashMapps{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<5;i++){
            int key = sc.nextInt();
            int val = sc.nextInt();
            map.put(key , val);
        }
        for(Integer key:map.keySet()){
            System.out.print(map.get(key));
            System.out.println();
            System.out.print(key);
        }
        sc.close();
    }
}