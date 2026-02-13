package Java.Generics;

enum operate {
        ADD, SUBTRACT, MULTIPLY, DIVIDE;

        public <T extends Number> double apply(T a, T b){
            switch(this){
                case ADD:
                    return a.doubleValue() + b.doubleValue();
                case MULTIPLY:
                    return a.doubleValue() * b.doubleValue();
                case SUBTRACT:
                    return a.doubleValue() - b.doubleValue();
                case DIVIDE:
                    return a.doubleValue() / b.doubleValue();
                default:
                    throw new AssertionError("Unknown Operation" + this);
            }
        } 
    }    

public class Operation {
    public static void main(String[] args) {
        double sum = operate.ADD.apply(10,20);
        System.out.println("Sum = "+sum);
        double div = operate.DIVIDE.apply(10, 5);
        System.out.println("Division = "+div);
    }

}
