// Case Study 2. Product Price Sorting
// An online shopping system maintains products containing product ID, product name, and price.
// Requirements:
// •	Sort products by price from highest to lowest. 
// •	If two products have the same price, sort them by product name alphabetically. 
// •	Display the sorted product list. 
// Example:
// Laptop    60000
// Mobile    60000
// Tablet    30000
// Mouse      1000

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class productpricecomparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if (p1.getPrice() != p2.getPrice()) {
            return p2.getPrice() - p1.getPrice(); // Sorts in descending order of price
        }
        return p1.getName().compareTo(p2.getName()); // If prices are equal, sort by name alphabetically
    }
}

public class ProductPriceSort {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 60000);
        Product p2 = new Product(2, "Mobile", 60000);
        Product p3 = new Product(3, "Tablet", 30000);
        Product p4 = new Product(4, "Mouse", 1000);

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);

        Collections.sort(productList, new productpricecomparator());

        System.out.println("Sorted product list:");
        for (Product product : productList) {
            System.out.println(product.getName() + "\t" + product.getPrice());
        }
    }
}
