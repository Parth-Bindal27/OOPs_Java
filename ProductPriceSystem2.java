// Case Study 6. Product Price System
// An online shopping system stores:
// •	Product ID 
// •	Product name 
// •	Price 
// Requirement:
// The Product class should implement Comparable<Product> and products should be sorted by price from lowest to highest.
// Example:
// Mouse       500
// Keyboard   1000
// Headphone  2000
// Laptop    50000

import java.util.*;

class Product{
    int ProductId;
    String ProductName;
    int Price;
    public Product(int ProductId, String ProductName, int Price) {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.Price = Price;
    }
}

class ProductPriceComparator implements Comparable<Product> {
    @Override
    public int compareTo(Product P1, Product P2) {
        return P1.Price - P2.Price; // Sorts in ascending order of price
    }
}

class ProductPriceSystem2 {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Mouse", 500);
        Product p2 = new Product(102, "Keyboard", 1000);
        Product p3 = new Product(103, "Headphone", 2000);
        Product p4 = new Product(104, "Laptop", 50000);

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(p1);        
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);

        

    }
}