package Java.Generics;

public class GenericContainer<T> implements Container<T> {
    
    private T item;

    @Override
    public void Add(T item){
        this.item = item;        
    }

    @Override
    public T getItem(){
        return item;
    }

    public static void main(String[] args) {
        GenericContainer<String> g = new GenericContainer<>();
        g.Add("Maan");
        System.out.println(g.getItem());
    }
}
