package SOLID.SRP;

import java.util.ArrayList;
import java.util.List;

public class SRP {
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

        ShoppingCartToDB toDB = new ShoppingCartToDB();
        toDB.SaveToDB(cart);
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

class ShoppingCartToDB{
    public void SaveToDB(ShoppingCart cart){
        System.out.println("Saved to DB");
    }
}
