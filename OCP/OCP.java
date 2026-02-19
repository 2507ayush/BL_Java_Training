package SOLID.OCP;

import java.util.ArrayList;
import java.util.List;

public class OCP {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("T-Shirt", 500.0));
        cart.addProduct(new Product("Jean", 800.0));
        cart.addProduct(new Product("Shirt", 400.0));

        ShoppingCartInvoice invoice = new ShoppingCartInvoice(cart.getProducts());
        System.out.println("Invoice = ");
        invoice.PrintProducts();

        double total = cart.calculateTotal();
        System.out.println("Total = " + total);

        SaveToDB s1 = new StoreToSQL();
        SaveToDB s2 = new StoreToMongoDB();
        SaveToDB s3 = new StoreToJDBC();

        s1.Save();
        s2.Save();
        s3.Save();
    }
}

class Product{
    String name;
    double price;

    Product(String name,double price){
        this.name=name;
        this.price=price;
    }
}

class ShoppingCart{
    private List<Product> products = new ArrayList<>();

    public void  addProduct(Product product){
        products.add(product);
    }

    public List<Product> getProducts(){
        return products;
    }

    public double calculateTotal(){
        double total=0;
        for(Product product:products){
            total += product.price;
        }
        return total;
    }
}

class ShoppingCartInvoice{

    private final List<Product> products;

    public ShoppingCartInvoice(List<Product> products){
        this.products = products;
    }

    public void PrintProducts(){
        for(Product product:products){
            System.out.println(product.name);
            System.out.println(product.price);
        }
    }
}

abstract class SaveToDB{
    public abstract void Save();
}

class StoreToSQL extends SaveToDB{
    @Override
    public void Save() {
        System.out.println("Saved to SQL");
    }
}

class StoreToMongoDB extends SaveToDB{
    @Override
    public void Save() {
        System.out.println("Saved to MongoDB");
    }
}

class StoreToJDBC extends SaveToDB{
    @Override
    public void Save() {
        System.out.println("Saved to JDBC");
    }
}
