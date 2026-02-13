package Java.HashMap;
import java.util.*;
public class MajorityElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int k : map.keySet()){
            if(map.get(k)>(n/3)){
                System.out.println();
                System.out.println(k);
            }           
        }
        sc.close();
    }
}
