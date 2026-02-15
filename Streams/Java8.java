package Java.Streams;
import java.util.*;
// import java.util.function.Predicate;
import java.util.function.Function;

public class Java8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int x = sc.nextInt();
        //Streams

        //Java 8 -> minimal code, functional programming
        //Java 8 -> Lambda Function, Streams, Time and Date API, Functional Interface

        // Lambda Expression -> is an anonymous function (No name, No return type, no arguments)
    //     Thread t1 = new Thread(()->
    //     System.out.println("Hello")
    // );
        
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // MathOperation sum = (a , b) -> a+b;
        // MathOperation sub = (a, b) -> a-b;
        // MathOperation mult = (a, b) -> a*b;
        // MathOperation div = (a, b) -> a/b;
        // int res = sum.Operate(x,y);
        // System.out.println(res);
        // int res1 = sub.Operate(x,y);
        // System.out.println(res1);
        // int res2 = mult.Operate(x,y);
        // System.out.println(res2);
        // int res3 = div.Operate(x,y);
        // System.out.println(res3);   

        // Digits c = (a) -> {
        //     int co = 0;
        //     while(a!=0){
        //         co++;
        //         a=a/10;
        //     }
        //     return co;
        // };

        // int result = c.count(x);
        // System.out.println(result);

        //Predicate -> Functional Interface (Boolean Valued Function)
        //Agar hme kuch bhi check krna h to Predicate Functional Interface ka use krna h

        // Predicate<Integer> isEven = X -> X%2 == 0;
        // boolean res = isEven.test(x);
        // if(res){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }

        //Java8 Introduced new Function Interface 
        //Function -> 

        Function<Integer, Integer> doubleIt = X -> 2*X;
        Function<Integer, Integer> tripleIt = X -> 3*X;

        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(doubleIt.compose(tripleIt).apply(20));



        sc.close();
    }
}

// @FunctionalInterface
// interface MathOperation {
//     int Operate(int a,int b);
// }

// @FunctionalInterface
// interface Digits{
//     int count(int a);
// }
