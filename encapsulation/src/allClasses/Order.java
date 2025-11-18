package allclasses;

import java.util.ArrayList;
import java.util.List;

public class Order {
    int id;
    List<Product> products = new ArrayList<>();

    public Order(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

        public void addProduct(Product p){
        products.add(p);
    }

    public double  calculateTotal(){
        double total = 0;
        for(Product p : products){
            total += p.getQuantity() * p.getUnitPrice();
        }
        return total;
    }

    public void dispalyOrder(){
        System.out.println("prder id : " + id);
        for (Product p : products) {
            p.displayProduct();
        }
        System.out.println("total: " + calculateTotal());
    }
}
