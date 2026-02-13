package Java.Generics;

public class methods {

    // private T value;
    
    // public <T extends Number> methods(T value){
        
    // }

    // public <T extends Number> print(T value){
    //     return value;
    // }

    // public <T> void print(T value){
    //     System.out.println(value);
    // }

    public static void main(String[] args) {
        // methods m = new methods(2);
        // System.out.println();
        // m.print("Maan");
        Integer[] arr = {1,2,3,4,5,6};
        methods m1 = new methods();
        m1.Arr(arr);
    }

    public <T> void Arr(T[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
