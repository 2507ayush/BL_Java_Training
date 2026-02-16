package org.example.Services;

public class CalculatorService {

    public static int add(int a, int b)
    {
        return a+b;
    }

    public static int sub(int a, int b)
    {
        return a-b;
    }

    public static int mul(int a, int b)
    {
        return a*b;
    }

    public static int div(int a, int b)
    {
        return a/b;
    }

    public static int sum(int... numbers){
        int s=0;
        for(int i:numbers){
            s+=i;
        }
        return s;
    }
}
